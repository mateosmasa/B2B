package activities.db;

import activities.db.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class UserActions 
{
	
    DBInteraction db;
    BufferedReader keyboard;


    public UserActions(DBInteraction dbparam) throws Exception 
    {

        db = dbparam;
        keyboard = new BufferedReader(new InputStreamReader(System.in));

    }
	
    
    public void reserveBox(String NIA) throws Exception 
    {
    	
    	
		System.out.println("\nPara cuantas personas quiere buscar?: \n");
		String nPersonas = keyboard.readLine();
		
		System.out.println("\nIntroduzca la fecha en la que quiera reservar: \n");
		String fecha = keyboard.readLine();
		
		
		System.out.println("\nIntroduzca la hora inicio en la que quiera reservar: \n");
		String horaInicio = keyboard.readLine();
		
		System.out.println("\nIntroduzca la hora final en la que quiera reservar: \n");
		String horaFin = keyboard.readLine();
		
		List<String> data = new ArrayList();
		
		data=db.findBoxes(nPersonas, fecha, horaInicio, horaFin);
	
		boolean boxPosible=false;
		
		
		System.out.println("\nSeleccione el numero de box que desee reservar: \n");	
		String nBox = keyboard.readLine();
	   
		for(int i=0; i<data.size(); i++)
		{
			if(nBox.equals(data.get(i)))
			{
				boxPosible=true;
				db.addReserva(fecha, horaInicio, horaFin, NIA, nBox);
				System.out.println("\nRESERVA REALIZADA CON EXITO");
			}
			
			else
			{
				boxPosible=false;
			}
		}
		
		if(!boxPosible)
		{
			System.out.println("\nBOX NO VALIDO");
		}
		
	}
	
	
    public void modificarReserva() throws Exception 
	{
		System.out.println("\nIntroduzca el numero de reserva: \n");
		String reservaID = keyboard.readLine();
		
		System.out.println("\nPara cuantas personas quiere buscar?: \n");
		String nPersonas = keyboard.readLine();
		
		System.out.println("\nIntroduzca la fecha en la que quiera reservar: \n");
		String fecha = keyboard.readLine();
		
		
		System.out.println("\nIntroduzca la hora inicio en la que quiera reservar: \n");
		String horaInicio = keyboard.readLine();
		
		System.out.println("\nIntroduzca la hora final en la que quiera reservar: \n");
		String horaFin = keyboard.readLine();
		
		
		List<String> data = new ArrayList();
		
		data = db.findBoxes(nPersonas, fecha, horaInicio, horaFin);
	
		boolean boxPosible=false;
		
		
		System.out.println("\nSeleccione el numero de box que desee reservar: \n");	
		String nBox = keyboard.readLine();
	   
		for(int i=0; i<data.size(); i++)
		{
			if(nBox.equals(data.get(i)))
			{
				boxPosible=true;
				db.modificarReserva(fecha, horaInicio, horaFin,  nBox, reservaID);
				System.out.println("\nRESERVA MODIFICADA CON EXITO");
			}
			
			else
			{
				boxPosible=false;
			}
		}
		
		if(!boxPosible)
		{
			System.out.println("\nBOX NO VALIDO");
		}
		
	}
	
	public void cancelarReserva() throws Exception 
	{
		System.out.println("\nIntroduzca el numero de reserva: \n");
		String reservaID = keyboard.readLine();
		
		db.delReserva(reservaID);
	}
	
	public void reportarIncidencia() throws Exception
	{
		System.out.println("\nIntroduzca el numero de reserva: \n");
		String reservaID = keyboard.readLine();
		
		System.out.println("\nIntroduzca el motivo de la incidencia: \n");
		String motivo = keyboard.readLine();
		
		System.out.println("\nIntroduzca la descripcion de la incidencia: \n");
		String descripcion = keyboard.readLine();
		
		db.addIncidencia(motivo, descripcion);
	}
	
	public void modificarInfo(String NIA_Antiguo) throws Exception{
		System.out.println("\nIntroduzca sus nuevos datos : \n");
		
		System.out.println("Nombre: \n");
		String Nombre = keyboard.readLine();
		
		System.out.println("Apellido: \n");
		String Apellido = keyboard.readLine();
		
		System.out.println("Password: \n");
		String Password = keyboard.readLine();
		
		System.out.println("mail: \n");
		String mail = keyboard.readLine();
		
		
		System.out.println("Telephone: \n");
		String Telephone = keyboard.readLine();
	
		db.modUser(Nombre, Apellido,mail,Password,Telephone);
	}
	public void darBaja(String NIA_inicio) throws Exception{
		db.delusr(NIA_inicio);
	}
	public void mostrarReservas(String NIA_inicio) throws Exception{
		db.mostrarReserva(NIA_inicio);
	}

}
