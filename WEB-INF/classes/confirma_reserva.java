import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 import activities.db.*;

public class confirma_reserva extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }
    
    
 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String mail = null;
		ArrayList data = new ArrayList();
		HttpSession session1 = req.getSession(true);
		String NIAKey = new String("NIA");
        String userID = (String)session1.getAttribute(NIAKey);
		String horarioInicio = req.getParameter("optradio").substring(0,2);

		String horarioFin = req.getParameter("optradio").substring(6,8);
	
        String fecha = req.getParameter("optradio").substring(12,22);
       
        String box = req.getParameter("optradio").substring(23);
        String numres = (String)req.getParameter("boton_reservar");
        System.out.println(numres);
     
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
       if("null".equals(numres)){
		   System.out.println("ENTRO");
			   try{
				DBInteraction db = new DBInteraction();
				data = db.mostrarUss();
				   for(int i=0;i<data.size();i++) { 
					   Usuarios u = (Usuarios) data.get(i);
					   String NIA = u.getNIA();
					   mail = u.getMail();
					  if(NIA.equals(userID)){        
						 break;
					 } 
				  }         
					 
						try{
								Session session = Session.getDefaultInstance(props,new Authenticator(){
								protected PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication(username, password);}});
								 Message msg = new MimeMessage(session);
								 msg.setFrom(new InternetAddress("reservas.box2box@gmail.com"));
								 msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(mail,false));
								 msg.setSubject("Reserva Confirmada");
								 msg.setText("Reserva para el día: "+fecha+" de "+horarioInicio+"-"+horarioFin+" en el Box número: "+box);
								 msg.setSentDate(new Date());
								 Transport.send(msg);
								 System.out.println("Message enviado");
								 
							  }catch (MessagingException e){ System.out.println("Error de envío: " + e);}
							      db.addReserva(fecha,horarioInicio,horarioFin,userID,box);	
				 
				 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
				 user.include(req,res);
				 db.close();
			  }catch(Exception e){ }
      }
	 else{
		 try{
				DBInteraction db = new DBInteraction();
				data = db.mostrarUss();
				   for(int i=0;i<data.size();i++) { 
					   Usuarios u = (Usuarios) data.get(i);
					   String NIA = u.getNIA();
					   mail = u.getMail();
					  if(NIA.equals(userID)){        
						 break;
					 } 
				  }         
					try{
						Session session = Session.getDefaultInstance(props,new Authenticator(){
						protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);}});
						 Message msg = new MimeMessage(session);
						 msg.setFrom(new InternetAddress("reservas.box2box@gmail.com"));
						 msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(mail,false));
						 msg.setSubject("Reserva Modificada");
						 msg.setText("Reserva para el día: "+fecha+" de "+horarioInicio+"-"+horarioFin+" en el Box número: "+box);
						 msg.setSentDate(new Date());
						 Transport.send(msg);
						 System.out.println("Message enviado");
					  }catch (MessagingException e){ System.out.println("Error de envío: " + e);}		 
	          db.modificarReserva(fecha,horarioInicio,horarioFin,box,numres);
	          	 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
				 user.include(req,res);
		 db.close();
			  }catch(Exception e){ }
      }
		 
      
   
      
     
	}//doPost end
 
	
}//class end
