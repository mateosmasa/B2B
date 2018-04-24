package activities.db;

import activities.db.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Control 
{
	 public static void main(String args[]) throws Exception 
	 {
		String NIA_inicio = "";
		String NIA_registro= "";
		String password = "";
		String  opcion;
		String nombre = "";
		String apellidos = "";
		String mail = "";
		String telephone = "";
		int tipo = 4;
		boolean end = false;
		 
        // Call for a reference for data base access
        DBInteraction db = new DBInteraction();
        //para poder leer del teclado
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("\nMENU: \n");
        System.out.println("\nA.- Iniciar sesion");
        System.out.println("\nB.- Registrarse");

        
        
	    opcion = keyboard.readLine();
        
	    
	    if(opcion.equals("A"))
	    {
	        System.out.println("\nIntroduzca el NIA del usuario o administrador: ");
	        NIA_inicio = keyboard.readLine();
		    
		    System.out.println("\nIntroduzca la contraseña de usuario o administrador: ");
		    password = keyboard.readLine();
		    
		    tipo=db.authentication(NIA_inicio, password);
		    
	    }
	    
	    else if(opcion.equals("B"))
	    {
	    	System.out.println("\nIntroduzca el NIA del usuario o administrador: ");
	    	NIA_registro = keyboard.readLine();
		    
		    System.out.println("\nIntroduzca la contraseña de usuario o administrador: ");
		    password = keyboard.readLine();
		    
		    System.out.println("\nIntroduzca su nombre: ");
		    nombre = keyboard.readLine();
		    
		    System.out.println("\nIntroduzca sus apellidos ");
		    apellidos = keyboard.readLine();
		    
		    System.out.println("\nIntroduzca su email: ");
		    mail = keyboard.readLine();
		    
		    System.out.println("\nIntroduzca su numero de telefono: ");
		    telephone = keyboard.readLine();
		    
		    db.addusr(NIA_registro, nombre, apellidos, mail, password, telephone);
		    
		    tipo=2;
	    }
	    
	    

        while (true)
        {
        	
        	
        	if(tipo==2)
        	{
		
        		UserActions u = new UserActions(db);
        		
        		
        		while (!end)
        		{
        			
            		System.out.println("\nIntroduzca la tarea que desee realizar: \nA. Reservar Box\nB. Editar reserva\nC. Cancelar reserva\nD. Reportar incidencia\nE. modificar informacion de usuario. \nF. Darse de baja. \nG. Historia de reservas.\nH. Cerrar Sesion");
            		String  opcion2 = keyboard.readLine();
        			
        			if (opcion2.equals("A")){
        						u.reserveBox(NIA_inicio);
        			}
        					
        			if (opcion2.equals("B")){
        						u.modificarReserva();
        			}
        					
        			if (opcion2.equals("C")){
        						u.cancelarReserva();
        			}
        				
        			if (opcion2.equals("D")){
        						u.reportarIncidencia();
        			}
        			if (opcion2.equals("E")){
						u.modificarInfo(NIA_inicio);
        				}
        			if (opcion2.equals("F")){
						u.darBaja(NIA_inicio);
						end = true;
						System.out.println("\n\nSESION CERRADA");
						System.exit(0);
        				}
        			if (opcion2.equals("G")){
						u.mostrarReservas(NIA_inicio);
        				}
        			
        			if (opcion2.equals("H")){
						end = true;
						System.out.println("\n\nSESION CERRADA");
						System.exit(0);
        				}
        			
        			}
        		}
        		
                
                
        	
        	
        	else if(tipo==1)
        	{

        		
        		
        		UserActions u = new UserActions(db);
        		AdministradorActions a = new AdministradorActions(db);
        		
        		while (!end)
        		{
        		
            		System.out.println("\nIntroduzca la tarea que desee realizar: \nH. Eliminar Usuario.\nI. Añadir Box.\nJ. Editar Box.\nK. Visualizar incidencias.\nL. Eliminar Box. \nM. Visualizar reservas. \nO. Visualizar Usuarios. \nP. Visualizar Boxes. \nQ. Cerrar sesion");
            		String  opcion2 = keyboard.readLine();

        			if (opcion2.equals("H")){
        				System.out.println("ponga el NIA del usuario que desea eliminar");
        				String  NIA_Elim = keyboard.readLine();
        				u.darBaja(NIA_Elim);
        				}
        			if (opcion2.equals("I")){
        				a.añadirBox();
        			}
        			if (opcion2.equals("J")){
        				a.editarBox();
        			}
        			if (opcion2.equals("K")){
        				a.visualizarIncidencias();
        			}
        			if (opcion2.equals("L")){
        				a.eliminarBox();
        			}
        			if (opcion2.equals("M")){
        				a.visualizarRes();
        			}
        			if (opcion2.equals("O")){
        				a.visualizarUssers();
        			}
        			if (opcion2.equals("P")){
        				a.visualizarBOXES();
        			}
        			if (opcion2.equals("Q")){
						end = true;
						System.out.println("\n\nSESION CERRADA");
						System.exit(0);
        				}
        			}
        		}
        		
  	
        		
        		
        	
        	else if(tipo==3){
        		System.out.println("Usted no esta registrado, para poder iniciar sesión debe registrarse primero");
        		
        		
                
                System.out.println("\nMENU: \n");
                System.out.println("\nA.- Iniciar sesion");
                System.out.println("\nB.- Registrarse");

                
                
        	    opcion = keyboard.readLine();
                
        	    
        	    if(opcion.equals("A"))
        	    {
        	        System.out.println("\nIntroduzca el NIA del usuario o administrador: ");
        	        NIA_inicio = keyboard.readLine();
        		    
        		    System.out.println("\nIntroduzca la contraseña de usuario o administrador: ");
        		    password = keyboard.readLine();
        		    
        		    tipo=db.authentication(NIA_inicio, password);
        		    
        	    }
        	    
        	    else if(opcion.equals("B"))
        	    {
        	    	System.out.println("\nIntroduzca el NIA del usuario o administrador: ");
        	    	NIA_registro = keyboard.readLine();
        		    
        		    System.out.println("\nIntroduzca la contraseña de usuario o administrador: ");
        		    password = keyboard.readLine();
        		    
        		    System.out.println("\nIntroduzca su nombre: ");
        		    nombre = keyboard.readLine();
        		    
        		    System.out.println("\nIntroduzca sus apellidos ");
        		    apellidos = keyboard.readLine();
        		    
        		    System.out.println("\nIntroduzca su email: ");
        		    mail = keyboard.readLine();
        		    
        		    System.out.println("\nIntroduzca su numero de telefono: ");
        		    telephone = keyboard.readLine();
        		    
        		    db.addusr(NIA_registro, nombre, apellidos, mail, password, telephone);
        	    }
        		
        	}
        }
	 }

}
