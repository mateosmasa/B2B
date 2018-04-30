import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;
import java.text.*;




public class modificar_reserva extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	  String id = (String)req.getParameter("modificar").substring(0,1);
       try{
		DBInteraction db = new DBInteraction();
		req.getRequestDispatcher("formulario_modificar_box.jsp?id="+id).forward(req, res);
	    
	    db.close();
      }catch(Exception e){ }
	}//doPost end
}//class end
