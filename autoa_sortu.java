package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class autoa_sortu extends JFrame {

	private static final long serialVersionUID = 1L;

	protected static String Marka="";
	protected static String Modeloa="";
	protected static String Matrikula="";
	
	
	private JPanel contentPane;
	private JTextField Marka_testua;
	private JTextField Modeloa_testua;
	private JTextField Matrikula_testua;
	private JLabel Label_marka;
	private JLabel Label_modeloa;
	private JLabel Label_matrikula;
	private JLabel Label_bezeroa;
	private JComboBox<String> comboBox;
	private JButton btn_itzuli;
	private JButton btn_gorde;
	private Fitxategi_class f;
	private boolean matrikulakomp=false;
	protected static ArrayList<autoa_class> autoaarray = new ArrayList<autoa_class>();
	protected static DefaultListModel<String> dlm_Nan= new DefaultListModel<String>();
	protected static ArrayList<bezero_class> bezeroarray = new ArrayList<bezero_class>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					autoa_sortu frame = new autoa_sortu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public autoa_sortu() {

		// System.out.println(comboBox.getItemCount());
		f = new Fitxategi_class();
		f.kargatuBezeroa(bezero_sortu.bezeroarray);
		f.kargatuBezeroa(registro1.bezeroarrayr);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label_marka = new JLabel("Marka");
		Label_marka.setBounds(10, 30, 63, 14);
		contentPane.add(Label_marka);
		
		Marka_testua = new JTextField();
		Marka_testua.setBounds(83, 27, 86, 20);
		contentPane.add(Marka_testua);
		Marka_testua.setColumns(10);
		
		Label_modeloa = new JLabel("Modeloa");
		Label_modeloa.setBounds(10, 61, 63, 14);
		contentPane.add(Label_modeloa);
		
		Modeloa_testua = new JTextField();
		Modeloa_testua.setBounds(83, 58, 86, 20);
		contentPane.add(Modeloa_testua);
		Modeloa_testua.setColumns(10);
		
		Label_matrikula = new JLabel("Matrikula");
		Label_matrikula.setBounds(10, 92, 63, 14);
		contentPane.add(Label_matrikula);
		
		Matrikula_testua = new JTextField();
		Matrikula_testua.setText("1234-ABC");
		Matrikula_testua.setBounds(83, 89, 86, 20);
		contentPane.add(Matrikula_testua);
		Matrikula_testua.setColumns(10);
		
		Label_bezeroa = new JLabel("Bezeroa aukeratu");
		Label_bezeroa.setBounds(10, 129, 140, 14);
		contentPane.add(Label_bezeroa);
		
		btn_gorde = new JButton("Gorde");
		btn_gorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							matrikulakomp=false;
		if(autoaarray.size()>0) {
			for(int i=0;i<autoaarray.size() && matrikulakomp==false ;i++) {
				if(Matrikula_testua.getText().equals(autoaarray.get(i).getMatrikula())) {
					matrikulakomp=true;	
				}
					
			}
		}		
				try {
				if(matrikulakomp==false&&Marka_testua.getText().length()>0 && Modeloa_testua.getText().length()>0 && Matrikula_testua.getText().length()>0 && MatrikulaKonprobatzailea()==true) {
					int birpaza = JOptionPane.showConfirmDialog(null, (String)"Sartu dituzu datu guztiak ondo?","Leiho aldaketa",
							JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
								if (birpaza==0) {
										
										autoa_class autoa =new autoa_class(Marka_testua.getText(),Modeloa_testua.getText(),Matrikula_testua.getText(),comboBox.getSelectedItem().toString());
										autoaarray.add(autoa);
										Fitxategi_class auto = new Fitxategi_class();
										auto.gordeAutoa(autoaarray);
										registro1 frame = new registro1();
										frame.setVisible(true);
										dispose();	
										
								}
							}	
						else {
							JOptionPane.showMessageDialog(null,(String)"Zerbait falta zaizu!!","Ez duzu amaitu",
										JOptionPane.INFORMATION_MESSAGE,null);
							}
				}
				catch(NullPointerException e1) {
					JOptionPane.showMessageDialog(null,(String)"txarto dago","Ez duzu amaitu",
							JOptionPane.INFORMATION_MESSAGE,null);
				}
				
			}
		});
		btn_gorde.setBounds(248, 30, 90, 35);
		contentPane.add(btn_gorde);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(248, 154, 90, 35);
		contentPane.add(btn_itzuli);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 154, 163, 35);
		contentPane.add(comboBox);
		
		
		
		if(comboBox.getItemCount()>0) {
			comboBox.removeAllItems();
		}
		
		for(int i=0;bezeroarray.size()>i;i++) {
			comboBox.addItem(bezeroarray.get(i).getNan());
	
		}
		if(bezero_sortu.bezeroarray.size()>0) {
			for(int p=0;p<bezero_sortu.bezeroarray.size();p++) {
				if(dlm_Nan.contains(bezero_sortu.bezeroarray.get(p).getNan())){
					
				}
				else {
					dlm_Nan.addElement(bezero_sortu.bezeroarray.get(p).getNan());
				}
			}
		}
	}
	private boolean MatrikulaKonprobatzailea() {//Funtzio hau konprobatuko du ea lehenengo 4 digitoak zenbakiak diren gero - dagoela eta azken 3 digitoak letrak direla
		Matrikula=Matrikula_testua.getText();
		if(Matrikula.length()==8) {
			for (int y = 0; y <=3 && bezero_sortu.x==true; y++) {
				bezero_sortu.c =Matrikula.charAt(y); 
				if(bezero_sortu.c>='0'&& bezero_sortu.c<='9') {
					bezero_sortu.x=true;
				}
				else {
					bezero_sortu.x=false;
				}
			}
			bezero_sortu.c=Matrikula.charAt(4);
			if(bezero_sortu.c==' '&& bezero_sortu.x==true) {
				bezero_sortu.x=true;	
			}
			else {
				bezero_sortu.x=true;
			}
			for (int y = 5; y <=7 && bezero_sortu.x==true; y++) {
				bezero_sortu.c =Matrikula.charAt(y); 
				if(bezero_sortu.c>='A'&& bezero_sortu.c<='Z') {
					bezero_sortu.x=true;
				}
				else {
					bezero_sortu.x=false;
				}
			}
			
		}
		else {
			bezero_sortu.x=false;
		}
		return bezero_sortu.x;
	}
}

