import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class eliminarReserva extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
      String nia = req.getParameter("id").toString();
    
       try{
		DBInteraction db=new DBInteraction();
		db.delReserva(nia);
		 req.getRequestDispatcher("adminReservas.html").include(req, res);
		 db.close();
	}catch (Exception e){
		}
   	}//doPost end
}//class end
