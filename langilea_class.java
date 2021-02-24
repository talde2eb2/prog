package Erronka2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;

public class langilea_class extends pertsona_class implements Serializable {

	@Override
	public String toString() {
		return   erabiltzailea + " " + pasahitza + " " + mota + super.getIzena() + " " + super.getAbizena() + " " + super.getNan();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String erabiltzailea;
	protected String pasahitza;
	protected String mota;
	
	

	public langilea_class() {
		
		this.erabiltzailea="";
		this.pasahitza="";
		this.mota="";
	}
	
	
	public langilea_class(String izena,String abizena,String nan,String erabiltzailea,String pasahitza,String mota) {
		
		super(izena,abizena,nan);
		this.erabiltzailea=erabiltzailea;
		this.pasahitza=pasahitza;
		this.mota=mota;
	}


	public String getErabiltzailea() {
		return erabiltzailea;
	}


	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}


	public String getPasahitza() {
		return pasahitza;
	}


	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}



	public String getMota() {
		return mota;
	}


	public void setMota(String mota) {
		this.mota = mota;
	}

	public void log() throws IOException {
		Date objDate = new Date();
		FileWriter fitxategia = null;
			PrintWriter pw = null;
				fitxategia = new FileWriter ("Log.txt");
				pw = new PrintWriter (fitxategia);
				pw.println(this.getErabiltzailea()+" "+objDate);
				fitxategia.close();
	}





}
