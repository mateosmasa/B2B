import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class mostrarBoxes extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		ArrayList data = new ArrayList();
		
      
       try{
		DBInteraction db = new DBInteraction();
		
		data = db.mostrarBox();
		req.getRequestDispatcher("lista_boxes.jsp").include(req, res);
	    for(int i=0;i<data.size();i++) {
			     Boxes b = (Boxes) data.get(i);
			     String id = b.getId();
			     String capacidad = b.getSize();
			      String piso = b.getPiso();
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("boxes_libres.jsp?id="+id+"&capacidad="+capacidad+"&piso="+piso);
					boxes_disponible.include(req, res);
		}
	   db.close();
	   RequestDispatcher end=req.getRequestDispatcher("end.jsp");
	   end.include(req, res);
      }catch(Exception e){ }
      
	}//doPost end
}//class end
