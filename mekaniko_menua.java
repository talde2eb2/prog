package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mekaniko_menua extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_mekanikaria;
	private JButton btn_Itxi;
	private JLabel Label_Izena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mekaniko_menua frame = new mekaniko_menua();
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
	public mekaniko_menua() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn_mekanikaria = new JButton("Mekanikaria");
		btn_mekanikaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro2 frame = new registro2();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_mekanikaria.setBounds(10, 47, 144, 35);
		contentPane.add(btn_mekanikaria);
		
		btn_Itxi = new JButton("Itxi");
		btn_Itxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Login.erabiltzailemota.equals("Admin")) {
					menu frame = new menu();
					frame.setVisible(true);
					dispose();
				}
				if(Login.erabiltzailemota.equals("Mekanikaria")) {
					System.exit(0);
				}
			}
		});
		btn_Itxi.setBounds(280, 47, 144, 35);
		contentPane.add(btn_Itxi);
		
		Label_Izena = new JLabel("Kaixo \u201CErabiltzailearen izena\u201D");
		Label_Izena.setBounds(10, 11, 414, 25);
		contentPane.add(Label_Izena);
	}

}
