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
	public void addBox( String size, String piso)
					throws Exception{
        String addusr="INSERT INTO BOXES (Size, Piso) VALUES ('"+size+"', '"+piso+"')";
	    q.doUpdate(addusr);
	}
	
	public void delBox(String id_box) throws Exception{
		String delusr="DELETE FROM BOXES WHERE Id_BOX='"+id_box+"'";
		q.doUpdate(delusr);
	}
	
	public void modBox(String id_box, String tamano, String piso) throws SQLException{
		String update = "UPDATE BOXES SET Size='"+tamano+"', Piso= '"+piso+"' WHERE Id_BOX='"+id_box+"'"; 
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
	
	public ArrayList<Reserva> mostrarReserva(String NIA) throws Exception{
		ArrayList<Reserva> data = new ArrayList<Reserva>();
		String delReserva="SELECT * FROM RESERVAS WHERE User_NIA='"+NIA+"'";
		ResultSet rs=q.doSelect(delReserva);
		while(rs.next()){
			String  numres = rs.getString(1);
			String  Fecha = rs.getString(2);
			String  Horario_inicio = rs.getString(3);
			String  Horario_fin = rs.getString(4);
			boolean  Confirmed = rs.getBoolean(5);
			String user_Nia = rs.getString(6);
			String box_Id = rs.getString(7);
			System.out.println("Reserva número: "+numres+" se hizo para la fecha: "+Fecha+" para la hora: "+Horario_inicio+" confirmada: "+Confirmed);
			data.add(new Reserva(numres, Fecha, Horario_inicio,Horario_fin, Confirmed, user_Nia, box_Id));
		}
		
		return data;
		
	}
	
	public ArrayList<Reserva> mostrarReservas() throws Exception{
		ArrayList<Reserva> data = new ArrayList<Reserva>();
		String delReserva="SELECT * FROM RESERVAS";
		ResultSet rs=q.doSelect(delReserva);
		while(rs.next()){
			String  numres = rs.getString(1);
			String  Fecha = rs.getString(2);
			String  Horario_inicio = rs.getString(3);
			String  Horario_fin = rs.getString(4);
			boolean  Confirmed = rs.getBoolean(5);
			String user_Nia = rs.getString(6);
			String box_Id = rs.getString(7);
			System.out.println("Reserva número: "+numres+" se hizo para la fecha: "+Fecha+" para la hora: "+Horario_inicio+" confirmada: "+Confirmed);
			data.add(new Reserva(numres, Fecha, Horario_inicio,Horario_fin, Confirmed, user_Nia, box_Id));
		}
		
		return data;
		
	}
	
	public void addIncidencia(String cause, String description)
			throws Exception{
	String addusr="INSERT INTO INCIDENCIAS (Cause, Description) VALUES ('"+cause+"','"+description+"')";
	q.doUpdate(addusr);
}
	public ArrayList<Incidencias> mostrarIncidencia(String Id_res) throws Exception{
		ArrayList<Incidencias> data = new ArrayList<Incidencias>();
		String incidencias= "SELECT * FROM INCIDENCIAS WHERE Id_reserv ='"+Id_res+"'";
		ResultSet rs=q.doSelect(incidencias);
		System.out.println("las incidencias de la reserva: "+Id_res+" son:");
		while(rs.next()){
			String id = rs.getString(1);
			String id_reserv= rs.getString(2);
			String cause=rs.getString(3);
			String description=rs.getString(4);
			System.out.println("id: "+id+" cause: "+cause+" description"+ description);
			data.add(new Incidencias(id, id_reserv,cause, description));
			
		}
		
		return data;
	}
	
	public ArrayList<Incidencias> mostrarIncidencias() throws Exception{
		ArrayList<Incidencias> data = new ArrayList<Incidencias>();
		String incidencias= "SELECT * FROM INCIDENCIAS";
		ResultSet rs=q.doSelect(incidencias);

		while(rs.next()){
			String id = rs.getString(1);
			String id_reserv= rs.getString(2);
			String cause=rs.getString(3);
			String description=rs.getString(4);
			System.out.println("id: "+id+" cause: "+cause+" description"+ description);
			data.add(new Incidencias(id, id_reserv,cause, description));
		}
		
		return data;
	}
	

	public ArrayList<Usuarios> mostrarUss() throws Exception{
		ArrayList<Usuarios> data = new ArrayList<Usuarios>();
		String usuarios= "SELECT * FROM USUARIOS";
		ResultSet res= q.doSelect(usuarios);
		while(res.next()){
			   String NIA = res.getString(1);
			   String nombre = res.getString(2);
	           String apellidos = res.getString(3);
			   String mail = res.getString(4);
	           String contraseña = res.getString(5);
			   boolean admin = res.getBoolean(6);
			   String telefono = res.getString(7);
			System.out.println("\nNIA: "+res.getString(1)+"\nNombre: "+res.getString(2)+"\nApellidos: "+res.getString(3)+"\nMail: "+res.getString(4)+"\nContraseña: "+res.getString(5)+"\nAdministrador: "+res.getBoolean(6)+"\nTelefono: "+res.getString(7));
			data.add(new Usuarios(NIA, nombre, apellidos, mail, contraseña,  telefono,admin));
		}
		return data;
	}
	public ArrayList<Boxes> mostrarBox() throws Exception{
		ArrayList<Boxes> data = new ArrayList<Boxes>();
		String usuarios= "SELECT * FROM BOXES";
		ResultSet res= q.doSelect(usuarios);
		while(res.next()){
			   String id = res.getString(1);
			   String size = res.getString(2);
			   String piso = res.getString(3);
			System.out.println("\nBox ID: "+res.getString(1)+"\nSize: "+res.getString(2));
			data.add(new Boxes(id,size, piso));

		}
		
		return data;
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
	public void modUser(String NIA,String nombre,String apellido, String mail,String pass,String telephone) throws Exception{
		
		String update = "UPDATE USUARIOS SET Nombre='"+nombre+"', Apellido='"+apellido+"', Mail='"+mail+"', Password='"+pass+"',Telephone='"+telephone+"' WHERE NIA = '"+NIA+"'"; 
		q.doUpdate(update);	
		//borramos los datos anteriores
		//delusr(NIA_Antiguo);
		//introducimos los nuevos datos del usuario
		//addusr(NIA_Antiguo, Nombre, Apellido, mail, Password, Telephone);
		
		
		
		
		
	}
	
	public ArrayList<Boxes> findBoxes(String nPersonas, String fecha, String horarioInicio, String horarioFin)
			throws Exception{
		ArrayList<Boxes> data = new ArrayList<Boxes>();
		
		String count="SELECT * FROM BOXES";
		//TODOS LOS BOXES
		ResultSet res=q.doSelect(count);
		
		while(res.next()){
			   String id = res.getString(1);
			   String size = res.getString(2);
			   String piso = res.getString(3);
			data.add(new Boxes(id,size, piso));

		}

		//BOXES NO VALIDOS
		String boxId="SELECT B.* FROM BOXES B WHERE ((B.SIZE < "+nPersonas+") OR (B.Id_BOX=(SELECT Box_id from RESERVAS R WHERE R.Fecha = '"+fecha+"' AND R.HORARIO_Inicio < '"+horarioFin+"'AND R.HORARIO_Fin > '"+horarioInicio+"')))";
		ResultSet boxesOcupados=q.doSelect(boxId);
		
		ArrayList<Boxes> boxes_Ocupados = new ArrayList<Boxes>();
		
		while(boxesOcupados.next()){
			   String id = boxesOcupados.getString(1);
			   String size = boxesOcupados.getString(2);
			   String piso = boxesOcupados.getString(3);
			   boxes_Ocupados.add(new Boxes(id,size, piso));

			   for (int i=0;i<data.size();i++)
			   {
			       Boxes b1 = (Boxes)data.get(i);
				   
			       for(int j=0;j<boxes_Ocupados.size();j++)
			       {
					   Boxes b2 = (Boxes)boxes_Ocupados.get(j);
					   
					   if(b1.getId().equals(b2.getId()))
					   {
						   data.remove(i);
						   i--;
					   }
				   }
				   
			   }
		}

		
		for(int i=0; i<data.size(); i++)
		{
			System.out.println("\nID: "+data.get(i).getId()+"\nSize: "+data.get(i).getSize());
		
		}
		return (data);



}
	

}
