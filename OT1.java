package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

public class OT1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField arazoa_text;
	private JList arazoa_list;
	protected  DefaultListModel<String> dlm_arazoa= new DefaultListModel<String>();
	private int contador=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OT1 frame = new OT1();
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
	public OT1() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(450, 486, 124, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Itzuli");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(250, 486, 124, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Erabilgailua (vehiculo)");
		lblNewLabel.setBounds(250, 30, 213, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Auto");
		
		lblNewLabel_1.setBounds(250, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Auto");
		lblNewLabel_2.setBounds(250, 119, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Auto");
		lblNewLabel_3.setBounds(250, 144, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Langilea");
		lblNewLabel_5.setBounds(46, 94, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("IdLana");
		lblNewLabel_6.setBounds(46, 119, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Data");
		lblNewLabel_7.setBounds(46, 144, 77, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Arazoak");
		lblNewLabel_8.setBounds(46, 180, 77, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("LAN AGINDUA (OT) 1");
		lblNewLabel_9.setBounds(46, 30, 185, 58);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("Bezeroa");
		lblNewLabel_12.setBounds(250, 55, 213, 14);
		contentPane.add(lblNewLabel_12);
		
		arazoa_text = new JTextField();
		arazoa_text.setBounds(250, 177, 213, 35);
		contentPane.add(arazoa_text);
		arazoa_text.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Sartu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(arazoa_text.getText().equals("")) {
			
			JOptionPane.showMessageDialog(null,"error");
			}
		else {
				dlm_arazoa.addElement(arazoa_text.getText());
			}
				
			}
		});
		btnNewButton_3.setBounds(473, 176, 101, 35);
		contentPane.add(btnNewButton_3);
		
		arazoa_list = new JList<String>();
		arazoa_list.setModel(dlm_arazoa);
		arazoa_list.setBounds(250, 223, 213, 236);
		contentPane.add(arazoa_list);
	
		//contador=listlanak.getSelectedIndex();	
		
		
		
		JButton btnNewButton_4 = new JButton("Ezabatu");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//Programari galdetzen diogu ia listlanak zerrendatik elementu bat aukeratu dugun
					if (arazoa_list.getSelectedIndex()!=-1) {
					
						//Ezabatu aurreko elementua zerrendatik
						JOptionPane.showMessageDialog(null,"error");

					}
					
					//Lehenengo zerrendatik ez badugu elementu bat aukeratu 
					//bigarren zerrendako elementuak aukeratu ditugun ala ez galdetu
					else {
						if(arazoa_list.getSelectedIndex()!=-1) {

							//Ezabatu aurreko elementua zerrendatik
							dlm_arazoa.removeElementAt(contador);
						}
						else {
							//Atera mezua: ERROR
							JOptionPane.showMessageDialog(null,"error");
						}
					}
			}
		});
		btnNewButton_4.setBounds(473, 222, 101, 35);
		contentPane.add(btnNewButton_4);
	}
}
