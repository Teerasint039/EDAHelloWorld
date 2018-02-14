/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {
    private int ID;
    private String message;            
   
    public Hello() {
    }
    
    public Hello(ResultSet rs) throws SQLException {//orm
      ID = rs.getInt("ID");
      message = rs.getString("Message");
    }

    
    
    public int getID() {
        return ID;
    }

    public String getMessage() {
        return message;
    }
    
   
}
