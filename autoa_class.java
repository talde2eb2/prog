package Erronka2;

import java.io.Serializable;

public class autoa_class implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
protected String marka; 
protected String modelo; 
protected String matrikula;
protected String bezero;

public String getBezero() {
	return bezero;
}
public void setBezero(String bezero) {
	this.bezero = bezero;
}
@Override
public String toString() {
	return  marka + " " + modelo + " " + matrikula;
}
autoa_class(String marka, String modelo, String matrikula){
	this.marka="";
	this.modelo="";
	this.matrikula="";
}
autoa_class(String marka,String modelo,String matrikula,String bezero){
	this.marka=marka;
	this.modelo=modelo;
	this.matrikula=matrikula;
	this.bezero=bezero;
}
public String getMarka() {
	return marka;
}
public void setMarka(String marka) {
	this.marka = marka;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMatrikula() {
	return matrikula;
}
public void setMatrikula(String matrikula) {
	this.matrikula = matrikula;
}

}
