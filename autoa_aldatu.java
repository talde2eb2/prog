package Erronka2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class autoa_aldatu extends JFrame {

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
	private JList<String> list;
	//private Fitxategi_class f;
	private boolean matrikulakomp=false;
	protected static DefaultListModel<String> dlm_Nan= new DefaultListModel<String>();
	private JButton btn_Aldatu;
	private JScrollPane scrollPane_1;
	private int contador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					autoa_aldatu frame = new autoa_aldatu();
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
	public autoa_aldatu() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 394);
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
		Matrikula_testua.setBounds(83, 89, 86, 20);
		Matrikula_testua.setText("1234-ABC");
		contentPane.add(Matrikula_testua);
		Matrikula_testua.setColumns(10);
		
		Label_bezeroa = new JLabel("Bezeroa aukeratu");
		Label_bezeroa.setBounds(10, 138, 140, 14);
		contentPane.add(Label_bezeroa);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.setBounds(263, 107, 90, 35);
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btn_itzuli);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 159, 163, 35);
		if(comboBox.getItemCount()>0) {
			comboBox.removeAllItems();
		}
		for(int p=0;registro1.bezeroarrayr.size()>p;p++) {
				comboBox.addItem(registro1.bezeroarrayr.get(p).getNan());
		}
		contentPane.add(comboBox);
		
		btn_Aldatu = new JButton("Aldatu");
		btn_Aldatu.setBounds(263, 30, 90, 35);
		btn_Aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matrikulakomp=false;	
				if(matrikulakomp==false&&Marka_testua.getText().length()>0 && Modeloa_testua.getText().length()>0 && Matrikula_testua.getText().length()>0 && MatrikulaKonprobatzailea()==true) {
				registro1.autoaarrayr.get(contador).setMarka(Marka_testua.getText());
				registro1.autoaarrayr.get(contador).setModelo(Modeloa_testua.getText());
				registro1.autoaarrayr.get(contador).setMatrikula(Matrikula_testua.getText());
				Fitxategi_class auto = new Fitxategi_class();
				auto.gordeAutoa(registro1.autoaarrayr);
				}
				else {
					JOptionPane.showMessageDialog(null,(String)"Zerbait falta zaizu!!","Ez duzu amaitu",
								JOptionPane.INFORMATION_MESSAGE,null);
				}
			}
		});
		contentPane.add(btn_Aldatu);
		
		list = new JList<String>();
		list.setBounds(1, 1, 160, 142);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=list.getSelectedIndex();
				Marka_testua.setText(registro1.autoaarrayr.get(contador).getMarka());
				Modeloa_testua.setText(registro1.autoaarrayr.get(contador).getModelo());
				Matrikula_testua.setText(registro1.autoaarrayr.get(contador).getMatrikula());
			}
		});
		list.setModel(registro1.dlm_matrikula);
		contentPane.add(list);
		
		scrollPane_1 = new JScrollPane(list);
		scrollPane_1.setBounds(191, 159, 162, 144);
		contentPane.add(scrollPane_1);
		
		

		
		if(registro1.autoaarrayr.size()>0) {
			for(int p=0;p<registro1.autoaarrayr.size();p++) {
				if(registro1.dlm_matrikula.contains(registro1.autoaarrayr.get(p).getMatrikula())){
					
				}
				else {
					registro1.dlm_matrikula.addElement(registro1.autoaarrayr.get(p).getMatrikula());
				}
			}
		}
		
		
		if(registro1.bezeroarrayr.size()>0) {
			for(int p=0;p<registro1.bezeroarrayr.size();p++) {
				if(dlm_Nan.contains(registro1.bezeroarrayr.get(p).getNan())){
					
				}
				else {
					dlm_Nan.addElement(registro1.bezeroarrayr.get(p).getNan());
				}
			}
		}
	}
	private boolean MatrikulaKonprobatzailea() {//Funtzio hau konprobatuko du ea lehenengo 4 digitoak zenbakiak diren gero - dagoela eta azken 3 digitoak letrak direla
		Matrikula=Matrikula_testua.getText();
		if(Matrikula.length()==8) {
			for (int y = 0; y <=3 && bezero_aldatu.x==true; y++) {
				bezero_aldatu.c =Matrikula.charAt(y); 
				if(bezero_aldatu.c>='0'&& bezero_aldatu.c<='9') {
					bezero_aldatu.x=true;
				}
				else {
					bezero_aldatu.x=false;
				}
			}
			bezero_aldatu.c=Matrikula.charAt(4);
			if(bezero_aldatu.c==' '&& bezero_aldatu.x==true) {
				bezero_aldatu.x=true;	
			}
			else {
				bezero_aldatu.x=true;
			}
			for (int y = 5; y <=7 && bezero_aldatu.x==true; y++) {
				bezero_aldatu.c =Matrikula.charAt(y); 
				if(bezero_aldatu.c>='A'&& bezero_aldatu.c<='Z') {
					bezero_aldatu.x=true;
				}
				else {
					bezero_aldatu.x=false;
				}
			}
			
		}
		else {
			bezero_aldatu.x=false;
		}
		return bezero_aldatu.x;
	}
}


