import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class mostrarReservas extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		ArrayList data = new ArrayList();
		
      
       try{
		DBInteraction db = new DBInteraction();
		
		data = db.mostrarReservas();
		req.getRequestDispatcher("lista_reservas.jsp").include(req, res);
	    for(int i=0;i<data.size();i++) {
			     Reserva r = (Reserva) data.get(i);
			     String id = r.getId();
			     String fecha = r.getFecha();
			     String hora_inicio = r.getHorarioInicio();
			     String hora_fin = r.getHorarioFin();
			     String nia_usuario = r.getUser_NIA();
			     String box_id = r.getBox_id();
			
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("reservas_libres.jsp?id="+id+"&fecha="+fecha+"&hora_inicio="+hora_inicio+"&hora_fin="+hora_fin+"&nia_usuario="+nia_usuario+"&box_id="+box_id);
					boxes_disponible.include(req, res);
		}
	   db.close();
	   RequestDispatcher end=req.getRequestDispatcher("end.jsp");
	   end.include(req, res);
      }catch(Exception e){ }
      
	}//doPost end
}//class end
