import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class eliminarUsuario extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
               
      String nia = req.getParameter("nia").toString();
       try{
		DBInteraction db=new DBInteraction();
		db.delusr(nia);
		 req.getRequestDispatcher("adminUsu.html").include(req, res);
		 db.close();
	}catch (Exception e){
		}
   	}//doPost end
}//class end
