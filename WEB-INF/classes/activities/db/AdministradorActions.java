package activities.db;

import activities.db.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;




public class AdministradorActions 
{
    DBInteraction db;
    BufferedReader keyboard;


    public AdministradorActions(DBInteraction dbparam) throws Exception 
    {

        db = dbparam;
        keyboard = new BufferedReader(new InputStreamReader(System.in));

    }
    public void añadirBox() throws Exception{
    	System.out.println("Por favor diga el tamaño del BOX que se va a añadir a la base de datos: ");
    	String  tamano = keyboard.readLine();
    	System.out.println("Por favor diga el piso del BOX que se va a añadir a la base de datos: ");
    	String  piso = keyboard.readLine();
    	db.addBox( tamano, piso);
    }
    public void editarBox() throws IOException, SQLException{
    	System.out.println("Por favor diga el id del BOX que se quiere editar");
    	String  id_box = keyboard.readLine();
    	System.out.println("Por favor diga el tamaño del BOX que se quiere editar");
    	String  tamano = keyboard.readLine();
    	System.out.println("Por favor diga el piso del BOX que se quiere editar");
    	String  piso = keyboard.readLine();
    	db.modBox(id_box, tamano, piso);
    }
    public void eliminarBox() throws Exception{
    	System.out.println("Por favor diga el id del BOX que se quiere eliminar");
    	String  id_box = keyboard.readLine();
    	db.delBox(id_box);
    }
    public void visualizarRes() throws Exception{
    	ArrayList<Reserva> data = new ArrayList<Reserva>();

    	data=db.mostrarReservas();
    	
    }
    public void visualizarUssers() throws Exception{
    	ArrayList<Usuarios> data = new ArrayList<Usuarios>();
    	data=db.mostrarUss();
    	}
    public void  visualizarBOXES() throws Exception{
    	ArrayList<Boxes> data = new ArrayList<Boxes>();
    	data=db.mostrarBox();
    }
    public void  visualizarIncidencias() throws Exception{
    	ArrayList<Incidencias> data = new ArrayList<Incidencias>();
    	data=db.mostrarIncidencias();
    }
    }


