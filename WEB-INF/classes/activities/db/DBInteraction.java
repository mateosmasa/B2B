package activities.db;

import activities.db.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;




public class DBInteraction 
{
	private static final String dblogin = "root";
	private static final String dbpasswd = "dat14";
	
	Query q;
	Connection con;
	
	//Constructor that connects to the Database
	public DBInteraction () throws SQLException {
		String url="jdbc:mysql://localhost/B2B"; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Trying to connect...");
            con = DriverManager.getConnection (url, dblogin, dbpasswd);
            System.out.println("Connected!");
		}
		catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        }
        q=new Query(con);
	} 
	
	//Method to close the database Connection
	public void close()throws Exception{
        q.close();
		con.close();
	}

	//Method to add a new user to the CLIENTS table
	public void addusr(String NIA, String nombre, String apellidos, String mail, String password, String telephone)
					throws Exception{
        //String addusr="INSERT INTO USUARIOS VALUES ('"+NIA+"','"+nombre+"','"+apellidos+"','"+mail+"','"+password+"','"+false+"','"+telephone+"')";
        //String addusr="INSERT INTO USUARIOS VALUES ('"+NIA+"','"+nombre+"','"+apellidos+"','"+mail+"','"+password+"','"+false+"','"+telephone+"')";
	
        //String addusr="INSERT INTO USUARIOS (NIA, Nombre, Apellido, Mail, Password, Admin, Telephone) VALUES ('"+NIA+"','"+nombre+"','"+apellidos+"','"+mail+"','"+password+"',''"+falsee+"','"+telephone+"')";
        //q.doUpdate(addusr);
        
		
        String addusr="INSERT INTO USUARIOS (NIA,Nombre,Apellido,Mail,Password,Admin,Telephone) VALUES ('"+NIA+"','"+nombre+"','"+apellidos+"','"+mail+"','"+password+"',"+false+",'"+telephone+"')";
        System.out.println(addusr);
	    q.doUpdate(addusr);
        
        
	}
	
	public void delusr(String NIA) throws Exception{
		
		String delusr="DELETE FROM USUARIOS WHERE NIA='"+NIA+"'";
		q.doUpdate(delusr);
	}
	
	//Method to add a new Box to the CLIENTS table
	public void addBox( String size)
					throws Exception{
        String addusr="INSERT INTO BOXES (Size) VALUES ('"+size+"')";
	    q.doUpdate(addusr);
	}
	
	public void delBox(String id_box) throws Exception{
		String delusr="DELETE FROM BOXES WHERE Id_BOX='"+id_box+"'";
		q.doUpdate(delusr);
	}
	
	public void modBox(String id_box, String tamano) throws SQLException{
		String update = "UPDATE BOXES SET Size='"+tamano+"' WHERE Id_BOX='"+id_box+"'"; 
		q.doUpdate(update);	
	}
	
	public void modificarReserva(String fecha, String horaInicio, String horaFin, String nBox, String idRes) throws SQLException{
		String update = "UPDATE RESERVAS SET Fecha='"+fecha+"', Horario_Inicio='"+horaInicio+"', Horario_Fin='"+horaFin+"', Box_id="+nBox+" WHERE Id_Res="+idRes; 
		q.doUpdate(update);	
	}
	
	
	//Method to add a new user to the CLLIENTS table
	public void addReserva(String fecha, String horarioInicio, String horarioFin, String NIA, String box)
					throws Exception{
        String addusr="INSERT INTO RESERVAS (Fecha, Horario_Inicio, Horario_Fin, Confirmed, User_NIA, Box_id) VALUES ('"+fecha+"','"+horarioInicio+"','"+horarioFin+"',"+false+",'"+NIA+"',"+box+")";
	    q.doUpdate(addusr);
	}
	
	public void delReserva(String id_reserva) throws Exception{
		String delReserva="DELETE FROM RESERVAS WHERE Id_Res='"+id_reserva+"'";
		q.doUpdate(delReserva);
	}
	
	public void mostrarReserva(String NIA) throws Exception{
		String delReserva="SELECT * FROM RESERVAS WHERE User_NIA='"+NIA+"'";
		ResultSet rs=q.doSelect(delReserva);
		while(rs.next()){
			String  numres = rs.getString(1);
			String  Fecha = rs.getString(2);
			String  Horario = rs.getString(3);
			boolean  Confirmed = rs.getBoolean(4);
			System.out.println("Reserva número: "+numres+" se hizo para la fecha: "+Fecha+" para la hora: "+Horario+" confirmada: "+Confirmed);
			//mostrarIncidencia(numres);
		}
		
	}
	public void addIncidencia(String cause, String description)
			throws Exception{
	String addusr="INSERT INTO INCIDENCIAS (Cause, Description) VALUES ('"+cause+"','"+description+"')";
	q.doUpdate(addusr);
}
	public void mostrarIncidencia(String Id_res) throws Exception{
		String incidencias= "SELECT * FROM INCIDENCIAS WHERE Id_reserv ='"+Id_res+"'";
		ResultSet rs=q.doSelect(incidencias);
		System.out.println("las incidencias de la reserva: "+Id_res+" son:");
		while(rs.next()){
			String id = rs.getString(1);
			String cause=rs.getString(2);
			String description=rs.getString(3);
			System.out.println("id: "+id+" cause: "+cause+" description"+ description);
			
		}
	}
	
	public void mostrarIncidencias() throws Exception{
		String incidencias= "SELECT * FROM INCIDENCIAS";
		ResultSet rs=q.doSelect(incidencias);

		while(rs.next()){
			String id = rs.getString(1);
			String cause=rs.getString(2);
			String description=rs.getString(3);
			System.out.println("id: "+id+" cause: "+cause+" description"+ description);
			
		}
	}
	public ArrayList <String> guardarNIAS() throws Exception{
		String usuarios= "SELECT NIA FROM USUARIOS";
		ResultSet res= q.doSelect(usuarios);
		ArrayList <String> array= new ArrayList <String> ();
		
		while(res.next()){
			array.add(res.getString(1));
		}
		return array;
	}
	public void mostrarUss() throws Exception{
		String usuarios= "SELECT * FROM USUARIOS";
		ResultSet res= q.doSelect(usuarios);
		while(res.next()){
			System.out.println("\nNIA: "+res.getString(1)+"\nNombre: "+res.getString(2)+"\nApellidos: "+res.getString(3)+"\nMail: "+res.getString(4)+"\nContraseña: "+res.getString(5)+"\nAdministrador: "+res.getBoolean(6)+"\nTelefono: "+res.getString(7));
		}
	}
	public void mostrarBox() throws Exception{
		String usuarios= "SELECT * FROM BOXES";
		ResultSet res= q.doSelect(usuarios);
		while(res.next()){
			System.out.println("\nBox ID: "+res.getString(1)+"\nSize: "+res.getString(2));
		}
	}
	
	public int authentication(String NIA, String pwd)throws Exception
	{
		
		String list="SELECT * FROM USUARIOS WHERE NIA='"+NIA+"'";
		String password=null;
		//String pass="SELECT Password FROM USUARIOS WHERE NIA='"+NIA+"'";
		
		
		
		ResultSet rs=q.doSelect(list); //rs will contain the row with login passed as parameter
		//ResultSet password=q.doSelect(pass); //rs will contain the row with login passed as parameter
		
		//1:Admin, 2:Usuario, 3:No existe, 4:Contraseña incorrecta
		
		if (rs.next()){ //Check if the Resultset is empty
		    password = rs.getString(5);
		}
		if (password == null){
			return(3);
		}
		if(password.equals(pwd)){ // In case the password for this login in the table is the same as the one passed as parameter
			boolean administrador = rs.getBoolean(6);
			
			if(administrador==true)
			{
				return(1);
			}
			
			else
			{
				return(2);
			}
		}
		else {
			return(4);
		}
	}
	public void modUser(String nombre,String apellido, String mail,String pass,String telephone) throws Exception{
		
		String update = "UPDATE USUARIOS SET Nombre='"+nombre+"', Apellido='"+apellido+"', Mail='"+mail+"', Password='"+pass+"'Telephone='"+telephone+"'"; 
		q.doUpdate(update);	
		//borramos los datos anteriores
		//delusr(NIA_Antiguo);
		//introducimos los nuevos datos del usuario
		//addusr(NIA_Antiguo, Nombre, Apellido, mail, Password, Telephone);
		
		
		
		
		
	}
	
	public ArrayList  findBoxes(String nPersonas, String fecha, String horarioInicio, String horarioFin)
			throws Exception{

		System.out.println("\nLos siguientes boxes estan disponibles en la fecha y horario deseado: \n");
		
		//Collection<String> data = new ArrayList<String>();
	//String boxes="SELECT Id_BOX FROM BOXES WHERE SIZE > "+nPersonas;
		
		//String count="SELECT COUNT(1) FROM BOXES";
		//TODOS LOS BOXES
		//ResultSet nBoxes=q.doSelect(count);
		
		//while(nBoxes.next())	{
			//data.add(nBoxes.getString(1));
		//}
		

		
	//String boxId="SELECT B.* FROM BOXES B WHERE ((B.SIZE < "+nPersonas+") OR (B.Id_BOX=(SELECT Box_id from RESERVAS R WHERE R.Fecha = '"+fecha+"' AND R.HORARIO_Inicio < '"+horarioFin+"'AND R.HORARIO_Fin > '"+horarioInicio+"')))";
	String boxId="SELECT B.* FROM BOXES B WHERE ((B.SIZE >= '"+Integer.parseInt(nPersonas)+"') AND ((B.Id_BOX=(SELECT Box_id from RESERVAS R WHERE R.Fecha = '"+fecha+"' AND R.HORARIO_Inicio >= '"+Integer.parseInt(horarioFin)+"'OR R.HORARIO_Fin <= '"+Integer.parseInt(horarioInicio)+"')) OR (0=(SELECT COUNT(0) from RESERVAS))))";
	//SELECT B.Id_BOX FROM BOXES B WHERE ((B.SIZE<10) OR (B.Id_BOX=(SELECT Box_id from RESERVAS R WHERE R.Fecha='2/04/2018' and R.Horario = '14:00')));
	
	//QUERY BUENA
	//SELECT B.* FROM BOXES B WHERE ((B.SIZE >= '5') AND ((B.Id_BOX=(SELECT Box_id from RESERVAS R WHERE R.Fecha = '21/04/2018' AND R.HORARIO_Inicio >= '20' OR R.HORARIO_Fin <= '17'))OR (0=(SELECT count(0) from RESERVAS))));

	
	//BOXES LIBRES
	ResultSet boxesLibres=q.doSelect(boxId);
	
	

	
	ArrayList boxes_libres = new ArrayList();
 
	while (boxesLibres.next()) {                     

		boxes_libres.add(new Boxes(boxesLibres.getString(1),boxesLibres.getString(2))); 
		System.out.println("\nID: "+boxesLibres.getString(1)+"\nSize: "+boxesLibres.getString(2));
	}
	
	/*
	List<String> nBoxes1 = new ArrayList<String>(nBoxes);
	Collection<String> boxes_ocupados1 = new ArrayList(Arrays.asList(boxes_ocupados));

    nBoxes1.removeAll(boxes_ocupados1);
    */
	
	return(boxes_libres);

}
	

}
