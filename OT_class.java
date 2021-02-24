package Erronka2;

import java.io.Serializable;
import java.util.ArrayList;

public class OT_class implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String Arazoa;
	protected String Mat;
	protected boolean Eginda;
	protected static ArrayList<Pieza_class> otarray_pieza = new ArrayList<Pieza_class>();
	public static ArrayList<Pieza_class> getOtarray_pieza() {
		return otarray_pieza;
	}

	public void setOtarray_pieza(ArrayList<Pieza_class> otarray_pieza) {
		OT_class.otarray_pieza = otarray_pieza;
	}

	public static ArrayList<Lana_class> getOtarray_lana() {
		return otarray_lana;
	}

	public void setOtarray_lana(ArrayList<Lana_class> otarray_lana) {
		OT_class.otarray_lana = otarray_lana;
	}

	protected static ArrayList<Lana_class> otarray_lana = new ArrayList<Lana_class>();

OT_class(String Mat, String Arazoa, boolean Eginda) {
	this.Mat = Mat;
	this.Arazoa = Arazoa;
	this.Eginda = Eginda;
}

OT_class(String string, String autoa) {
	this.Mat = autoa;
	this.Arazoa = string;
	this.Eginda = false;
}




public String getMat() {
	return Mat;
}

public void setMat(String mat) {
	Mat = mat;
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