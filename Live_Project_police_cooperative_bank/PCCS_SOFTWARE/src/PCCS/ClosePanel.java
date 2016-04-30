/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PCCS;

import java.awt.Color;

/**
 *
 * @author shiva
 */
public class ClosePanel extends javax.swing.JPanel {
  int Index=0;
    /**
     * Creates new form ClosePanel
     * @param TabName
     * @param Index
     */
    public ClosePanel(String TabName,int Index) {
        initComponents();
        TabNameLB.setText(TabName);
        this.Index=Index;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabNameLB = new javax.swing.JLabel();
        closeBt = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabNameLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TabNameLB.setText("Tab Name");
        TabNameLB.setOpaque(true);
        add(TabNameLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        closeBt.setBackground(new java.awt.Color(255, 255, 255));
        closeBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        closeBt.setText("X");
        closeBt.setBorderPainted(false);
        closeBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtMouseExited(evt);
            }
        });
        closeBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtActionPerformed(evt);
            }
        });
        add(closeBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtActionPerformed
        // TODO add your handling code here:
        switch(Index)
        {
            case 1:
                
          Adminpage.TabPane.remove(LoginPage.homepage.OpenAcctTb);
          LoginPage.homepage.OpenAcctBt.setEnabled(true);
           break;
                case 2:
          Adminpage.TabPane.remove(LoginPage.homepage.customer);
          LoginPage.homepage.ViewAcctBt.setEnabled(true);
         LoginPage.homepage.isViewAccActive=0;
            LoginPage.homepage.acList.ViewAccountMenuItem.setEnabled(true);
        
                break;
                    case 3:
          Adminpage.TabPane.remove(LoginPage.homepage.loanmanage);
          LoginPage.homepage.LoanBt.setEnabled(true);
           LoginPage.homepage.isLoanManageActive=0;
           LoginPage.homepage.acList.LoanManageMenuItem.setEnabled(true);
          break;
        }
    }//GEN-LAST:event_closeBtActionPerformed

    private void closeBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtMouseEntered
        // TODO add your handling code here:
        closeBt.setForeground(Color.RED);
    }//GEN-LAST:event_closeBtMouseEntered

    private void closeBtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtMouseExited
        // TODO add your handling code here:
         closeBt.setForeground(Color.BLACK);
    }//GEN-LAST:event_closeBtMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TabNameLB;
    private javax.swing.JButton closeBt;
    // End of variables declaration//GEN-END:variables
}