package Erronka2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Fitxategi_class implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	void gordeAutoa(ArrayList <autoa_class> autoaarray) {
			FileOutputStream fos = null;
			ObjectOutputStream oos=null;
			try {
				fos = new FileOutputStream("Autoa.txt");
				oos = new ObjectOutputStream(fos);
			for(int a=0;a<autoaarray.size();a++) {
				oos.writeObject(autoaarray.get(a));
			}
			}catch(IOException e) {
			}	
		try {
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	void gordeBezeroa(ArrayList<bezero_class> bezeroarray) {
			FileOutputStream fos = null;
			ObjectOutputStream oos=null;
			try {
				fos = new FileOutputStream("Bezeroa.txt");
				oos = new ObjectOutputStream(fos);
			for(int a=0;a<bezeroarray.size();a++) {
				oos.writeObject(bezeroarray.get(a));
			}
			}catch(IOException e) {
			}	
		try {
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	void gordeLangileak(ArrayList<langilea_class> langileaarray) {
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream ("Langileak.txt");
			oos=new ObjectOutputStream(fos);
			for(int b=0;b<langileaarray.size();b++) {
				oos.writeObject(langileaarray.get(b));
			}
			}catch(IOException e) {
			}	
		try {
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void gordePiezak(ArrayList<Pieza_class> piezakarray) {
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream ("Piezak.txt");
			oos=new ObjectOutputStream(fos);
			for(int b=0;b<piezakarray.size();b++) {
				oos.writeObject(piezakarray.get(b));
			}
			}catch(IOException e) {
			}	
		try {
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void gordeLanak(ArrayList<Lana_class> lanakarray) {
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream ("Lanak.txt");
			oos=new ObjectOutputStream(fos);
			for(int b=0;b<lanakarray.size();b++) {
				oos.writeObject(lanakarray.get(b));
			}
			}catch(IOException e) {
			}	
		try {
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void kargatuAutoa(ArrayList <autoa_class> autoaarray) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream ("Autoa.txt");
			ois=new ObjectInputStream(fis);
			obj = (autoa_class)ois.readObject();
			autoaarray.add((autoa_class) obj);
			while(obj != null) {
				obj = (autoa_class)ois.readObject();
					autoaarray.add((autoa_class) obj);
			}
			ois.close();
			}catch(IOException | ClassNotFoundException ioe) {
		}	
	}
	void kargatuBezeroa(ArrayList<bezero_class> bezeroarray) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream ("Bezeroa.txt");
			ois=new ObjectInputStream(fis);
			obj = (bezero_class)ois.readObject();
			bezeroarray.add((bezero_class) obj);
			while(obj != null) {
				obj = (bezero_class)ois.readObject();
				bezeroarray.add((bezero_class) obj);
			}
			ois.close();
			}catch(IOException | ClassNotFoundException ioe) {
		}	
	}
	void kargatuLangilea(ArrayList<langilea_class> langileaarray) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream ("Langileak.txt");
			ois=new ObjectInputStream(fis);
			obj = (langilea_class)ois.readObject();
			erabiltzaile_berria.langileaarray.add((langilea_class) obj);
			while(obj != null) {
				obj = (langilea_class)ois.readObject();
				erabiltzaile_berria.langileaarray.add((langilea_class) obj);
			}
			ois.close();
			}catch(IOException | ClassNotFoundException ioe) {
		}	
	}
	
	void kargatuPiezak(ArrayList<Pieza_class> piezakarray) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream ("Piezak.txt");
			ois=new ObjectInputStream(fis);
			obj = (Pieza_class)ois.readObject();
			piezakarray.add((Pieza_class) obj);
			while(obj != null) {
				obj = (Pieza_class)ois.readObject();
				piezakarray.add((Pieza_class) obj);
			}
			ois.close();
			}catch(IOException | ClassNotFoundException ioe) {
		}	
	}
	
	void kargatuLanak(ArrayList<Lana_class> lanakarray) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream ("Lanak.txt");
			ois=new ObjectInputStream(fis);
			obj = (Lana_class)ois.readObject();
			lanakarray.add((Lana_class) obj);
			while(obj != null) {
				obj = (Lana_class)ois.readObject();
				lanakarray.add((Lana_class) obj);
			}
			ois.close();
			}catch(IOException | ClassNotFoundException ioe) {
		}	
	}
}
