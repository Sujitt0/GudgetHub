/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prashant yadav
 */
public class DBUtil {
    //first method se connection open krenge only
    private static Connection conn;
    
    public static void openConnection(String dbUrl,String username,String password){
        if(conn==null){
        try {
             conn=DriverManager.getConnection(dbUrl, username, password);
             System.out.println("Gagethub connection open");
        } catch (SQLException ex) {
            System.out.println("Error in opening connection");
            ex.printStackTrace();    
        }
    }
}
    
    //2. close connection
    
    public static void closeConnection(){
    if(conn!=null){
        try { 
          conn.close();
            System.out.println("Gagethub connectio closed!");
        } catch (SQLException ex) {
            System.out.println("Error in CLOSING connection");
            ex.printStackTrace();
        }
      }
    }
    
    //3. provide connection 
    public  static Connection provideConnection(){
        return conn;
    }
    
    //4.closeResultSet()--> this method use only for close ResultSet
    public static void closeResultSet(ResultSet rs){
       if(rs!=null){
        try { 
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error in CLOSING ResultSet");
            ex.printStackTrace();
        }
       }
    }
    
    //5.closeStatement()--> this method is used to close statement and preparedStatement both
    public static void closeStatement(Statement st){
        if(st!=null){
        try { 
            st.close();
        } catch (SQLException ex) {
            System.out.println("Error in CLOSING statement ");
            ex.printStackTrace();
        }
        }
    }
}
