package activities.db;

import activities.db.*;

public class Incidencias {

	String cause;
	String Description;
	String Id_Reserv;

	public Incidencias(String cause,String Description){
		this.cause=cause;
		this.Description=Description;
		
	}
	public Incidencias(String cause, String Id_Reserv, String Description){
		this.cause=cause;
		this.Description=Description;
		this.Id_Reserv=Id_Reserv;
	}
	
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getId_Reserv() {
		return Id_Reserv;
	}
	
	

}
