package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_Harrera;
	private JButton btn_Faktura;
	private JButton btn_mekanikaria;
	private JButton btn_Admin;
	private JButton btn_Itxi;
	private JButton btn_PiezaLana;
	private JLabel Label_Kaixo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn_Harrera = new JButton("Harrera");
		btn_Harrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				harrera_menua frame = new harrera_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Harrera.setBounds(10, 69, 130, 35);
		contentPane.add(btn_Harrera);
		
		btn_Faktura = new JButton("Faktura");
		btn_Faktura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Faktura.setBounds(434, 69, 130, 35);
		contentPane.add(btn_Faktura);
		
		btn_mekanikaria = new JButton("Mekanikoa");
		btn_mekanikaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mekaniko_menua frame = new mekaniko_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_mekanikaria.setBounds(150, 69, 130, 35);
		contentPane.add(btn_mekanikaria);
		
		btn_Admin = new JButton("Administradorea");
		btn_Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin frame = new admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Admin.setBounds(290, 69, 130, 35);
		contentPane.add(btn_Admin);
		
		btn_Itxi = new JButton("Itxi");
		btn_Itxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_Itxi.setBounds(434, 130, 130, 35);
		contentPane.add(btn_Itxi);
		
		Label_Kaixo = new JLabel("");
		Label_Kaixo.setText("Kaixo "+Login.izen);
		Label_Kaixo.setBounds(205, 11, 190, 47);
		contentPane.add(Label_Kaixo);
		
		btn_PiezaLana = new JButton("Pieza/Lana");
		btn_PiezaLana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieza_lana frame = new pieza_lana();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_PiezaLana.setBounds(10, 130, 130, 35);
		contentPane.add(btn_PiezaLana);
	}
}
