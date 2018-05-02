import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class mostrarIncidencias extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		ArrayList data = new ArrayList();
		
      
       try{
		DBInteraction db = new DBInteraction();
		
		data = db. mostrarIncidencias();
		req.getRequestDispatcher("lista_incidencias.jsp").include(req, res);
	    for(int i=0;i<data.size();i++) {
			     Incidencias r = (Incidencias) data.get(i);
			     String id = r.getId();
			     String cause = r.getCause();
			     String description = r.getDescription();
			     String id_reserva = r.getId_Reserv();
			 			
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("incidencias_libres.jsp?id="+id+"&cause="+cause+"&description="+description+"&id_reserva="+id_reserva);
					boxes_disponible.include(req, res);
		}
	   db.close();
	   RequestDispatcher end=req.getRequestDispatcher("end.jsp");
	   end.include(req, res);
      }catch(Exception e){ }
      
	}//doPost end
}//class end
