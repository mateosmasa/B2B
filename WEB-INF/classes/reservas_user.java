import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class reservas_user extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }
    
    
 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	 
      
      HttpSession session = req.getSession(true);
      String NIAKey = new String("NIA");
      String userID = (String)session.getAttribute(NIAKey);
     
       try{
		DBInteraction db = new DBInteraction();
		
		//data = db.mostrarReserva(userID);
        
	   db.close();
	
      }catch(Exception e){ }
      
      
      
     
	}//doPost end
}//class end
