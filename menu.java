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
	private JButton btn_mekanikaria;
	private JButton btn_Admin;
	private JButton btn_Itxi;
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
		setBounds(100, 100, 593, 137);
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
		btn_Harrera.setBounds(10, 49, 130, 35);
		contentPane.add(btn_Harrera);
		
		btn_mekanikaria = new JButton("Mekanikoa");
		btn_mekanikaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro2 frame = new registro2();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_mekanikaria.setBounds(150, 49, 130, 35);
		contentPane.add(btn_mekanikaria);
		
		btn_Admin = new JButton("Administradorea");
		btn_Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_menu frame = new Admin_menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Admin.setBounds(290, 49, 130, 35);
		contentPane.add(btn_Admin);
		
		btn_Itxi = new JButton("Itxi");
		btn_Itxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_Itxi.setBounds(430, 49, 130, 35);
		contentPane.add(btn_Itxi);
		
		Label_Kaixo = new JLabel("");
		Label_Kaixo.setText("Kaixo "+Login.izen);
		Label_Kaixo.setBounds(230, 11, 190, 47);
		contentPane.add(Label_Kaixo);
	}
}
