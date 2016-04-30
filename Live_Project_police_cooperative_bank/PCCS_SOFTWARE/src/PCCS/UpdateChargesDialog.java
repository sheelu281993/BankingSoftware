/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCCS;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UpdateChargesDialog extends javax.swing.JDialog {

    /**
     * Creates new form UpdateInterestDialog
     * @param parent
     * @param modal
     */
    public UpdateChargesDialog(java.awt.Frame parent, boolean modal) {
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

        EFTF = new javax.swing.JTextField();
        miceTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upadte_chargesBt = new javax.swing.JButton();
        typecb = new javax.swing.JComboBox();
        refreshBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Interest");
        setIconImage(new javax.swing.ImageIcon("PBIcon.png").getImage());

        EFTF.setEditable(false);
        EFTF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EFTF.setForeground(new java.awt.Color(153, 0, 0));
        EFTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        miceTF.setEditable(false);
        miceTF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miceTF.setForeground(new java.awt.Color(153, 0, 0));
        miceTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("ENTRY FEE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("MICE");

        upadte_chargesBt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upadte_chargesBt.setText("Update");
        upadte_chargesBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upadte_chargesBtActionPerformed(evt);
            }
        });

        typecb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "ENTRY FEE", "MICE" }));
        typecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecbActionPerformed(evt);
            }
        });

        refreshBt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        refreshBt.setText("Refresh");
        refreshBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EFTF, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(miceTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upadte_chargesBt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typecb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(refreshBt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EFTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(typecb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upadte_chargesBt)
                    .addComponent(miceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecbActionPerformed
        // TODO add your handling code here:
        if(typecb.getSelectedIndex()==1)
        {
            EFTF.setEditable(true);
             miceTF.setEditable(false);
        }
          if(typecb.getSelectedIndex()==2)
        {
            miceTF.setEditable(true);
             EFTF.setEditable(false);
        }
         if(typecb.getSelectedIndex()==0)
          {
              EFTF.setEditable(false); 
               miceTF.setEditable(false);
          }
    }//GEN-LAST:event_typecbActionPerformed

    private void refreshBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtActionPerformed
        // TODO add your handling code here:
        EFTF.setText(""+LoginPage.homepage.ENTRY_FEE);
        miceTF.setText(""+LoginPage.homepage.MICE);
        
    }//GEN-LAST:event_refreshBtActionPerformed

    private void upadte_chargesBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upadte_chargesBtActionPerformed
        // TODO add your handling code here:
         if(typecb.getSelectedIndex()==1)
        {  int CONFIRMATION_CHECK= JOptionPane.showConfirmDialog(this,"Are you sure you want to update Entry Fee charge","PCCS-Update Entry Fee",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(CONFIRMATION_CHECK==0)
        {
            try
            {
                short NEWENTRY_FEE=Short.parseShort(EFTF.getText().trim());
             int FLAG= updateValues.updatePCCSValues("EF_PCCS",NEWENTRY_FEE);
           
             if(FLAG==1)
             {  
                 LoginPage.homepage.ENTRY_FEE=NEWENTRY_FEE;
                 EFTF.setEditable(false);
                 typecb.setSelectedIndex(0);
                 JOptionPane.showMessageDialog(this,"Entry Fee charge Updated successfully ! " ,"PCCS-Update Entry Fee",JOptionPane.INFORMATION_MESSAGE);  
                 
             }
             else
             {
                JOptionPane.showMessageDialog(this,"Error related to Database \"PCCS\"" ,"PCCS-Update Entry Fee",JOptionPane.ERROR_MESSAGE);   
             }
            
            }
            catch(SQLException e)
            {
               JOptionPane.showMessageDialog(this,"Error related to Database \"PCCS\"" ,"PCCS-Update Entry Fee",JOptionPane.ERROR_MESSAGE);  
            }
        }
        }
        
        //loan interest
     if(typecb.getSelectedIndex()==2)
      {
            int CONFIRMATION_CHECK= JOptionPane.showConfirmDialog(this,"Are you sure you want to update Mice charge","PCCS-Update Mice",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(CONFIRMATION_CHECK==0)
        {
            try
            {
                  
                short NEWMICE=Short.parseShort(miceTF.getText().trim());
             int FLAG= updateValues.updatePCCSValues("MI_PCCS",NEWMICE);
           
             if(FLAG==1)
             {  
                 LoginPage.homepage.MICE=NEWMICE;
                 miceTF.setEditable(false);
                 typecb.setSelectedIndex(0);
                 JOptionPane.showMessageDialog(this,"Mice charge Updated successfully ! " ,"PCCS-Update Mice",JOptionPane.INFORMATION_MESSAGE);  
                 
             }
             else
             {
                JOptionPane.showMessageDialog(this,"Error related to Database \"PCCS\"" ,"PCCS-Update Mice",JOptionPane.ERROR_MESSAGE);   
             }
        }
            
            catch(SQLException e)
            {
               JOptionPane.showMessageDialog(this,"Error related to Database \"PCCS\"" ,"PCCS-Update Mice",JOptionPane.ERROR_MESSAGE);  
            }
        }
        }
    }//GEN-LAST:event_upadte_chargesBtActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField EFTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    javax.swing.JTextField miceTF;
    private javax.swing.JButton refreshBt;
    private javax.swing.JComboBox typecb;
    private javax.swing.JButton upadte_chargesBt;
    // End of variables declaration//GEN-END:variables
}