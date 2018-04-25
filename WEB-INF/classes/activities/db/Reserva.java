package activities.db;

import activities.db.*;

public class Reserva {
String id;
 String horarioInicio;
 String horarioFin;
 String fecha;
 Boolean confirmed;
 String User_NIA;
 String Box_id;
 
public Reserva(String fecha,String id, String horarioInicio,String horarioFin,Boolean confirmed,String User_NIA, String Box_id){
	this.id=id;
	this.confirmed=confirmed;
	this.horarioInicio=horarioInicio;
	this.horarioFin=horarioFin;
	this.fecha=fecha;
	this.User_NIA=User_NIA;
	this.Box_id=Box_id;
}

public String getHorarioInicio() {
	return horarioInicio;
}

public void setHorarioInicio(String horarioInicio) {
	this.horarioInicio = horarioInicio;
}

public String getHorarioFin() {
	return horarioFin;
}

public void setHorarioFin(String horarioFin) {
	this.horarioFin = horarioFin;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public Boolean getConfirmed() {
	return confirmed;
}

public void setConfirmed(Boolean confirmed) {
	this.confirmed = confirmed;
}

public String getUser_NIA() {
	return User_NIA;
}

public void setUser_NIA(String user_NIA) {
	User_NIA = user_NIA;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getBox_id() {
	return Box_id;
}

public void setBox_id(String box_id) {
	Box_id = box_id;
}




}
