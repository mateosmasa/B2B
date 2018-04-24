package activities.db;

import activities.db.*;


public class Usuarios {
	

	    String nombre;
	    String apellido;
	    String mail;
	    String password;
	    boolean admin;
	    String telefono;
	    String NIA;
	    public Usuarios(String NIA, String nombre, String password, String apellido, String mail, String telefono, boolean admin) {
	        this.nombre = nombre;
	        this.password = password;
	        this.apellido = apellido;
	        this.mail = mail;
	        this.telefono = telefono;
	        this.admin = admin;
	        this.NIA=NIA;
	    }

		public String getNIA() {
			return NIA;
		}

		public void setNIA(String nIA) {
			NIA = nIA;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean getAdmin() {
			return admin;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

	   
	}


