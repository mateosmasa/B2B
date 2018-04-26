import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class list extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String NIA;
        String password;
        int valor_login;
        password = req.getParameter("pwd");
        NIA = req.getParameter("NIA");
        
        HttpSession session = req.getSession(true);
        String NIAKey = new String("NIA");
        String NIA_s = new String(NIA);
        session.setAttribute(NIAKey, NIA_s);
    
        try{
			DBInteraction db = new DBInteraction();
			
			valor_login=db.authentication(NIA,password);
			
			
			switch(valor_login){
			case 1: 
			     RequestDispatcher admin = req.getRequestDispatcher("menu_admin.jsp");
			     admin.include(req,res);
			     break;
			case 2:
				 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
			     user.include(req,res);
			     break;
			default:
				req.getRequestDispatcher("index.html").include(req, res); //METER UN MENSAJE DE USUARIO
						
				 break;
			     
			}
			
			db.close();
			
       }catch(Exception e){ }
	}//doPost end
}//class end
