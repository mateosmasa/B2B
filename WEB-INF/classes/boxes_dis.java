import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;
import java.text.*;




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
        String numres;
        nPersonas = req.getParameter("Personas");
        fecha = req.getParameter("Fecha");
        horarioInicio = req.getParameter("horarioInicio");
        horarioFin = req.getParameter("horarioFin");
        numres = req.getParameter("modificar");
         
       try{
		DBInteraction db = new DBInteraction();
		
		data = db.findBoxes(nPersonas,fecha,horarioInicio.substring(0,2),horarioFin.substring(0,2));
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd"); 
		Date date = dt.parse(fecha); 
		SimpleDateFormat dt1 = new SimpleDateFormat("dd/mm/yyyy");
		String fecha1 = dt1.format(date);
		req.getRequestDispatcher("lista_boxes_disponibles.jsp?horarioInicio="+horarioInicio+"&horarioFin"+horarioFin+"&fecha="+fecha1).include(req, res);

	    for(int i=0;i<data.size();i++) {
			     Boxes b = (Boxes) data.get(i);
			     String id = b.getId();
			     String capacidad = b.getSize();
			     String piso = b.getPiso();
			       
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("boxes_libres.jsp?id="+id+"&piso="+piso+"&capacidad="+capacidad);
					boxes_disponible.include(req, res);
			
					
					
		}
	   db.close();
	   RequestDispatcher end=req.getRequestDispatcher("end.jsp?numres="+numres);
	   end.include(req, res);
      }catch(Exception e){ }
	}//doPost end
}//class end
