import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class logout extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
               
		HttpSession session = req.getSession();
        session.invalidate();
        
        RequestDispatcher admin = req.getRequestDispatcher("index.html");
		admin.include(req,res);
			   
	
	}//doPost end
}//class end
