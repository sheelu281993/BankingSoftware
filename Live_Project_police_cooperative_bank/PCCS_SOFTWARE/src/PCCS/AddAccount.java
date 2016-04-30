/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCCS;


import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;


public class AddAccount extends javax.swing.JDialog {
    JFormattedTextField dobTF,doacTF;
    /**
     * Creates new form AddAccount1
     * @param parent
     * @param modal
     */
    public AddAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         JSpinner.DateEditor tem_editordob=(JSpinner.DateEditor)dobSP.getEditor();
        dobTF=tem_editordob.getTextField();
         JSpinner.DateEditor tem_editordoac=(JSpinner.DateEditor)doacSP.getEditor();
        doacTF=tem_editordoac.getTextField();
        setLocation(40,40);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SpinnerDateModel modeldob=new SpinnerDateModel(new Date(),null,null,Calendar.DAY_OF_YEAR);
        dobSP = new javax.swing.JSpinner(modeldob);
        SpinnerDateModel modeldoac=new SpinnerDateModel(new Date(),null,null,Calendar.DAY_OF_YEAR);
        doacSP = new javax.swing.JSpinner(modeldoac);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        clearBt = new javax.swing.JButton();
        addRecordBT = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        recordTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recordTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        recordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Name", null},
                {"Account No", null},
                {"Designation", null},
                {"Batch No", null},
                {"Voucher No", null},
                {"Address", null},
                {"Share Balance", null},
                {"Share Interest", null},
                {"Rd Balance", null},
                {"Rd Interest", null},
                {"Unpaid Loan Amount", null},
                {"Paid Interest Amount", null},
                {"Loan Installment", null},
                {"Loan Interest Amount", null},
                {"Entry Fee", "10"},
                {"MICE", "90"}
            },
            new String [] {
                "<html><body bgcolor=yellow><B>* FIELDS</B></body></html>", "<html><body bgcolor=yellow><B>VALUE</B></body></html>"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordTable.setToolTipText("");
        recordTable.setRowHeight(22);
        recordTable.setSelectionBackground(new java.awt.Color(153, 153, 255));
        recordTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(recordTable);
        if (recordTable.getColumnModel().getColumnCount() > 0) {
            recordTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            recordTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("* All Fields are necessary to fill");

        JSpinner.DateEditor editorDOB=new JSpinner.DateEditor(dobSP,"yyyy-MM-dd");
        dobSP.setEditor(editorDOB);
        dobSP.setToolTipText("yyyy-mm-dd");
        dobSP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        JSpinner.DateEditor editorDOAC=new JSpinner.DateEditor(doacSP,"yyyy-MM-dd");
        doacSP.setEditor(editorDOAC);
        doacSP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dobSP.setToolTipText("yyyy-mm-dd");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Date Of Birth");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Date Of Account Creation");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        clearBt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        clearBt.setForeground(new java.awt.Color(51, 51, 0));
        clearBt.setText("Clear");
        clearBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtActionPerformed(evt);
            }
        });

        addRecordBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addRecordBT.setForeground(new java.awt.Color(0, 153, 0));
        addRecordBT.setText("Add Record");
        addRecordBT.setToolTipText("Add Records to Database ");
        addRecordBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addRecordBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRecordBT)
                .addGap(18, 18, 18)
                .addComponent(clearBt)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dobSP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(doacSP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doacSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dobSP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRecordBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordBTActionPerformed
        // TODO add your handling code here:
        JLabel msg_lb= new JLabel();
        msg_lb.setFont(new java.awt.Font("Times New Roman", 1, 16));
      if(checkTable())
      {
        
        int CONFIRMATION_CHECK= JOptionPane.showConfirmDialog(this,"Are you sure you want to add the Record ?","PCCS-ADD RECORD",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(CONFIRMATION_CHECK==0)
        {
            String name,designation,dob,doac,address,batch_no,voucher_no;
            short entry_fee,mice;
            int share_bal,share_int,rd_bal,rd_int,unpaid_loan,loan_ins,loan_int,account_no,paid_loan_int;
 try
            {
            name=(String) recordTable.getValueAt(0,1);
            account_no=Integer.parseInt((String)recordTable.getValueAt(1,1));
            designation=(String)recordTable.getValueAt(2,1);
            batch_no=(String)recordTable.getValueAt(3,1);
            voucher_no=(String)recordTable.getValueAt(4,1);
            dob=dobTF.getText().trim();
            doac=doacTF.getText().trim();
            address=(String)recordTable.getValueAt(5,1);
            share_bal=Integer.parseInt((String)recordTable.getValueAt(6,1));
            share_int=Integer.parseInt((String)recordTable.getValueAt(7,1));
            rd_bal=Integer.parseInt((String)recordTable.getValueAt(8,1));
            rd_int= Integer.parseInt((String)recordTable.getValueAt(9,1));
            unpaid_loan=Integer.parseInt((String)recordTable.getValueAt(10,1));
            paid_loan_int=Integer.parseInt((String)recordTable.getValueAt(11,1));
            loan_ins=Integer.parseInt((String)recordTable.getValueAt(12,1));
            loan_int=Integer.parseInt((String)recordTable.getValueAt(13,1));
            entry_fee=Short.parseShort((String)recordTable.getValueAt(14,1));
            mice=Short.parseShort((String)recordTable.getValueAt(15,1));

           
                PreparedStatement pstmCustomer =LoginPage.homepage.con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                pstmCustomer.setString(1, name);
                pstmCustomer.setInt(2, account_no);
                pstmCustomer.setString(3, designation);
                pstmCustomer.setString(4, batch_no);
                pstmCustomer.setString(5, voucher_no);
                pstmCustomer.setString(6, dob);

                pstmCustomer.setString(7,doac );
                pstmCustomer.setString(8, address);
                pstmCustomer.setInt(9, share_bal);
                pstmCustomer.setInt(10, share_int);
                pstmCustomer.setInt(11, rd_bal);
                pstmCustomer.setInt(12, rd_int);
                pstmCustomer.setInt(13, unpaid_loan);
                pstmCustomer.setInt(14,paid_loan_int );
                pstmCustomer.setInt(15, loan_ins);
                pstmCustomer.setInt(16, loan_int);
                pstmCustomer.setShort(17,entry_fee);
                pstmCustomer.setShort(18,mice);
                short RD_INT_YEARS=(short)(rd_bal/2400);
                pstmCustomer.setShort(19,RD_INT_YEARS);
                pstmCustomer.setBoolean(20,true);
                        
                int  customerFlag=pstmCustomer.executeUpdate();

                if(customerFlag!=0  )

                {
                    msg_lb.setText("<html><body>"
                        + account_no+"<br>Account Successfully added ! "+"</body></html>");
                    msg_lb.setFont(new java.awt.Font("Times New Roman", 1, 16));

                    JOptionPane.showMessageDialog(this,msg_lb,"PCCS-ADD RECORD",JOptionPane.INFORMATION_MESSAGE);
                }

            }

            catch(SQLException | NumberFormatException | HeadlessException e)
            {  msg_lb.setText("\nFailed to add the account ! ");
                JOptionPane.showMessageDialog(this,msg_lb
                    ,"PCCS-ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }}
      else
      {
          msg_lb.setText("\nFill all the Fields! ");
                JOptionPane.showMessageDialog(this,msg_lb
                    ,"PCCS-ERROR",JOptionPane.WARNING_MESSAGE);
      }
    }//GEN-LAST:event_addRecordBTActionPerformed

    private void clearBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtActionPerformed
        // TODO add your handling code here:
         int CONFIRMATION_CHECK= JOptionPane.showConfirmDialog(this,"Are you sure you want to clear the table ?","PCCS-ADD RECORD",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(CONFIRMATION_CHECK==0)
        {
        int rows=recordTable.getRowCount();
        for(int i=0;i<rows-2;i++)
        {
            recordTable.setValueAt(null,i,1);
        }
        }
    }//GEN-LAST:event_clearBtActionPerformed
public boolean checkTable()
{
    int rows=recordTable.getRowCount();
    for(int i=0;i<rows;i++)
    {
      Object value=recordTable.getValueAt(i,1);
       
         if(value==null )
        {  
            return false;
        }
       else
        {  
           String str=value.toString().trim();
                   if(str.equals(""))
                           {
                              return false; 
                           }
        }

    }
    return true;
}
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecordBT;
    private javax.swing.JButton clearBt;
    private javax.swing.JSpinner doacSP;
    private javax.swing.JSpinner dobSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable recordTable;
    // End of variables declaration//GEN-END:variables
}
