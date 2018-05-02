import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class anadir_incidencia extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }
    

 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
      String cause = req.getParameter("titulo");
      String description = req.getParameter("descripcion");
      String numres = req.getParameter("incidencia");
      System.out.println(cause);
      System.out.println(description);
      String numres1 = req.getParameter("incidencia1");
      if(cause == null){
        	 RequestDispatcher user = req.getRequestDispatcher("anadir_incidencia.jsp?numres="+numres);
			     user.include(req,res);
      }	    
      else{
       try{
		DBInteraction db = new DBInteraction();
		db.addIncidencia(cause,description,numres1);
        	 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
			     user.include(req,res);
	    db.close();
      }catch(Exception e){ }
      
  }
      
     
	}//doPost end
}//class end
