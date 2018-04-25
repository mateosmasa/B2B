import java.io.*;
import java.util.*;
import java.awt.*;
import javax.servlet.*;
import javax.servlet.http.*;
import activities.db.*;
import java.sql.ResultSet;
public class AccionMostrarReservaUsuario extends HttpServlet {
//esta por hacer no se porque no encuentra este archivo cuando lo llamas
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("GET Request. No Form Data Posted");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String NIA =req.getParameter("NIA");
	  //Depending on if we list pavillions or activities, the rendering will be different
		
		    RequestDispatcher layout=req.getRequestDispatcher("verReservaUsuario.jsp");
		    layout.include(req, res);
	    
	  try{
		DBInteraction db=new DBInteraction();
		ResultSet resusltado= db.mostrarReserva(NIA);
	        
        
		while(resusltado.next()){
			String numres = resusltado.getString(1);
			String Fecha = resusltado.getString(2);
			String Horario = resusltado.getString(3);
			String Confirmed = resusltado.getString(4);
			
			
			
			RequestDispatcher outus=req.getRequestDispatcher("outResUs.jsp?numres="+numres+"&Fecha="+Fecha+"&Horario="+Horario+"&Confirmed="+Confirmed);
		    outus.include(req, res);
		    
		}
        
			
	  } //end try
	  catch (Exception e){  }
	}//doPost end
}//class end
