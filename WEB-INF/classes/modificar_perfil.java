import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;

public class modificar_perfil extends HttpServlet {

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
        String mod = req.getParameter("boton_confirm");
        String NIA_r = req.getParameter("NIA");
        String nombre_r = req.getParameter("nombre");
        String apellido_r = req.getParameter("apellido");
        String mail_r = req.getParameter("mail");
        String telefono_r = req.getParameter("telefono");
        String password_r = req.getParameter("password");
       
       try{
		DBInteraction db = new DBInteraction();
	  if(mod == null){
		data = db.mostrarUss();
		   for(int i=0;i<data.size();i++) { 
			   Usuarios u = (Usuarios) data.get(i);
			   String NIA = u.getNIA();
			   String nombre = u.getNombre();
			   String apellido = u.getApellido();
			   String mail = u.getMail();
			   String telefono = u.getTelefono();
			   String password = u.getPassword();    
			  if(NIA.equals(userID)){
        	 RequestDispatcher user = req.getRequestDispatcher("modificar_perfil.jsp?NIA="+NIA+"&nombre="+nombre+"&apellido="+apellido+"&mail="+mail+"&telefono="+telefono+"&password="+password);
			     user.include(req,res);
			     break;
	          }
	       
	       
         }
        }else{
		
		 db.modUser(NIA_r,nombre_r,apellido_r,mail_r,password_r,telefono_r);
		 RequestDispatcher user = req.getRequestDispatcher("menu_user.jsp");
			     user.include(req,res);	
		}
		
       
        db.close();
      }catch(Exception e){ }
      
      
      
     
	}//doPost end
}//class end
