/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.UserDao;
import in.gadgethub.pojo.UserPojo;
import in.gadgethub.utility.DBUtil;
import in.gadgethub.utility.MailMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author prashant yadav
 */
public class UserDaoImpl implements UserDao{
    
    //1. es email id ka koi user hai ya nhi 
    @Override
    public boolean isRegistered(String emailId) {
      Connection conn= DBUtil.provideConnection();
      boolean flag=false;
      PreparedStatement ps=null;
      ResultSet rs=null;
        try {
            ps=conn.prepareCall("select * from users where useremail=?");
            ps.setString(1, emailId);
            rs=ps.executeQuery();
            if (rs.next()) {
              flag=true;  
            }
           
        } catch (SQLException ex) {
             System.out.println("Excepiton in isRefistered: "+ex);
            ex.printStackTrace();   
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return flag;
    }
 
    
    //2.es method se user ko register krne ke liye use krenge agr phle se register than message send to already registred
    @Override
    public String registerUser(UserPojo user) {
        String status="Registration failed !";
        if(isRegistered(user.getUseremail())){
            status="Email Already Registred .Try again!";
            return status;
        }
        
       Connection conn= DBUtil.provideConnection();
       PreparedStatement ps=null;
        try {
            ps=conn.prepareCall("insert into users values(?,?,?,?,?,?)");
            ps.setString(1, user.getUseremail());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getMobile());
            ps.setString(4, user.getAddress());
            ps.setInt(5, user.getPincode());
            ps.setString(6, user.getPassword());
          
            int count= ps.executeUpdate();
            if(count==1){
            status="Registration successfully! Check your email.";
            //Code to send email
                MailMessage.registrationSuccess(user.getUseremail(), user.getUsername());
            }
        } catch (SQLException | MessagingException ex) {
             System.out.println("Excepiton in registerUser: "+ex);
            ex.printStackTrace(); 
        }
        DBUtil.closeStatement(ps);
        
        return status;
        
    }

    
//3.es method se bs itna check krenge ki user ka email id and password shi hai ya nhi
    @Override
    public String isValidCredentials(String emailId, String password) {
       Connection conn= DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String status="Login Denied. Incorrect username or password";
        try {
            ps=conn.prepareStatement("select * from users where useremail=? and password=?");
            ps.setString(1, emailId);
            ps.setString(2, password);
           rs= ps.executeQuery();
           if(rs.next()){
           status="Login Successful";
           }
           
        } catch (SQLException ex) {
            status="Error: "+ex.getMessage();
            System.out.println("Excepiton in isValidCredentials: "+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return status;
    }

    
    //4.es method se user ka all datails nikalenge database se
    @Override
    public UserPojo getUserDetails(String emailId) {
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        UserPojo user=null;
        try {
            ps=conn.prepareStatement("select * from users where useremail=?");
            ps.setString(1, emailId);
            rs= ps.executeQuery();
            if(rs.next()){
                user=new UserPojo();
                user.setUseremail(rs.getString("useremail"));
                user.setUsername(rs.getString("username"));
                user.setMobile(rs.getString("mobile"));
                user.setAddress(rs.getString("address"));
                user.setPincode(rs.getInt("pincode"));
                user.setPassword(rs.getString("password"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Excepiton in getUserDetails: "+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return user;
    }

    
    //5.user ka first name nikale hai es method se
    @Override
    public String getUserFirstName(String emailId) {
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String fName=null;
        try {
            ps=conn.prepareStatement("select username from users where useremail=?");
            ps.setString(1, emailId);
            rs= ps.executeQuery();
            if(rs.next()){
              String fullName=rs.getString(1);
              fName=fullName.split(" ")[0];
            }     
        } catch (SQLException ex) {
            System.out.println("Excepiton in getUserFirstName: "+ex);
            ex.printStackTrace();
        }
        
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return fName;
    }

    
    //6.user ka address nikalenge using this method
    @Override
    public String getUserAddr(String emailId) {
       Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String address=null;
        try {
            ps=conn.prepareStatement("select address from users where useremail=?");
            ps.setString(1, emailId);
            rs= ps.executeQuery();
            if(rs.next()){
             address=rs.getString(1);
            }     
        } catch (SQLException ex) {
            System.out.println("Excepiton in getUserAddr : "+ex);
            ex.printStackTrace();
        }

        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return address;
    }
    
    
   
}
