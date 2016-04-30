/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBPCCS;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseCreate {
  public static void createDatabase() throws Exception
  {
        Connection con;
        con=MPWin.con;
      Statement stm=con.createStatement();
      stm.executeUpdate("create database pccs");
     stm.execute("use pccs");
      stm.executeUpdate("create table customer(name varchar(80) not null,account_no int unsigned,\n" +
"designation varchar(20) not null,batch_no varchar(20) ,voucher_no varchar(10) not null,\n" +
"dob date not null,doac date not null,address varchar(255),share_bal int unsigned not null,\n" +
"share_interest int unsigned not null,rdbal int unsigned not null,rd_interest int unsigned not null,\n" +
"unpaid_loan_amount int unsigned not null ,paid_interest_amount int unsigned not null,loan_installment_amount int unsigned not null,\n" +
"loan_interest_amount int unsigned not null,entry_fee smallint unsigned not null,mice smallint unsigned not null,RD_INT_YEARS smallint unsigned not null,account_status boolean not null,\n" +
"primary key(account_no))ENGINE=INNODB");
      stm.executeUpdate("create table pccs_values(pccs_id varchar(7) ,value smallint unsigned,primary key(pccs_id) )ENGINE=INNODB");
       stm.executeUpdate("create table pccs_ainfo(AINFO_TYPE varchar(4),INFO varchar(30), primary key(AINFO_TYPE))ENGINE=INNODB");
    stm.executeUpdate(" create table share(account_no int unsigned,particulars date,deposit_amount int unsigned,\n" +
"withdraw_amount int unsigned,balance int unsigned not null,\n" +
"foreign key(account_no) references customer(account_no) on DELETE RESTRICT on UPDATE CASCADE,primary key(account_no,particulars) \n" +
")ENGINE=INNODB");
    stm.executeUpdate(" create table rd(account_no int unsigned,\n" +
"particulars date,deposit_amount int unsigned,withdraw_amount int unsigned,\n" +
"balance int unsigned not null,\n" +
"foreign key(account_no) references customer(account_no) on DELETE RESTRICT on UPDATE CASCADE,primary key(account_no,particulars) )ENGINE=INNODB;  ");
     stm.executeUpdate("create table share_interest(account_no int unsigned,particulars date,deposit_interest int unsigned,withdraw_interest int unsigned,total_interest int unsigned not null,\n" +
"foreign key(account_no) references customer(account_no) on DELETE RESTRICT on UPDATE CASCADE,primary key(account_no,particulars) )ENGINE=INNODB");
      stm.executeUpdate("create table rd_interest(account_no int unsigned,particulars date,deposit_interest int unsigned,withdraw_interest int unsigned,total_interest int unsigned not null,\n" +
"foreign key(account_no) references customer(account_no) on DELETE RESTRICT on UPDATE CASCADE,primary key(account_no,particulars) )ENGINE=INNODB");
    stm.executeUpdate("create table loan_sanction( loan_sanction_date date not null,account_no int unsigned not null,\n" +
"loan_amount int unsigned not null,no_of_installments smallint not null,installment_amount int unsigned not null,\n" +
"interest_amount int unsigned not null,previous_unpaid_amount int unsigned not null,\n" +
"foreign key(account_no) references customer(account_no) on DELETE RESTRICT on UPDATE CASCADE,primary key(account_no,loan_sanction_date) )ENGINE=INNODB");
    stm.executeUpdate("create table loan_payment(particulars date not null,account_no int unsigned not null,withdraw_loan_amount int unsigned,\n" +
"installment_paid int unsigned\n" +
",remaining_loan_amount int unsigned not null,interest_paid int unsigned ,\n" +
"total_interest_paid int unsigned ,foreign key(account_no) "
            + "references customer(account_no) on DELETE RESTRICT on"
            + " UPDATE CASCADE,primary key(account_no,particulars))ENGINE=INNODB");
    
  
   
         
           
  
     
        
    
}}
