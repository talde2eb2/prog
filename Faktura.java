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
		lblNewLabel_16.setBounds(345, 36, 86, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_5 = new JLabel("Data");
		lblNewLabel_5.setBounds(249, 36, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Faktura zkia");
		lblNewLabel_6.setBounds(249, 11, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Auto");
		lblNewLabel_7.setBounds(345, 11, 86, 14);
		contentPane.add(lblNewLabel_7);
		
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
		
		JLabel lblNewLabel_17 = new JLabel("BEZEROAREN DATUAK:");
		lblNewLabel_17.setBounds(10, 78, 189, 14);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Izena");
		lblNewLabel_18.setBounds(30, 96, 80, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("Abizena");
		lblNewLabel_18_1.setBounds(30, 116, 80, 14);
		contentPane.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_18_2 = new JLabel("NAN/IFK");
		lblNewLabel_18_2.setBounds(30, 136, 80, 14);
		contentPane.add(lblNewLabel_18_2);
		
		JLabel lblNewLabel_18_3 = new JLabel("Helbidea");
		lblNewLabel_18_3.setBounds(30, 156, 80, 14);
		contentPane.add(lblNewLabel_18_3);
		
		JLabel lblNewLabel_18_4 = new JLabel("Telefonoa");
		lblNewLabel_18_4.setBounds(30, 176, 80, 14);
		contentPane.add(lblNewLabel_18_4);
		
		JLabel lblNewLabel_19 = new JLabel("Auto");
		lblNewLabel_19.setBounds(120, 96, 214, 14);
		contentPane.add(lblNewLabel_19);
		
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
	}
}
