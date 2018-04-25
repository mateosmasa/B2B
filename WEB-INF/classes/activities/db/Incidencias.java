package activities.db;

import activities.db.*;

public class Incidencias {
	String id;
	String cause;
	String Description;
	String Id_Reserv;

	public Incidencias(String id, String id_reserv, String cause,String Description){
		this.cause=cause;
		this.Description=Description;
		this.id=id;
		this.Id_Reserv=id_reserv;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setId_Reserv(String id_Reserv) {
		Id_Reserv = id_Reserv;
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
