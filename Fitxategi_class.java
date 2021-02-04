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
}
