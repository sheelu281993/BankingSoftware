/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBPCCS;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class RecoveryDialog extends javax.swing.JDialog {

    /**
     * Creates new form RecoveryDialog
     * @param parent
     * @param modal
     */
    public RecoveryDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
           Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/6,size.height/8);  
       
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
        recoveryBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        browseBt = new javax.swing.JButton();
        userTF = new javax.swing.JTextField();
        PassTF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recovery Database");
        setIconImage(new javax.swing.ImageIcon("PBIcon.png").getImage());

        recoveryBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        recoveryBt.setText("Recover Database");
        recoveryBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoveryBtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Select Location of backup file to recover the database");

        browseBt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        browseBt.setText("Browse");
        browseBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTF, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(PassTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(browseBt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recoveryBt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(recoveryBt)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recoveryBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoveryBtActionPerformed
        // TODO add your handling code here:
        if(!pathTF.getText().trim().equals(""))
        {
        String USER=userTF.getText().trim();
        String PASS=pathTF.getText().trim();
        int FLAG_CU=1;
        try
        {
        
            Statement stm=MPWin.con.createStatement();
      FLAG_CU=stm.executeUpdate("create user \'"+USER+"\' identified by \'"+PASS+"\'");
      if(FLAG_CU==0)
      {
          
             String location="\""+pathTF.getText().trim()+"\"";
      
     String executeCmd = "mysql -u root --password="+MPWin.masPass+" <"+location;
        Process runtimeProcess;
       
            runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", executeCmd });
            int processComplete = runtimeProcess.waitFor();
            if(processComplete == 0)
            {
                JOptionPane.showMessageDialog(this,"Restored the Backup !","PCCS",JOptionPane.INFORMATION_MESSAGE);

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Couldn't Restore the backup !\n","PCCS",JOptionPane.INFORMATION_MESSAGE);

            }
       stm.execute("grant all on pccs.* to \'"+USER+"\'");
         stm.close();
       PreparedStatement   pstm_update  =MPWin.con.prepareStatement("update pccs_ainfo set info=? where ainfo_type=? ");
                pstm_update.setString(2,"USER");
                pstm_update.setString(1,USER);
                pstm_update.executeUpdate();
                pstm_update.close();
              pstm_update=MPWin.con.prepareStatement("update pccs_ainfo set info=? where ainfo_type=? ");
                pstm_update.setString(2,"PASS");
                pstm_update.setString(1,PASS);
                pstm_update.executeUpdate();
                pstm_update.close();
      
         
     
      }
   
        }
        catch(IOException | InterruptedException | HeadlessException |SQLException ex)
        {
            if(FLAG_CU==1)
            {
                          JOptionPane.showMessageDialog(this,"Invalid User!\nError","PCCS",JOptionPane.ERROR_MESSAGE);
  
            }
            else
            {
            JOptionPane.showMessageDialog(this,"Couldn't Restote the backup !\nError","PCCS",JOptionPane.ERROR_MESSAGE);
        }}
        }
        else
        {
                     JOptionPane.showMessageDialog(this,"Browse the location !","PCCS",JOptionPane.WARNING_MESSAGE);
   
        }
    }//GEN-LAST:event_recoveryBtActionPerformed

    private void browseBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtActionPerformed
        // TODO add your handling code here:
        JFileChooser jf=new JFileChooser();
        jf.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
        jf.showSaveDialog(this);
        pathTF.setText(jf.getSelectedFile()+"");
    }//GEN-LAST:event_browseBtActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassTF;
    private javax.swing.JButton browseBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField pathTF;
    private javax.swing.JButton recoveryBt;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
