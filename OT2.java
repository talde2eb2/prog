package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

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
	private JLabel Label_idlana;
	private JLabel Label_langilea;
	private JLabel Label_Langile;
	private JLabel Label_ID;
	private JLabel Label_fecha;
	private JLabel Label_autoa;
	private JLabel Label_bezeroa;
	private JLabel Label_konponketak;
	private JLabel Label_OT2;
	private JLabel Label_eginda;
	private JLabel Label_Piezak;
	private JComboBox<String> Lana_box;
	private JComboBox<String> Pieza_box;
	private JList<String> list_arazoak;
	private JList<String> list_1;
	private JList<String> list_2;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

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
		setBounds(100, 100, 540, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn_gorde = new JButton("Gorde");
		btn_gorde.setBounds(74, 526, 89, 35);
		contentPane.add(btn_gorde);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro2 frame = new registro2();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(208, 526, 89, 35);
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
		
		Label_idlana = new JLabel("IdLana");
		Label_idlana.setBounds(74, 141, 112, 14);
		contentPane.add(Label_idlana);
		
		Label_langilea = new JLabel("Langilea");
		Label_langilea.setBounds(74, 116, 112, 14);
		contentPane.add(Label_langilea);
		
		Label_Langile = new JLabel("Auto");
		Label_Langile.setBounds(208, 116, 199, 14);
		contentPane.add(Label_Langile);
		
		Label_ID = new JLabel("Auto");
		Label_ID.setBounds(208, 141, 199, 14);
		contentPane.add(Label_ID);
		
		Label_fecha = new JLabel("Auto");
		Label_fecha.setBounds(208, 166, 199, 14);
		contentPane.add(Label_fecha);
		
		Label_autoa = new JLabel("Erabilgailua (vehiculo)");
		Label_autoa.setBounds(208, 40, 199, 14);
		contentPane.add(Label_autoa);
		
		Label_bezeroa = new JLabel("Bezeroa");
		Label_bezeroa.setBounds(208, 65, 199, 14);
		contentPane.add(Label_bezeroa);
		
		Label_konponketak = new JLabel("Konponketak");
		Label_konponketak.setBounds(74, 65, 112, 14);
		contentPane.add(Label_konponketak);
		
		Label_OT2 = new JLabel("LAN AGINDUA (OT) 2");
		Label_OT2.setBounds(74, 33, 112, 28);
		contentPane.add(Label_OT2);
		
		Label_eginda = new JLabel("Eginda");
		Label_eginda.setBounds(424, 419, 46, 14);
		contentPane.add(Label_eginda);
		
		list_arazoak = new JList<String>();
		list_arazoak.setBounds(208, 191, 199, 69);
		contentPane.add(list_arazoak);
		
		btn_sartu = new JButton("Sartu");
		btn_sartu.setBounds(417, 281, 89, 35);
		contentPane.add(btn_sartu);
		
		btn_sartu2 = new JButton("Sartu");
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
		list_1.setBounds(106, 373, 201, 132);
		contentPane.add(list_1);
		
		list_2 = new JList<String>();
		list_2.setBounds(317, 373, 90, 132);
		contentPane.add(list_2);
		
		btn_Ezabatu = new JButton("Ezabatu");
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
	}
}
