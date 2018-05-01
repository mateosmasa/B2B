import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
public class SendEmail extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
     final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
  // Get a Properties object
     Properties props = System.getProperties();
     props.setProperty("mail.smtp.host", "smtp.gmail.com");
     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
     props.setProperty("mail.smtp.socketFactory.fallback", "false");
     props.setProperty("mail.smtp.port", "465");
     props.setProperty("mail.smtp.socketFactory.port", "465");
     props.put("mail.smtp.auth", "true");
     props.put("mail.debug", "true");
     props.put("mail.store.protocol", "pop3");
     props.put("mail.transport.protocol", "smtp");
     final String username = "reservas.box2box@gmail.com";//
     final String password = "gentefuerte1+";
     try{
     Session session = Session.getDefaultInstance(props, 
                          new Authenticator(){
                             protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, password);
                             }});

   // -- Create a new message --
     Message msg = new MimeMessage(session);

  // -- Set the FROM and TO fields --
     msg.setFrom(new InternetAddress("reservas.box2box@gmail.com"));
     msg.setRecipients(Message.RecipientType.TO, 
                      InternetAddress.parse("@gmail.com",false));
     msg.setSubject("Hello");
     msg.setText("How are you");
     msg.setSentDate(new Date());
     Transport.send(msg);
     System.out.println("Message sent.");
  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);
  
  }
  
}
}

