package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JList;


public class Faktura extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static int fakturaznbk=0;
	protected static int totala=0;
	protected static int bez=0;
	protected static int beztotala=0;
	private JLabel lblIzen;
	private JButton btnEuskera;
	private JButton btnEspañol;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faktura frame = new Faktura();
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
	public Faktura() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Gorde");
		btnNewButton_3.setBounds(52, 569, 104, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Itzuli");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(166, 569, 104, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PDF Sortu");
		btnNewButton_5.setBounds(282, 569, 104, 35);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("Totala");
		lblNewLabel.setBounds(120, 460, 46, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BEZ-a");
		lblNewLabel_1.setBounds(120, 501, 46, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Totala");
		lblNewLabel_2.setBounds(249, 460, 86, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u20AC");
		lblNewLabel_3.setBounds(305, 290, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Lanak");
		lblNewLabel_4.setBounds(10, 290, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_16 = new JLabel(""+LocalDate.now());
		lblNewLabel_16.setBounds(339, 53, 86, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_5 = new JLabel("Data");
		lblNewLabel_5.setBounds(249, 53, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JList<String> list = new JList<String>();
		list.setBounds(10, 315, 234, 134);
		contentPane.add(list);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(249, 315, 51, 134);
		contentPane.add(list_1);
		
		JList<String> list_2 = new JList<String>();
		list_2.setBounds(305, 315, 120, 134);
		contentPane.add(list_2);
		
		JLabel lblNewLabel_8 = new JLabel("n\u00BA");
		lblNewLabel_8.setBounds(249, 290, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("t");
		lblNewLabel_9.setBounds(166, 460, 73, 30);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("b");
		lblNewLabel_10.setBounds(166, 501, 78, 30);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(249, 501, 86, 30);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("REKORD AUTORAK S.L.");
		lblNewLabel_12.setBounds(10, 11, 143, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Zumarralakarregi kalea, 13");
		lblNewLabel_13.setBounds(10, 25, 161, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Tfnoa: 6589003948");
		lblNewLabel_14.setBounds(10, 39, 143, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("NIF: 47839940F");
		lblNewLabel_15.setBounds(10, 53, 131, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel Label_BDatuak = new JLabel("BEZEROAREN DATUAK:");
		Label_BDatuak.setBounds(10, 78, 189, 14);
		contentPane.add(Label_BDatuak);
		
		JLabel Label_Izena = new JLabel("Izena");
		Label_Izena.setBounds(30, 96, 80, 14);
		contentPane.add(Label_Izena);
		
		JLabel Label_Abizena = new JLabel("Abizena");
		Label_Abizena.setBounds(30, 116, 80, 14);
		contentPane.add(Label_Abizena);
		
		JLabel Label_Nan = new JLabel("NAN/IFK");
		Label_Nan.setBounds(30, 136, 80, 14);
		contentPane.add(Label_Nan);
		
		JLabel Label_Helbidea = new JLabel("Helbidea");
		Label_Helbidea.setBounds(30, 156, 80, 14);
		contentPane.add(Label_Helbidea);
		
		JLabel Label_Telefonoa = new JLabel("Telefonoa");
		Label_Telefonoa.setBounds(30, 176, 80, 14);
		contentPane.add(Label_Telefonoa);
		
		lblIzen = new JLabel("Auto");
		lblIzen.setText("");
		lblIzen.setBounds(120, 96, 214, 14);
		contentPane.add(lblIzen);
		
		JLabel lblNewLabel_19_1 = new JLabel("Auto");
		lblNewLabel_19_1.setBounds(121, 116, 214, 14);
		contentPane.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_19_2 = new JLabel("Auto");
		lblNewLabel_19_2.setBounds(121, 136, 214, 14);
		contentPane.add(lblNewLabel_19_2);
		
		JLabel lblNewLabel_19_3 = new JLabel("Auto");
		lblNewLabel_19_3.setBounds(120, 156, 214, 14);
		contentPane.add(lblNewLabel_19_3);
		
		JLabel lblNewLabel_19_4 = new JLabel("Auto");
		lblNewLabel_19_4.setBounds(121, 176, 214, 14);
		contentPane.add(lblNewLabel_19_4);
		
		JLabel lblNewLabel_20 = new JLabel("IBILGAILUAREN DATUAK");
		lblNewLabel_20.setBounds(10, 201, 189, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Matrikula");
		lblNewLabel_21.setBounds(30, 226, 80, 14);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Modeloa");
		lblNewLabel_22.setBounds(30, 251, 80, 14);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Auto");
		lblNewLabel_23.setBounds(121, 226, 214, 14);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Auto");
		lblNewLabel_24.setBounds(120, 251, 214, 14);
		contentPane.add(lblNewLabel_24);
		
		btnEspañol = new JButton("Espa\u00F1ol");
		btnEspañol.setBounds(237, 7, 89, 23);
		contentPane.add(btnEspañol);
		
		btnEuskera = new JButton("Euskera");
		btnEuskera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEuskera.setBounds(336, 7, 89, 23);
		contentPane.add(btnEuskera);
		btnEuskera.setVisible(false);
		
		for(int i = 0;i<registro1.autoaarrayr.size();i++) {
			if (faktura_aukeratu.dlm_fak.getElementAt(faktura_aukeratu.list.getSelectedIndex()).equals(registro1.autoaarrayr.get(i).getMatrikula())) {
			for(int a = 0;a<registro1.bezeroarrayr.size();a++) {
				if(registro1.autoaarrayr.get(a).getBezero().equals(registro1.bezeroarrayr.get(a).getNan())) {
					lblIzen.setText(registro1.bezeroarrayr.get(a).getIzena());
					System.out.println("hola");
				}
			}
		}
	}
	}
}
