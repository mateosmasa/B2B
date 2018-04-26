import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class confirma_reserva extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }
    
    
 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	 HttpSession session = req.getSession(true);
		String NIAKey = new String("NIA");
        String userID = (String)session.getAttribute(NIAKey);
		String horarioInicio = req.getParameter("horarioInicio");
        String horarioFin = req.getParameter("horarioFin");
        String fecha = req.getParameter("fecha");
        
     
       try{
		DBInteraction db = new DBInteraction();
		
		db.addReserva(fecha,horarioInicio,horarioFin,Fin,userID,box);
     
	    db.close();

      }catch(Exception e){ }
      
      
      
     
	}//doPost end
}//class end
