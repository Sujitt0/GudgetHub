/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.listener;

import in.gadgethub.utility.DBUtil;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author prashant yadav
 */
public class DBConnectionListener implements ServletContextListener{      

    @Override
    public void contextInitialized(ServletContextEvent sce) {
   
      ServletContext  ctxt = sce.getServletContext();
      String url=ctxt.getInitParameter("url");
      String username=ctxt.getInitParameter("username");
      String password=ctxt.getInitParameter("password");

        DBUtil.openConnection(url, username, password);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       DBUtil.closeConnection();
    }
 
}
