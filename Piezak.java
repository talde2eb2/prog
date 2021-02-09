package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Piezak extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String Hornitzailea="";
	protected static String Pieza="";
	protected static String Prezioa="";
	private JPanel contentPane;
	private JTextField Hor_testua;
	private JTextField Pieza_testua;
	private JTextField PrezioaP_testua;
	private JTextField Kode_testua;
	private JLabel lblPieza_b;
	private JLabel lblPrezioaP;
	private JLabel lblHorni;
	private JLabel lblPieza;
	private JLabel lblKodea;
	private JList<String> Pieza_list;
	private JButton btn_gorde;
	private JButton btn_itzuli;
	private JButton btn_ezabatu;
	private JButton btn_aldatu;
	private Fitxategi_class f;
	private int contador;
	
	protected static DefaultListModel<String> dlm_pieza = new DefaultListModel<String>();
	protected static ArrayList<Pieza_class> piezakarray = new ArrayList<Pieza_class>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piezak frame = new Piezak();
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
	public Piezak() {
		f = new Fitxategi_class();
		f.kargatuPiezak(piezakarray);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/** ^^^^ Kargatu fitxategia arraylistan  */
		
		Hor_testua = new JTextField();
		Hor_testua.setBounds(118, 58, 296, 20);
		contentPane.add(Hor_testua);
		Hor_testua.setColumns(10);
		
		Pieza_testua = new JTextField();
		Pieza_testua.setBounds(118, 93, 296, 20);
		contentPane.add(Pieza_testua);
		Pieza_testua.setColumns(10);
		
		Kode_testua = new JTextField();
		Kode_testua.setBounds(159, 19, 86, 20);
		contentPane.add(Kode_testua);
		Kode_testua.setColumns(10);
		
		PrezioaP_testua = new JTextField();
		PrezioaP_testua.setBounds(118, 128, 95, 20);
		contentPane.add(PrezioaP_testua);
		PrezioaP_testua.setColumns(10);
		
		btn_gorde = new JButton("Gorde");
		btn_gorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Hor_testua.getText().length()>0 && Pieza_testua.getText().length()>0 && PrezioaP_testua.getText().length()>0) {
					int birpaza = JOptionPane.showConfirmDialog(null, (String)"Sartu dituzu datu guztiak ondo?","Leiho aldaketa",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
						try {
					if(birpaza==0) {
						Pieza_class pieza = new Pieza_class(Hor_testua.getText(),Pieza_testua.getText(),Integer.parseInt(PrezioaP_testua.getText()));
						piezakarray.add(pieza);
						Fitxategi_class piezak = new Fitxategi_class();
						piezak.gordePiezak(piezakarray);
						
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
		btn_gorde.setBounds(324, 341, 90, 35);
		contentPane.add(btn_gorde);
		
		
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieza_lana frame = new pieza_lana();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(23, 341, 90, 35);
		contentPane.add(btn_itzuli);
		
		
		
		btn_ezabatu = new JButton("Ezabatu");
		btn_ezabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				dlm_pieza.removeElementAt(contador);
				contador=-1;
				
				}
				catch(ArrayIndexOutOfBoundsException si){
					JOptionPane.showMessageDialog(null,"error");
				}
			}
		});
		btn_ezabatu.setBounds(224, 341, 90, 35);
		contentPane.add(btn_ezabatu);
		
		
		
		btn_aldatu = new JButton("Aldatu");
		btn_aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btn_aldatu.setBounds(123, 341, 90, 35);
		contentPane.add(btn_aldatu);
		
		
		lblPieza_b = new JLabel("Pieza");
		lblPieza_b.setBounds(13, 96, 95, 14);
		contentPane.add(lblPieza_b);
		
		lblPrezioaP = new JLabel("Prezioa");
		lblPrezioaP.setBounds(13, 131, 95, 14);
		contentPane.add(lblPrezioaP);
		
		lblHorni = new JLabel("Hornitzailea");
		lblHorni.setBounds(13, 61, 95, 14);
		contentPane.add(lblHorni);
		
		lblPieza = new JLabel("PIEZA");
		lblPieza.setBounds(13, 22, 95, 14);
		contentPane.add(lblPieza);
		
		lblKodea = new JLabel("Kodea:");
		lblKodea.setBounds(118, 22, 41, 14);
		contentPane.add(lblKodea);
		
		Pieza_list = new JList<String>();
		Pieza_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=Pieza_list.getSelectedIndex();
			}
		});
		Pieza_list.setModel(dlm_pieza);
		Pieza_list.setBounds(23, 183, 390, 142);
		contentPane.add(Pieza_list);
		
		JScrollPane scrollPane = new JScrollPane(Pieza_list);
		scrollPane.setBounds(24, 183, 390, 142);
		contentPane.add(scrollPane);
		


		if(Piezak.piezakarray.size()>0) {
			for(int p=0;p<Piezak.piezakarray.size();p++) {
					dlm_pieza.addElement(Piezak.piezakarray.get(p).toString());
				}
			}
		}
	}
