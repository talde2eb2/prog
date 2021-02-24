package Erronka2;

import java.io.Serializable;

public class Pieza_class extends PiezaLana_class implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String Hornitzailea;
	

	
 Pieza_class(){
	this.Hornitzailea = "";

 }

 @Override
public String toString() {
	return Hornitzailea + " " + super.getIzena() + " " + super.getPrezioa();
}

Pieza_class(String Pieza, String Hornitzailea, int prezioa){
	super(Pieza, prezioa);
	this.Hornitzailea = Hornitzailea;
 }
 
 public String getHornitzailea() {
	return Hornitzailea;
 }

 public void setHornitzailea(String hornitzailea) {
	Hornitzailea = hornitzailea;
 }

}