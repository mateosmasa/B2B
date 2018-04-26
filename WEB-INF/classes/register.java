import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class register extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

        RequestDispatcher registro = req.getRequestDispatcher("formulario.jsp");
        registro.include(req,res);
	}//doPost end
}//class end
