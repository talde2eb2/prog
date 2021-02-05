package Erronka2;

import java.io.Serializable;

public class Faktura_class implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int fakturaznbk;
	protected int totala;
	protected int bez;
	protected int beztotala;

Faktura_class() {
	this.fakturaznbk=0;
	this.totala=0;
	this.bez=0;
	this.beztotala=0;
}

Faktura_class(int fakturaznbk, int totala, int bez, int beztotala) {
	this.fakturaznbk=fakturaznbk;
	this.totala=totala;
	this.bez=bez;
	this.beztotala=beztotala;
}

public int getFakturaznbk() {
	return fakturaznbk;
}

public void setFakturaznbk(int fakturaznbk) {
	this.fakturaznbk = fakturaznbk;
}

public int getTotala() {
	return totala;
}

public void setTotala(int totala) {
	this.totala = totala;
}

public int getBez() {
	return bez;
}

public void setBez(int bez) {
	this.bez = bez;
}

public int getBeztotala() {
	return beztotala;
}

public void setBeztotala(int beztotala) {
	this.beztotala = beztotala;
}

}
