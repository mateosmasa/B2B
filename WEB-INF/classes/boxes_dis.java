import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class boxes_dis extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		ArrayList data = new ArrayList();
		String nPersonas;
        String fecha;
        String horarioInicio; 
        String horarioFin;
        nPersonas = req.getParameter("Personas");
        fecha = req.getParameter("Fecha");
        horarioInicio = req.getParameter("horarioInicio").substring(0,2);
        horarioFin = req.getParameter("horarioFin").substring(0,2);
        
       try{
		DBInteraction db = new DBInteraction();
		
		data = db.findBoxes(nPersonas,fecha,horarioInicio,horarioFin);
        
		req.getRequestDispatcher("lista_boxes_disponibles.jsp").include(req, res);
	    for(int i=0;i<data.size();i++) {
			     Boxes b = (Boxes) data.get(i);
			     String id = b.getid();
			     String capacidad = b.getSize();
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("boxes_libres.jsp?id="+id+"&capacidad="+capacidad);
					boxes_disponible.include(req, res);
		}
	   db.close();
	   RequestDispatcher end=req.getRequestDispatcher("end.jsp");
	   end.include(req, res);
      }catch(Exception e){ }
	}//doPost end
}//class end
