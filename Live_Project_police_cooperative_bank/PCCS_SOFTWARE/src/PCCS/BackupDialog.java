/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PCCS;


import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class BackupDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     * @param parent
     * @param modal
     */
    public BackupDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation(50,50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pathTF = new javax.swing.JTextField();
        backupBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        browseBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Backup Database");
        setIconImage(new javax.swing.ImageIcon("PBIcon.png").getImage());

        backupBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backupBt.setText("Create Backup");
        backupBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupBtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Select Location where you want to store the backup file");

        browseBt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        browseBt.setText("Browse");
        browseBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pathTF)
                .addGap(18, 18, 18)
                .addComponent(browseBt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(backupBt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseBt))
                .addGap(30, 30, 30)
                .addComponent(backupBt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backupBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupBtActionPerformed
        // TODO add your handling code here:
        if(!pathTF.getText().trim().equals(""))
        {
        String location="\""+pathTF.getText().trim()+"\"";
        String username=LoginPage.loginForm.username;
        String password=LoginPage.loginForm.password;
          
  
  String executeCmd = "mysqldump -u "+username+" --password="+password+" --databases pccs >"+location+"\\backupfile_pccs.sql";
  Process runtimeProcess;
 
  try
    {
    runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", executeCmd });
    int processComplete = runtimeProcess.waitFor();
    if(processComplete == 0)
       {
           JOptionPane.showMessageDialog(this,"Backup Created Successfully !","PCCS",JOptionPane.INFORMATION_MESSAGE);
          
       }
       else
       {
         JOptionPane.showMessageDialog(this,"Couldn't Create the backup !\nAccess Denied","PCCS",JOptionPane.INFORMATION_MESSAGE);  
          
       }
    }
    catch(IOException | InterruptedException | HeadlessException ex)
    {
       JOptionPane.showMessageDialog(this,"Couldn't Create the backup !\nError","PCCS",JOptionPane.INFORMATION_MESSAGE);  
    }}
        else
        {
                 JOptionPane.showMessageDialog(this,"Please Browse the Location  !","PCCS",JOptionPane.WARNING_MESSAGE);  
  
        }
    }//GEN-LAST:event_backupBtActionPerformed

    private void browseBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtActionPerformed
        // TODO add your handling code here:
        JFileChooser jf=new JFileChooser();
    jf.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
     jf.showSaveDialog(this);
     pathTF.setText(jf.getSelectedFile()+"");
    }//GEN-LAST:event_browseBtActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backupBt;
    private javax.swing.JButton browseBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pathTF;
    // End of variables declaration//GEN-END:variables
}
