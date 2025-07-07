
package in.gadgethub.listener;

import in.gadgethub.utility.DBUtil;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBConnectionListener implements ServletContextListener{
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctxt=sce.getServletContext();
        String dbUrl=ctxt.getInitParameter("url");
        String username=ctxt.getInitParameter("username");
        String password=ctxt.getInitParameter("password");
        DBUtil.openConnection(dbUrl, username, password);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       
    }
}
