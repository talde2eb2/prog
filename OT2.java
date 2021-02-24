package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class OT2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Konpoketa_testua;
	private JTextField Pieza_testua;
	private JButton btn_gorde;
	private JButton btn_itzuli;
	private JButton btn_Ezabatu;
	private JButton btn_sartu;
	private JButton btn_sartu2;
	private JRadioButton rdbtn_BaiEz;
	private JLabel Label_Konponketa;
	private JLabel Label_OT1;
	private JLabel Label_Data;
	private JLabel Label_langilea;
	private JLabel Label_Langile;
	private JLabel Label_fecha;
	private JLabel Label_autoa;
	private JLabel Label_bezeroa;
	private JLabel Label_konponketak;
	private JLabel Label_OT2;
	private JLabel Label_eginda;
	private JLabel Label_Piezak;
	private JComboBox<String> Lana_box;
	private JComboBox<String> Pieza_box;
	private JList<String> list_1;
	private JList<String> list_2;
	private JList<String> list_1_1;
	private JList<String> list_2_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	protected static DefaultListModel<String> dlm_lana= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_pieza= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_lanakant= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_piezakant= new DefaultListModel<String>();
	protected static ArrayList<Pieza_class> otarrayp = new ArrayList<Pieza_class>();
	protected static ArrayList<Lana_class> otarrayl = new ArrayList<Lana_class>();
	protected static ArrayList<OT_class> ot1 = new ArrayList<OT_class>();
	//private String ParteZenb;
	private int contador;
	//private int pos=0;
	private JTextArea textArea;
	private int m=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OT2 frame = new OT2();
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
	public OT2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(208, 186, 199, 84);
		contentPane.add(textArea);
		
		btn_gorde = new JButton("Gorde");
		btn_gorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int x = 0;
					while (x < dlm_lana.size()) {
						for(int y = 0; y < Lana_box.getItemCount();y++) {
							if (dlm_lana.getElementAt(x).equals(Lanak.lanakarray.get(y).getIzena())) {
								otarrayl.add(Lanak.lanakarray.get(y));
							}
						}
					x++;
					}
					x=0;
					while (x < dlm_pieza.size()) {
						for(int y = 0; y < Pieza_box.getItemCount();y++) {
							if (dlm_pieza.getElementAt(x).equals(Piezak.piezakarray.get(y).getIzena())) {
								otarrayp.add(Piezak.piezakarray.get(y));
							}
						}
					x++;
					}	
					int pos=-1;
					boolean xd=false;
					for(int i=0;i<ot1.size()&&xd==false;i++) {
						if(ot1.get(i).getMat().equals(registro2.dlm_Mat.getElementAt(registro2.contador))) {
						 pos=i;
						xd=true;	
						}
					}
					if(pos!=-1) {
					ot1.get(pos).setOtarray_lana(otarrayl);
					ot1.get(pos).setOtarray_pieza(otarrayp);
					}
					Fitxategi_class ot1 = new Fitxategi_class();
					ot1.GordeOt(OT1.otarray);			
					faktura_aukeratu frame = new faktura_aukeratu();
					frame.setVisible(true);
					dispose();}
					catch(ArrayIndexOutOfBoundsException e2) {
						JOptionPane.showMessageDialog(null,"error");
				
				}
			}
		});
		btn_gorde.setBounds(72, 666, 89, 35);
		contentPane.add(btn_gorde);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro2 frame = new registro2();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(208, 666, 89, 35);
		contentPane.add(btn_itzuli);
		
		rdbtn_BaiEz = new JRadioButton("BAI/EZ");
		rdbtn_BaiEz.setBounds(424, 440, 82, 23);
		contentPane.add(rdbtn_BaiEz);
		
		Label_Konponketa = new JLabel("Konponketa");
		Label_Konponketa.setBounds(10, 291, 112, 14);
		contentPane.add(Label_Konponketa);
		
		Label_OT1 = new JLabel("OT1 \u201Carazoa\u201D");
		Label_OT1.setBounds(74, 191, 124, 14);
		contentPane.add(Label_OT1);
		
		Label_Data = new JLabel("Data");
		Label_Data.setBounds(74, 166, 112, 14);
		contentPane.add(Label_Data);
		
		Label_langilea = new JLabel("Langilea");
		Label_langilea.setBounds(72, 141, 112, 14);
		contentPane.add(Label_langilea);
		
		Label_Langile = new JLabel("Auto");
		Label_Langile.setText(Login.izena);
		Label_Langile.setBounds(208, 141, 199, 14);
		contentPane.add(Label_Langile);
		

		
		Label_fecha = new JLabel(""+LocalDate.now());
		Label_fecha.setBounds(208, 166, 199, 14);
		contentPane.add(Label_fecha);
		
		Label_autoa = new JLabel(registro1.autoaarrayr.get(registro2.contador).getMatrikula());
		for(int i = 0;i<OT1.otarray.size();i++) {
			if(registro1.autoaarrayr.get(registro2.contador).getMatrikula().equals(OT1.otarray.get(i).getMat())) {
				textArea.setText(OT1.otarray.get(i).getArazoa());
				//pos=i;
			}
		}
		Label_autoa.setBounds(208, 40, 199, 14);
		contentPane.add(Label_autoa);
		
		Label_bezeroa = new JLabel(registro1.autoaarrayr.get(registro1.contador).getBezero());
		Label_bezeroa.setBounds(208, 65, 199, 14);
		contentPane.add(Label_bezeroa);
		
		Label_konponketak = new JLabel("Konponketak");
		Label_konponketak.setBounds(74, 65, 112, 14);
		contentPane.add(Label_konponketak);
		
		Label_OT2 = new JLabel("LAN AGINDUA (OT) 2");
		Label_OT2.setBounds(74, 33, 124, 28);
		contentPane.add(Label_OT2);
		
		Label_eginda = new JLabel("Eginda");
		Label_eginda.setBounds(424, 419, 46, 14);
		contentPane.add(Label_eginda);
		
		
		btn_sartu = new JButton("Sartu");
		btn_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Konpoketa_testua.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,"error");
					}
				else {
					dlm_lanakant.addElement(Konpoketa_testua.getText());
					dlm_lana.addElement(Lana_box.getSelectedItem().toString());
					}
							
			}
		});
		btn_sartu.setBounds(417, 281, 89, 35);
		
		contentPane.add(btn_sartu);
		
		btn_sartu2 = new JButton("Sartu");
		btn_sartu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pieza_testua.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,"error");
					}
				else {
					dlm_piezakant.addElement(Pieza_testua.getText());
					dlm_pieza.addElement(Pieza_box.getSelectedItem().toString());
					}
					
			}
		});
		btn_sartu2.setBounds(417, 327, 89, 35);
		contentPane.add(btn_sartu2);
		
		Lana_box = new JComboBox<String>();
		for(int l=0;Lanak.lanakarray.size()>l;l++)
			Lana_box.addItem(Lanak.lanakarray.get(l).getIzena());
		
		Lana_box.setBounds(106, 281, 201, 35);
		contentPane.add(Lana_box);
		
		Pieza_box = new JComboBox<String>();
		for(int p=0;Piezak.piezakarray.size()>p;p++)
			Pieza_box.addItem(Piezak.piezakarray.get(p).getIzena());
		Pieza_box.setBounds(106, 327, 201, 35);
		contentPane.add(Pieza_box);
		
		Label_Piezak = new JLabel("Piezak");
		Label_Piezak.setBounds(10, 337, 46, 14);
		contentPane.add(Label_Piezak);
		
		list_1 = new JList<String>();
		list_1.setModel(dlm_lana);
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=list_1.getSelectedIndex();
				m=1;
			}
		});
		
		list_1.setBounds(106, 373, 201, 132);
		contentPane.add(list_1);
		
		list_2 = new JList<String>();
		list_2.setModel(dlm_lanakant);
		list_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		list_2.setBounds(317, 373, 90, 132);
		
		contentPane.add(list_2);
		
		btn_Ezabatu = new JButton("Ezabatu");
		btn_Ezabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(m==1) {
					dlm_lana.removeElementAt(contador);
					dlm_lanakant.removeElementAt(contador);
				}
				else if(m==2){
					dlm_pieza.removeElementAt(contador);
					dlm_piezakant.removeElementAt(contador);
				}
			}
		});
		btn_Ezabatu.setBounds(417, 373, 89, 35);
		contentPane.add(btn_Ezabatu);
		
		Konpoketa_testua = new JTextField();
		Konpoketa_testua.setBounds(317, 280, 90, 35);
		contentPane.add(Konpoketa_testua);
		Konpoketa_testua.setColumns(10);
		
		Pieza_testua = new JTextField();
		Pieza_testua.setColumns(10);
		Pieza_testua.setBounds(317, 327, 90, 35);
		contentPane.add(Pieza_testua);
		
		scrollPane = new JScrollPane(list_1);
		scrollPane.setBounds(106, 373, 201, 132);
		contentPane.add(scrollPane);
		
		scrollPane_1 = new JScrollPane(list_2);
		scrollPane_1.setBounds(317, 373, 89, 132);
		contentPane.add(scrollPane_1);
		
		textArea = new JTextArea();
		textArea.setBounds(208, 186, 199, 84);
		contentPane.add(textArea);
		
		list_1_1 = new JList<String>();
		list_1_1.setModel(dlm_pieza);
		list_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=list_1_1.getSelectedIndex();  
				m=2;
			}
		});
		
		list_1_1.setBounds(106, 516, 199, 130);
		contentPane.add(list_1_1);
		
		list_2_1 = new JList<String>();
		list_2_1.setModel(dlm_piezakant);
		list_2_1.setBounds(317, 516, 87, 130);
		contentPane.add(list_2_1);
		
		if(OT1.otarray.size()>0) {
			for(int p=0;p<OT1.otarray.size();p++) {
				if(OT1.dlm_arazoa.contains(OT1.otarray.get(p).getArazoa())){
					
				}
				else {
					OT1.dlm_arazoa.addElement(OT1.otarray.get(p).getArazoa());
				}
			}
		}
	}
}
