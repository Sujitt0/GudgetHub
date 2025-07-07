/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.utility;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.internet.MimeUtility;


/**
 *
 * @author prashant yadav
 */

public class  MailMessage {
    
    //1.
      public static void registrationSuccess(String recipientMailId, String name) throws MessagingException {
//         try {
//        String subject = MimeUtility.encodeText("❤🌟 Welcome to GADGETHUB(DEVELOPED BY PRASHANT YADUVANSHI)❤🌟 Registration Successful", "UTF-8", "B");
//        
//        String htmlTextMessage = "<html><body>"
//                + "<h2 style='color:green;'>Welcome to " + AppInfo.appName + "</h2>"
//                + "Hi " + name + ",<br><br>"
//                + "Thanks for signing up with " + AppInfo.appName + ".<br>"
//                + "We are glad that you chose us. We invite you to check out our latest collection of new electronic appliances."
//                + "<br>We are providing up to 60% OFF on most of the electronic gadgets. So please visit our site and explore the collections."
//                + "<br><br>Our Online electronics is growing in a larger amount these days, and we are in high demand. So we thank all of you for "
//                + "making us reach that level. We deliver products to your house with no extra delivery charges, and we also have a collection of the most "
//                + "branded items.<br><br>As a welcome gift for our new customers, we are providing an additional 10% OFF up to 500 Rs for the first product purchase. "
//                + "<br>To avail of this offer, you only have "
//                + "to enter the promo code given below.<br><br><br> PROMO CODE: " + AppInfo.appName.toUpperCase() + "500<br><br><br>"
//                + "Have a good day!<br></body></html>";
//
//        JavaMailUtil.sendMail(recipientMailId, subject, htmlTextMessage);
//    } catch (UnsupportedEncodingException e) {
//        e.printStackTrace();
//    }


  try {
        String subject = MimeUtility.encodeText("🎉❤ Welcome to GADGETHUB (DEVELOPED BY PRASHANT YADUVANSHI) - Registration Successful! 🎊", "UTF-8", "B");

        String htmlTextMessage = "<html><body>"
                + "<h2 style='color:green;'>&#128640; Welcome to " + AppInfo.appName + "!</h2>"  // 🚀 (Rocket)
                + "<p>Hey " + name + ",</p>"
                + "<p>&#127881; Thank you for signing up with <b>" + AppInfo.appName + "</b>! We are thrilled to have you on board. &#127882;</p>"  // 🎉 🎊
                + "<p>&#128717; Get ready to explore our latest collection of <b>electronics & gadgets</b> at unbeatable prices! We are offering up to <b>60% OFF</b> on most products.</p>"  // 🛍️
                + "<p>&#128161; <b>Why Choose Us?</b></p>"  // 💡
                + "<ul>"
                + "<li>&#128230; <b>Fast & Free Delivery:</b> No extra delivery charges on your orders.</li>"  // 📦
                + "<li>&#128293; <b>Latest & Branded Items:</b> A wide range of top-quality electronic gadgets.</li>"  // 🔥
                + "<li>&#127873; <b>Special Welcome Gift:</b> Get an additional <b>10% OFF (up to ₹500)</b> on your first purchase!</li>"  // 🎁
                + "</ul>"
                + "<p>&#128179; <b>Promo Code:</b> <span style='color:red; font-size:18px;'>" + AppInfo.appName.toUpperCase() + "500</span></p>"  // 💳
                + "<p>&#128279; <b>Start Shopping Now:</b> Visit our website and grab your favorite gadgets!</p>"  // 🔗
                + "<br>&#128640; Happy Shopping!<br>Best Regards, <br> The <b>" + AppInfo.appName + "</b> Team"
                 + "<br><br><hr>"
                + "<p>&#127760; Visit on developer website: <a href='https://prashantyaduvanshi.netlify.app/'  style='color:green; text-decoration:none;'><b>DEVELOPED BY PRASHANT YADAV</b></a></p>"  
               
                + "</body></html>";

        JavaMailUtil.sendMail(recipientMailId, subject, htmlTextMessage);
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    }
      
      
      public static void transactionSuccess(String recipientEmail,String name, String transactionId ,double totalAmount)throws MessagingException{
      
          try {
        String subject = MimeUtility.encodeText("🎉❤ Welcome to GADGETHUB (DEVELOPED BY PRASHANT YADUVANSHI) - 🛒 Order Placed Successfully 🎊 ", "UTF-8", "B");  // 🛒

        String htmlTextMessage = "<html><body>"
                + "<h2 style='color:green;'>&#128079; Thank You for Your Purchase, " + name + "!</h2>"  // 👏
                + "<p>Dear " + name + ",</p>"
                + "<p>We are excited to inform you that your order has been successfully placed with <b>" + AppInfo.appName + "</b>. Your transaction details are as follows:</p>"
                + "<br><b>Transaction ID:</b> " + transactionId
                + "<br><b>Total Amount Paid:</b> &#8377;" + totalAmount
                + "<br><br>Your order is now being processed, and you will receive a notification once it is shipped. You can track your order in your account dashboard."
                + "<br><br>&#128230; <b>Fast & Free Delivery:</b> We ensure quick and safe delivery of your products right at your doorstep with no extra charges!"  // 📦
                + "<br><br>&#127873; <b>Special Offer for You:</b> As a valued customer, enjoy an exclusive <b>10% OFF on your next purchase</b>! Use the promo code <b>"  
                + AppInfo.appName.toUpperCase() + "NEXT10</b> during checkout."  // 🎁
                + "<br><br>&#128161; <b>Stay Updated:</b> Check out our latest arrivals and exciting discounts on premium electronic gadgets!"  // 💡
                + "<br><br>Thank you for choosing <b>" + AppInfo.appName + "</b>. We appreciate your trust in us!"
                + "<br><br>&#128233; <b>Need Help?</b> Contact our support team anytime!"  // 📩
                + "<br><br>Thank You for Shopping with GADGETHUB! <br><br>"
                + "Have a great day! &#128522;<br>"
                 + "<br><br><hr>"
               + "<p>&#127760; Visit on developer website: <a href='https://prashantyaduvanshi.netlify.app/'  style='color:green; text-decoration:none;'><b>DEVELOPED BY PRASHANT YADAV</b></a></p>"  
               
                + "</body></html>";  // 😊

        JavaMailUtil.sendMail(recipientEmail, subject, htmlTextMessage);
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }  
      }
      
      
      
      //3. shipped order
      
      public static void orderShipped(String recipientEmail, String name, String orderId,String prodName,String prodType,String prodInfo) throws MessagingException {
    try {
        String subject = MimeUtility.encodeText("🚚 Your Order from GADGETHUB has been Shipped! 📦", "UTF-8", "B");

        String htmlTextMessage = "<html><body>"
                + "<h2 style='color:green;'>&#9989; Great News, " + name + "! Your Order is on the Way! 🚚</h2>" // ✅
                + "<p>Dear " + name + ",</p>"
                + "<p>We are happy to inform you that your order with <b>" + AppInfo.appName + "</b> has been shipped successfully.</p>"
                + "<br><b>Order ID:</b> " + orderId
                + "<br><b>Product Name:</b> " + prodName
                + "<br><b>Product Type:</b> " + prodType
                + "<br><b>Product Details:</b> " + prodInfo
                + "<br><br>&#128230; <b>What’s Next?</b>"
                + "<ul>"
                + "<li>Your package will arrive soon! Keep an eye on your delivery updates.</li>"
                + "<li>If you have any concerns, feel free to contact our support team.</li>"
                + "</ul>"
                + "<br>&#128179; <b>Special Offer:</b> Enjoy <b>10% OFF on your next purchase</b> with promo code <b>" + AppInfo.appName.toUpperCase() + "NEXT10</b>."
                + "<br><br>Thank you for shopping with <b>" + AppInfo.appName + "</b>. We appreciate your trust in us!"
                + "<br><br>&#128233; <b>Need Help?</b> Contact our support team anytime!"
                + "<br><br>📦 Happy Shopping!<br>"
                + "<br><br><hr>"
                + "<p>&#127760; Visit Developer Website: <a href='https://prashantyaduvanshi.netlify.app/' style='color:green; text-decoration:none;'><b>DEVELOPED BY PRASHANT YADUVANSHI</b></a></p>"
                + "</body></html>";   

        JavaMailUtil.sendMail(recipientEmail, subject, htmlTextMessage);
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
      
      }   
}
