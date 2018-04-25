package activities.db;

import activities.db.*;

public class Boxes {
	String id;
	String  size;
    String piso;

    public Boxes(String id, String size,  String piso) {
        this.id=id;
    	this.size = size;
        this.piso=piso;
    }
    

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	

    
	


}
