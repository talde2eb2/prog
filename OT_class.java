	package Erronka2;

public class OT_class {
	protected String Idlana;
	protected String Arazoa;
	protected boolean Eginda;

OT_class(String Idlana, String Arazoa, boolean Eginda) {
	this.Idlana = Idlana;
	this.Arazoa = Arazoa;
	this.Eginda = Eginda;
}

OT_class() {
	this.Idlana = "";
	this.Arazoa = "";
	this.Eginda = false;
}


public String getIdlana() {
	return Idlana;
}

public void setIdlana(String idlana) {
	Idlana = idlana;
}

public String getArazoa() {
	return Arazoa;
}

public void setArazoa(String arazoa) {
	Arazoa = arazoa;
}

public boolean getEginda() {
	return Eginda;
}

public void setEginda(boolean eginda) {
	Eginda = eginda;
}


}