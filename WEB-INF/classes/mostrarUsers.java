import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class mostrarUsers extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		ArrayList data = new ArrayList();
		
      
       try{
		DBInteraction db = new DBInteraction();
		
		data = db.mostrarUss();
		req.getRequestDispatcher("lista_users.jsp").include(req, res);
	    for(int i=0;i<data.size();i++) {
			     Usuarios u = (Usuarios) data.get(i);
			     String nia = u.getNIA();
			     String nombre = u.getNombre();
			     String apellido = u.getApellido();
			     String email = u.getMail();
			     String telefono = u.getTelefono();
			
					RequestDispatcher boxes_disponible=req.getRequestDispatcher("usuarios_libres.jsp?nia="+nia+"&nombre="+nombre+"&apellido="+apellido+"&telefono="+telefono+"&email="+email);
					boxes_disponible.include(req, res);
		}
	   db.close();
	   RequestDispatcher end=req.getRequestDispatcher("end.jsp");
	   end.include(req, res);
      }catch(Exception e){ }
      
	}//doPost end
}//class end
