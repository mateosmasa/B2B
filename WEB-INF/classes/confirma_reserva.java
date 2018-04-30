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
		String box = req.getParameter("optradio").substring(0,1);
		System.out.println(box);
		String horarioInicio = req.getParameter("optradio").substring(2,4);
        String horarioFin = req.getParameter("optradio").substring(8,10);
        String fecha = req.getParameter("optradio").substring(14);
        String numres = req.getParameter("boton_reservar");
       try{
		DBInteraction db = new DBInteraction();
		if(numres == null){
		db.addReserva(fecha,horarioInicio,horarioFin,userID,box);
        	 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
			     user.include(req,res);
	    db.close();
       }else{
	    db.modificarReserva(fecha,horarioInicio,horarioFin,box,numres);	   
		 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
	     user.include(req,res);
	     db.close();  
	   }
      }catch(Exception e){ }
      
      
      
     
	}//doPost end
}//class end
