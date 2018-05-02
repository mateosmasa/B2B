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
	 
      ArrayList data = new ArrayList();
      HttpSession session = req.getSession(true);
      String NIAKey = new String("NIA");
      String userID = (String)session.getAttribute(NIAKey);
     
       try{
		DBInteraction db = new DBInteraction();
		
	   data = db.mostrarReserva(userID);
	   
	   req.getRequestDispatcher("lista_boxes_reservados.jsp").include(req, res);
	    for(int i=0;i<data.size();i++) {
			     Reserva r = (Reserva) data.get(i);
			     String fecha = r.getFecha();
			     String box = r.getBox_id();
			     String numres = r.getId();
			     String horarioInicio = r.getHorarioInicio();
			     System.out.println(horarioInicio);
			     String horarioFin = r.getHorarioFin();
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("reservas_users_list.jsp?numres="+numres+"&fecha="+fecha+"&horarioInicio="+horarioInicio+"&horarioFin="+horarioFin+"&box="+box);
					boxes_disponible.include(req, res);
		}
        
	  
	   
	   RequestDispatcher end=req.getRequestDispatcher("end_2.jsp");
	   end.include(req, res);
	   db.close();
      }catch(Exception e){ }
      
  
      
     
	}//doPost end
}//class end
