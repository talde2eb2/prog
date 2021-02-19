package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label_erabiltzailea;
	private JList<String> list;
	private JButton btn_berria;
	private JButton btn_ezabatu;
	private JButton btn_atzera;
	private int contador;
	Fitxategi_class langile = new Fitxategi_class();
	protected static DefaultListModel<String> dlm_erabiltzailea= new DefaultListModel<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		//ixteko programa eta minizatzeko botoiak kentzeko erabiltzen da 
		setUndecorated(true);
		
		//langileak fitxategitik kagatzen ditu arrayra 
		

		//hemen langileen erabiltzaileak arraytik dlmra jarri
		if(erabiltzaile_berria.langileaarray.size()>0) {
			for(int p=0;p<erabiltzaile_berria.langileaarray.size();p++) {
				if(dlm_erabiltzailea.contains(erabiltzaile_berria.langileaarray.get(p).getErabiltzailea())){
					
				}
				else {
					dlm_erabiltzailea.addElement(erabiltzaile_berria.langileaarray.get(p).getErabiltzailea());
				}
				
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label_erabiltzailea = new JLabel("Erabiltzaileak");
		label_erabiltzailea.setBounds(15, 5, 116, 32);
		contentPane.add(label_erabiltzailea);
		
		list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=list.getSelectedIndex();
			}
		});
		list.setModel(dlm_erabiltzailea);
		list.setBounds(15, 48, 257, 202);
		contentPane.add(list);
		
		btn_berria = new JButton("Berria");
		btn_berria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				erabiltzaile_berria frame = new erabiltzaile_berria();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_berria.setBounds(300, 48, 90, 35);
		contentPane.add(btn_berria);
		
		btn_ezabatu = new JButton("Ezabatu");
		btn_ezabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					dlm_erabiltzailea.removeElementAt(contador);	
					erabiltzaile_berria.langileaarray.remove(contador);
					contador=-1;
					}
					catch(ArrayIndexOutOfBoundsException si){
						JOptionPane.showMessageDialog(null,"error");
					}
				
			}
		});
		btn_ezabatu.setBounds(300, 94, 90, 35);
		contentPane.add(btn_ezabatu);
		
		btn_atzera = new JButton("Itzuli");
		btn_atzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				langile.gordeLangileak(erabiltzaile_berria.langileaarray);
				Admin_menu frame = new Admin_menu();
				frame.setVisible(true);
				dispose();				
				
			}
		});
		btn_atzera.setBounds(300, 140, 90, 35);
		contentPane.add(btn_atzera);
	
			
		
	}
}
