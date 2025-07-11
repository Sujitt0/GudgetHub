/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.servlet;

import in.gadgethub.dao.impl.OrderDaoImpl;
import in.gadgethub.dao.impl.TransactionDaoImpl;
import in.gadgethub.dao.impl.UserDaoImpl;
import in.gadgethub.pojo.OrderPojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prashant yadav
 */
public class ShippedItemServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         HttpSession session=request.getSession();
                String userName=(String)session.getAttribute("userName");
                String password=(String)session.getAttribute("password");
                String userType=(String)session.getAttribute("userType");
                if(userType==null || userName==null || password==null ){
                    response.sendRedirect("login.jsp?message=Access denied ! Please login first");
                    return;
                }else if(!userType.equalsIgnoreCase("admin")){
                 response.sendRedirect("login.jsp?message=Access denied ! Please login ad admin.");
                    return;
                }
                
        OrderDaoImpl orderDao = new OrderDaoImpl();
        TransactionDaoImpl transcationDao=new TransactionDaoImpl();
        UserDaoImpl userDao=new UserDaoImpl();
        // Fetching unshipped orders
        List<OrderPojo> orders = orderDao.getAllOrders();
        
        // Creating maps for user details
        Map<String, String> user_Id = new HashMap<>();
        Map<String, String> user_address = new HashMap<>();
        
        for (OrderPojo order : orders) {
            String transId = order.getOrderId();
            String userId =  transcationDao.getUserId(transId);
            String address = userDao.getUserAddr(userId);
            
            user_Id.put(transId, userId);
            user_address.put(userId, address);
        }
        
        // Setting attributes to send data to JSP
        request.setAttribute("orders", orders);
        request.setAttribute("user_Id", user_Id);
        request.setAttribute("user_address", user_address);
        
        // Forwarding request to JSP page
       //  RequestDispatcher rd=request.getRequestDispatcher("unshippedOrder.jsp");
      //   rd.forward(request, response);
        request.getRequestDispatcher("shippedItems.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
