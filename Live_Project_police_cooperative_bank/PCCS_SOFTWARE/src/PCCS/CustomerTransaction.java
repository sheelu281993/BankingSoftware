/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PCCS;

import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author shiva
 */
  
public class CustomerTransaction {
    Adminpage refCustomerTransaction=LoginPage.homepage;
    PreparedStatement pstmDepositOrWithdraw;
   
    
    public  int depositOrWithdraw(int account_no,String dateOfTransaction,double amount,double bal,String depositWhere,String transactionType,String balOrInt) throws SQLException
    {
            int flag;
             pstmDepositOrWithdraw=refCustomerTransaction.con.prepareStatement("insert into "+depositWhere +"(account_no,particulars,"+transactionType+","+balOrInt+") values(?,?,?,?)");
             pstmDepositOrWithdraw.setInt(1,account_no);//Deposit share table entry
             pstmDepositOrWithdraw.setString(2,dateOfTransaction);//date of account creation
             pstmDepositOrWithdraw.setDouble(3,amount);
             pstmDepositOrWithdraw.setDouble(4, bal);//deposit share bal
             flag= pstmDepositOrWithdraw.executeUpdate();//not used abhi use karna hai
             
             return flag;
    }
    
}
