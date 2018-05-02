import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import activities.db.*;

public class cancelar_reserva extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }
    

 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String mail = null;

		HttpSession session1 = req.getSession(true);
		String NIAKey = new String("NIA");
        String userID = (String)session1.getAttribute(NIAKey);
		 
		 final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
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
		
      String numres = req.getParameter("cancelar");
       try{
		DBInteraction db = new DBInteraction();
		db.delReserva(numres);
        	 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
			     user.include(req,res);
	    db.close();

      }catch(Exception e){ }
      
      
      
     
	}//doPost end
}//class end
