/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCCS;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class updateValues {
   
    public static int updatePCCSValues(String id,short value) throws SQLException
    {
        PreparedStatement pstm_update;
        pstm_update=LoginPage.homepage.con.prepareStatement("update pccs_values set value=? "+"where pccs_id=?");
        pstm_update.setString(2,id);
        pstm_update.setShort(1,value);
      return  pstm_update.executeUpdate();
    }
}
