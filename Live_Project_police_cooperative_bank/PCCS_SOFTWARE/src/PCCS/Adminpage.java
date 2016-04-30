/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PCCS;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner;


public class Adminpage extends javax.swing.JFrame {
    


OpenAccount OpenAcctTb; //open account
ViewAccount customer;   //view account
LoanManage loanmanage;   //loan manage

DailyCashPyt dailycashpayWindow;//daily cash payment 
//daily cash received
IndividualLedgerDialog customerINDLEDGER;
JFormattedTextField TransactionDateFTF;//get current date

AccountList acList=new AccountList();
DailyCashRec dailycashrecWindow;
int account_noForView,account_noForLoanAManage,account_no_IL;//get account no for different forms

int isAcListActive=0,isViewAccActive=0,isLoanManageActive=0,isDCRActive=0,isDCPActive=0;//flags
 
//PCCS_VALUES
short MICE,ENTRY_FEE,LOAN_INT,RD_INT;

Connection con; //connection to database from login page

    public Adminpage() throws SQLException {
         
        initComponents();
        JSpinner.DateEditor tem_editor=(JSpinner.DateEditor)dateSpinner.getEditor();
        TransactionDateFTF=tem_editor.getTextField();
       

         }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jMenu4 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        OpenAcctBt = new javax.swing.JButton();
        ViewAcctBt = new javax.swing.JButton();
        LoanBt = new javax.swing.JButton();
        SpinnerDateModel model=new SpinnerDateModel(new Date(),null,null,Calendar.DAY_OF_YEAR);
        dateSpinner = new javax.swing.JSpinner(model);
        TabPane = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutBt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        individualLedgerBt = new javax.swing.JButton();
        accountListBt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        dailycashpytBt = new javax.swing.JButton();
        dailycashrecBt = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        updateintMenuItem = new javax.swing.JMenuItem();
        updateChargesMenuItem = new javax.swing.JMenuItem();
        backupmenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        contactUsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCCS");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon("PBIcon.png").getImage());
        setMinimumSize(new java.awt.Dimension(1024, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        OpenAcctBt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OpenAcctBt.setText("Open Account");
        OpenAcctBt.setFocusable(false);
        OpenAcctBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenAcctBtActionPerformed(evt);
            }
        });
        jPanel2.add(OpenAcctBt);

        ViewAcctBt.setBackground(new java.awt.Color(204, 204, 255));
        ViewAcctBt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ViewAcctBt.setText("View Account");
        ViewAcctBt.setFocusable(false);
        ViewAcctBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAcctBtActionPerformed(evt);
            }
        });
        jPanel2.add(ViewAcctBt);

        LoanBt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoanBt.setText("Loan");
        LoanBt.setFocusable(false);
        LoanBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanBtActionPerformed(evt);
            }
        });
        jPanel2.add(LoanBt);

        JSpinner.DateEditor editor=new JSpinner.DateEditor(dateSpinner,"yyyy-MM-dd");
        dateSpinner.setEditor(editor);
        dateSpinner.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dateSpinner.setToolTipText("yyyy-mm-dd");
        jPanel2.add(dateSpinner);

        TabPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabPane.setAlignmentX(0.0F);
        TabPane.setAlignmentY(0.0F);
        TabPane.setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cgpolice.JPG"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("  Police Co-operative Credit Society Bilaspur ");

        logoutBt.setBackground(java.awt.Color.lightGray);
        logoutBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutBt.setText("Logout");
        logoutBt.setOpaque(false);
        logoutBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtMouseExited(evt);
            }
        });
        logoutBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        individualLedgerBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        individualLedgerBt.setText("Individual Ledger");
        individualLedgerBt.setFocusable(false);
        individualLedgerBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualLedgerBtActionPerformed(evt);
            }
        });
        jPanel1.add(individualLedgerBt);

        accountListBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        accountListBt.setText(" Account List");
        accountListBt.setFocusable(false);
        accountListBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountListBtActionPerformed(evt);
            }
        });
        jPanel1.add(accountListBt);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        dailycashpytBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dailycashpytBt.setText("Daily Cash Payment");
        dailycashpytBt.setFocusable(false);
        dailycashpytBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailycashpytBtActionPerformed(evt);
            }
        });
        jPanel5.add(dailycashpytBt);

        dailycashrecBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dailycashrecBt.setText("Daily Cash Received");
        dailycashrecBt.setFocusable(false);
        dailycashrecBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailycashrecBtActionPerformed(evt);
            }
        });
        jPanel5.add(dailycashrecBt);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Add Account ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutBt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TabPane)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, 590));

        jMenu1.setText("DataBase ");

        updateintMenuItem.setText("Update Interest");
        updateintMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateintMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(updateintMenuItem);

        updateChargesMenuItem.setText("Update Charges");
        updateChargesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateChargesMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(updateChargesMenuItem);

        backupmenuItem.setText("Create BACKUP");
        backupmenuItem.setIconTextGap(0);
        backupmenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupmenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(backupmenuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        contactUsMenuItem.setText("Contact Us");
        contactUsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUsMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(contactUsMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(aboutMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean account_check(int account_noVar) throws SQLException
    {
        PreparedStatement pstFlag;
         ResultSet rs;
         pstFlag=con.prepareStatement( "select account_no from customer where account_no=?");
         pstFlag.setInt(1,account_noVar);
         rs=pstFlag.executeQuery();
          return rs.next();
   }
    private void accountListBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountListBtActionPerformed
        // TODO add your handling code here:
      if( !acList.isVisible())
        isAcListActive=0;  
        
         if(isAcListActive==0)
         {
        acList=new AccountList();
        acList.getAccountList();
        isAcListActive=1;
         }
         if(isViewAccActive==1)
         {
             acList.ViewAccountMenuItem.setEnabled(false);
             
         }
           if(isLoanManageActive==1)
         {
             acList.LoanManageMenuItem.setEnabled(false);
             
         }
       acList.setVisible(true);
    }//GEN-LAST:event_accountListBtActionPerformed

    private void ViewAcctBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAcctBtActionPerformed
        // TODO add your handling code here:
         String Acc_No=JOptionPane.showInputDialog("Enter the Customer Account No:");
       if(Acc_No!=null)
       {  Acc_No=Acc_No.trim();
           if(!Acc_No.equals(""))
       {  try{
         account_noForView=Integer.parseInt(Acc_No);
       
          boolean account_existence=account_check(account_noForView);
         if(account_existence)
         {
             
             customer=new ViewAccount();
             customer.getAccountInfo();
             TabPane.add(customer);
             TabPane.setTabComponentAt(TabPane.getTabCount()-1,new ClosePanel("  View Account ",2));
             TabPane.setSelectedComponent(customer);
             ViewAcctBt.setEnabled(false);
             isViewAccActive=1;
         }
          else
         {
            JOptionPane.showMessageDialog(null,"Invalid Account","PCCS",JOptionPane.ERROR_MESSAGE); 
            
         }
        }
         catch(SQLException | HeadlessException | NumberFormatException e)
        {
           JOptionPane.showMessageDialog(null,"Enter the account No !","PCCS",JOptionPane.ERROR_MESSAGE); 
        
                
       }
       }
      else
       {
         JOptionPane.showMessageDialog(null,"Enter the account no","PCCS",JOptionPane.ERROR_MESSAGE);   
       }
       }    
    }//GEN-LAST:event_ViewAcctBtActionPerformed

    private void OpenAcctBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenAcctBtActionPerformed
      OpenAcctBt.setEnabled(false);
      OpenAcctTb=new OpenAccount();
     TabPane.add(OpenAcctTb);
     TabPane.setTabComponentAt(TabPane.getTabCount()-1,new ClosePanel("  Open Account ",1));
     TabPane.setSelectedComponent(OpenAcctTb);
   
// TODO add your handling code here:
    }//GEN-LAST:event_OpenAcctBtActionPerformed

    private void dailycashpytBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailycashpytBtActionPerformed
   
        if(isDCPActive==0)
        {
            dailycashpayWindow=new DailyCashPyt();
            
            isDCPActive=1;
        }
        dailycashpayWindow.setVisible(true);
 
    }//GEN-LAST:event_dailycashpytBtActionPerformed

    private void individualLedgerBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualLedgerBtActionPerformed
        // TODO add your handling code here:
        String  Acc_no=JOptionPane.showInputDialog("Enter the Customer Account No:");
     if(Acc_no!=null)
     {
        Acc_no=Acc_no.trim();
          if(!Acc_no.equals(""))
          {
              try{
       account_no_IL=Integer.parseInt(Acc_no);
      
       
     boolean  account_existence=account_check(account_no_IL);
      
       if(account_existence)
       {    
           customerINDLEDGER=new IndividualLedgerDialog(this,true);
           Calendar cal=Calendar.getInstance();
          int CURRENT_YEAR=cal.get(Calendar.YEAR);
        int CURRENT_MONTH=cal.get(Calendar.MONTH);
        
        if(CURRENT_MONTH>=0 && CURRENT_MONTH<=2){
            customerINDLEDGER.FromDateTF.setText((CURRENT_YEAR-1)+"-04-01");
             customerINDLEDGER.ToDateTF.setText((CURRENT_YEAR)+"-03-31");
        }
        else
        {
           customerINDLEDGER.FromDateTF.setText((CURRENT_YEAR)+"-04-01");
             customerINDLEDGER.ToDateTF.setText((CURRENT_YEAR+1)+"-03-31");
        }
       
       customerINDLEDGER.getIndividualLedger();
       customerINDLEDGER.setVisible(true);
    
       }
        else
       {
           JOptionPane.showMessageDialog(null,"Invalid Account","PCCS",JOptionPane.ERROR_MESSAGE);
       }
       }
       catch(SQLException | HeadlessException |NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"PCCS Error !"+e,"PCCS-ERROR",JOptionPane.ERROR_MESSAGE);
        }
         }
         else
         {
              JOptionPane.showMessageDialog(null,"Enter the account no","PCCS",JOptionPane.ERROR_MESSAGE);
         }
     }
    }//GEN-LAST:event_individualLedgerBtActionPerformed

    private void LoanBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanBtActionPerformed
        // TODO add your handling code here:
      
       
      String  Acc_no1=JOptionPane.showInputDialog("Enter the Customer Account No:");
     if(Acc_no1 !=null)
     { 
         Acc_no1=Acc_no1.trim();
         if(!Acc_no1.equals(""))
       {
           try{
       account_noForLoanAManage=Integer.parseInt(Acc_no1);
      
       
       boolean account_existence=account_check(account_noForLoanAManage);
       
       if(account_existence)
       {  loanmanage=new LoanManage();
          loanmanage.getLoanInfo();
          TabPane.add(loanmanage);
          TabPane.setTabComponentAt(TabPane.getTabCount()-1,new ClosePanel(" Loan Manage",3));
          TabPane.setSelectedComponent(loanmanage);
            LoanBt.setEnabled(false);
          isLoanManageActive=1;
        }
        else
       {
           JOptionPane.showMessageDialog(null,"Invalid Account","PCCS",JOptionPane.ERROR_MESSAGE);
       }
       }
       catch(SQLException | HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"    Error !","PCCS",JOptionPane.ERROR_MESSAGE);
        }
       }
       else
       {
          JOptionPane.showMessageDialog(null,"Enter the account no","PCCS",JOptionPane.ERROR_MESSAGE);  
       }
     }
      
    }//GEN-LAST:event_LoanBtActionPerformed

    private void logoutBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtActionPerformed
    try {
        // TODO add your handling code here:
        con.close();
       
       if(LoginPage.homepage.dailycashpayWindow!=null)
               {
                   LoginPage.homepage.dailycashpayWindow.dispose();
               }
       if(LoginPage.homepage.dailycashrecWindow!=null)
               {
                   LoginPage.homepage.dailycashrecWindow.dispose();
               }
       acList.dispose();
               
        LoginPage.homepage.dispose();
        LoginPage.loginForm.pack();
        LoginPage.loginForm.setVisible(true);
    } catch (SQLException ex) {
        
    }
    }//GEN-LAST:event_logoutBtActionPerformed

    private void logoutBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtMouseEntered
        // TODO add your handling code here:
        logoutBt.setForeground(Color.RED);
    }//GEN-LAST:event_logoutBtMouseEntered

    private void logoutBtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtMouseExited
        // TODO add your handling code here:
          logoutBt.setForeground(Color.BLACK);
    }//GEN-LAST:event_logoutBtMouseExited

    private void backupmenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupmenuItemActionPerformed
     new BackupDialog(this,true).setVisible(true);
         
        
    }//GEN-LAST:event_backupmenuItemActionPerformed

    private void dailycashrecBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailycashrecBtActionPerformed
        // TODO add your handling code here:
        if(isDCRActive==0)
        {
            dailycashrecWindow=new DailyCashRec();
            
            isDCRActive=1;
        }
        dailycashrecWindow.setVisible(true);
         
    }//GEN-LAST:event_dailycashrecBtActionPerformed
    
    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
         new AboutPCCS(this,true).setVisible(true);
                                            
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void contactUsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsMenuItemActionPerformed
        // TODO add your handling code here:
         new HelpPCCS(this,true).setVisible(true);
    }//GEN-LAST:event_contactUsMenuItemActionPerformed

    private void updateChargesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateChargesMenuItemActionPerformed
        // TODO add your handling code here:
      
         UpdateChargesDialog UCD=new UpdateChargesDialog(this,true);
          UCD.EFTF.setText(""+ENTRY_FEE);
          UCD.miceTF.setText(""+MICE);
         UCD.setVisible(true);
      
    }//GEN-LAST:event_updateChargesMenuItemActionPerformed

    private void updateintMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateintMenuItemActionPerformed
        // TODO add your handling code here:
       
        UpdateInterestDialog UID=new UpdateInterestDialog(this,true);
        UID.rdintTF.setText(""+RD_INT);
        UID.loanintTF.setText(""+LOAN_INT);
        UID.setVisible(true);
       
    }//GEN-LAST:event_updateintMenuItemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      AddAccount addRecord=new AddAccount(this,true);
         addRecord.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


public void setPCCCS_VALUES() throws SQLException
{
          
               Statement    stm=con.createStatement();
           ResultSet rs=stm.executeQuery("select value from PCCS_VALUES where pccs_id='RI_PCCS'");
           if(rs.next())
           {
               RD_INT=rs.getShort(1);
           }
            rs.close();
           rs=stm.executeQuery("select value from PCCS_VALUES where pccs_id='LI_PCCS'");
           if(rs.next())
           {
               LOAN_INT=rs.getShort(1);
           }
            rs.close();
           rs=stm.executeQuery("select value from PCCS_VALUES where pccs_id='MI_PCCS'");
           if(rs.next())
           {
               MICE=rs.getShort(1);
           }
            rs.close();
           rs=stm.executeQuery("select value from PCCS_VALUES where pccs_id='EF_PCCS'");
           
           if(rs.next())
           {
               ENTRY_FEE=rs.getShort(1);
           }
           rs.close();
           stm.close();
          
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton LoanBt;
    javax.swing.JButton OpenAcctBt;
    static javax.swing.JTabbedPane TabPane;
    javax.swing.JButton ViewAcctBt;
    private javax.swing.JMenuItem aboutMenuItem;
    static javax.swing.JButton accountListBt;
    private javax.swing.JMenuItem backupmenuItem;
    private javax.swing.JMenuItem contactUsMenuItem;
    private javax.swing.JButton dailycashpytBt;
    private javax.swing.JButton dailycashrecBt;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JButton individualLedgerBt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logoutBt;
    private javax.swing.JMenuItem updateChargesMenuItem;
    private javax.swing.JMenuItem updateintMenuItem;
    // End of variables declaration//GEN-END:variables

}
