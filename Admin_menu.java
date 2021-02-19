package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_menu frame = new Admin_menu();
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
	public Admin_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_Erabiltzaileak = new JButton("Erabiltzaileak");
		btn_Erabiltzaileak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin frame = new admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Erabiltzaileak.setBounds(10, 11, 126, 40);
		contentPane.add(btn_Erabiltzaileak);
		
		JButton btn_Lanak = new JButton("Lanak");
		btn_Lanak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lanak frame = new Lanak();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Lanak.setBounds(173, 11, 126, 40);
		contentPane.add(btn_Lanak);
		
		JButton btn_Itzuli = new JButton("Itzuli");
		btn_Itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu frame = new menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Itzuli.setBounds(173, 76, 126, 40);
		contentPane.add(btn_Itzuli);
		
		JButton btn_Piezak = new JButton("Piezak");
		btn_Piezak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piezak frame = new Piezak();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Piezak.setBounds(10, 76, 126, 40);
		contentPane.add(btn_Piezak);
	}
}
