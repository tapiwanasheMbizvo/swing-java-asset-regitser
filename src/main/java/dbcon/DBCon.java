/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tmbizvo
 */
public class DBCon {
    
   
    
    String dbIp = "jdbc:sqlserver://localhost;databaseName=ophidAssetRegister";
    String username = "dbuser";
    String password = "root";
   
    
    public Connection getCon(){
        Connection dbcon = null;
        try {
            dbcon = DriverManager.getConnection(dbIp, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return dbcon;

    }
}
