package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Lanak extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String Lana="";
	protected static String Langilea="";
	protected static String Prezioa="";
	private JPanel contentPane;
	private JTextField Lana_testua;
	private JTextField Langile_testua;
	private JTextField PrezioaL_testua;
	private JLabel lblLana;
	private JLabel lblKodea_1;
	private JLabel lbl_nkode_lana;
	private JList<String> Lana_list;
	private JButton btn_gorde_1;
	private JButton btn_itzuli_1;
	private JButton btn_ezabatu_1;
	private JButton btn_aldatu_1;
	private Fitxategi_class f;
	private int contador;

	protected static DefaultListModel<String> dlm_lana = new DefaultListModel<String>();
	protected static ArrayList<Lana_class> lanakarray = new ArrayList<Lana_class>();
	private static Object Lanakarray;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lanak frame = new Lanak();
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
	public Lanak() {
		f = new Fitxategi_class();
		f.kargatuLanak(lanakarray);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lana");
		lblNewLabel.setBounds(12, 68, 126, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Langilea");
		lblNewLabel_1.setBounds(12, 103, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prezioa");
		lblNewLabel_2.setBounds(12, 138, 126, 14);
		contentPane.add(lblNewLabel_2);
		
		Lana_testua = new JTextField();
		Lana_testua.setBounds(148, 65, 278, 20);
		contentPane.add(Lana_testua);
		Lana_testua.setColumns(10);
		
		Langile_testua = new JTextField();
		Langile_testua.setBounds(148, 100, 278, 20);
		contentPane.add(Langile_testua);
		Langile_testua.setColumns(10);
		
		PrezioaL_testua = new JTextField();
		PrezioaL_testua.setBounds(148, 135, 278, 20);
		contentPane.add(PrezioaL_testua);
		PrezioaL_testua.setColumns(10);
		
		
		btn_gorde_1 = new JButton("Gorde");				
		btn_gorde_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lana_testua.getText().length()>0 && Langile_testua.getText().length()>0 && PrezioaL_testua.getText().length()>0) {
					int birpaza = JOptionPane.showConfirmDialog(null, (String)"Sartu dituzu datu guztiak ondo?","Leiho aldaketa",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
						try {
					if(birpaza==0) {
						Lana_class lana = new Lana_class(Lana_testua.getText(),Langile_testua.getText(),Integer.parseInt(PrezioaL_testua.getText()));
						lanakarray.add(lana);
						Fitxategi_class lanak = new Fitxategi_class();
						lanak.gordeLanak(lanakarray);
					}
						
				else {
					JOptionPane.showMessageDialog(null,(String)"Zerbait falta zaizu!!","Ez duzu amaitu",
						JOptionPane.INFORMATION_MESSAGE,null);
				
				}}
				
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,(String)"Zenbakiak sartu!!","Ez duzu amaitu",
							JOptionPane.INFORMATION_MESSAGE,null);
				}
				}
		}});
		btn_gorde_1.setBounds(327, 353, 90, 35);
		contentPane.add(btn_gorde_1);

		btn_itzuli_1 = new JButton("Itzuli");
		btn_itzuli_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieza_lana frame = new pieza_lana();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli_1.setBounds(26, 353, 90, 35);
		contentPane.add(btn_itzuli_1);
		
		btn_ezabatu_1 = new JButton("Ezabatu");
		btn_ezabatu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				dlm_lana.removeElementAt(contador);
				contador=-1;
				
				}
				catch(ArrayIndexOutOfBoundsException si){
					JOptionPane.showMessageDialog(null,"error");
				}
			}
		});
		btn_ezabatu_1.setBounds(227, 353, 90, 35);
		contentPane.add(btn_ezabatu_1);
		
		
		btn_aldatu_1 = new JButton("Aldatu");
		btn_aldatu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_aldatu_1.setBounds(126, 353, 90, 35);
		contentPane.add(btn_aldatu_1);
		

		Lana_list = new JList<String>();
	    Lana_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=Lana_list.getSelectedIndex();
			}
		});
	    Lana_list.setModel(dlm_lana);
		Lana_list.setBounds(12, 166, 412, 156);
		contentPane.add(Lana_list);
		
		JScrollPane scrollPane = new JScrollPane(Lana_list);
		scrollPane.setBounds(24, 183, 412, 156);
		contentPane.add(scrollPane);
		
		lblLana = new JLabel("LANA");
		lblLana.setBounds(12, 22, 95, 14);
		contentPane.add(lblLana);
		
		lblKodea_1 = new JLabel("Kodea:");
		lblKodea_1.setBounds(117, 22, 41, 14);
		contentPane.add(lblKodea_1);
		
		lbl_nkode_lana = new JLabel("");
		lbl_nkode_lana.setBounds(164, 22, 84, 14);
		contentPane.add(lbl_nkode_lana);
		
		
		}
	
}
