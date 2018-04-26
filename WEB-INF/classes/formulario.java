import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class formulario extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String NIA;
        String nombre;
        String apellido;
        String mail;
        String password;
        String telefono;
        NIA = req.getParameter("NIA");
        nombre = req.getParameter("nombre");
        apellido = req.getParameter("apellido");
        mail = req.getParameter("mail");
        password = req.getParameter("password");
        telefono = req.getParameter("telefono");
        try{
			DBInteraction db = new DBInteraction();
			
			db.addusr(NIA, nombre, apellido, mail,password,telefono);
			req.getRequestDispatcher("index.html").include(req, res);
			db.close();
			
       }catch(Exception e){ }
	}//doPost end
}//class end
