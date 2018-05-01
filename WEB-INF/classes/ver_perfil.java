import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class ver_perfil extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }
    

 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		ArrayList data = new ArrayList();
        HttpSession session = req.getSession(true);
        String NIAKey = new String("NIA");
        String userID = (String)session.getAttribute(NIAKey);
       try{
		DBInteraction db = new DBInteraction();
		data = db.mostrarUss();
		   for(int i=0;i<data.size();i++) { 
			   Usuarios u = (Usuarios) data.get(i);
			   String NIA = u.getNIA();
			   String nombre = u.getNombre();
			   String apellido = u.getApellido();
			   String mail = u.getMail();
			   String telefono = u.getTelefono();  
			  if(NIA.equals(userID)){
        	 RequestDispatcher user = req.getRequestDispatcher("ver_perfil.jsp?NIA="+NIA+"&nombre="+nombre+"&apellido="+apellido+"&mail="+mail+"&telefono="+telefono);
			     user.include(req,res);
			     break;
	          }
	       
	       
         }
        db.close();
      }catch(Exception e){ }
      
      
      
     
	}//doPost end
}//class end
