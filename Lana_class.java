package Erronka2;

import java.io.Serializable;

public class Lana_class extends PiezaLana_class implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String Langile;
	
 Lana_class(){
	 this.Langile = "";
 }
 
 @Override
public String toString() {
	return super.getIzena() + " " + Langile + " " + super.getPrezioa();
}

 Lana_class(String Lana, String Langile,int prezioa){
	 super(Lana,prezioa);
	 this.Langile = Langile;
 }


public String getLangile() {
	return Langile;
}

public void setLangile(String Langile) {
	this.Langile = Langile;
}
 
}
