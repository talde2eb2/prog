package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registro2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Label_aukeratu;
	private JButton btn_itzuli;
	private JButton btn_OT2;
	private JButton btn_Itxi;
	private JList<String> list;
	private JList<String> list_1;
	protected static String mat;
	protected static DefaultListModel<String> dlm_Mat= new DefaultListModel<String>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro2 frame = new registro2();
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
	public registro2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label_aukeratu = new JLabel("Aukeratu egin beharreko lana ");
		Label_aukeratu.setBounds(10, 12, 397, 14);
		contentPane.add(Label_aukeratu);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu frame = new menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(201, 214, 90, 35);
		contentPane.add(btn_itzuli);
		
		btn_OT2 = new JButton("Sartu OT2");
		btn_OT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OT2 frame = new OT2();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_OT2.setBounds(315, 214, 97, 35);
		contentPane.add(btn_OT2);
		btn_OT2.setVisible(false);
		
		list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_OT2.setVisible(true);
			}
		});
		list.setBounds(20, 37, 118, 166);
		list.setModel(dlm_Mat);
		contentPane.add(list);
		
		list_1 = new JList<String>();
		list_1.setBounds(160, 37, 250, 166);
		list_1.setModel(OT1.dlm_arazoa);
		contentPane.add(list_1);
		
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
		btn_Itxi.setBounds(10, 214, 90, 35);
		contentPane.add(btn_Itxi);
		
		
		if(autoa_sortu.autoaarray.size()>0) {
			for(int p=0;p<autoa_sortu.autoaarray.size();p++) {
				if(dlm_Mat.contains(autoa_sortu.autoaarray.get(p).getMatrikula())){
					
				}
				else {
					dlm_Mat.addElement(autoa_sortu.autoaarray.get(p).getMatrikula());
				}
			}
		}
		System.out.print(OT1.otarray.get(0).getArazoa());
		if(OT1.otarray.size()>0) {
			for(int p=0;p<OT1.otarray.size();p++) {
				if(OT1.dlm_arazoa.contains(OT1.otarray.get(p).getArazoa())){
					
				}
				else {
					OT1.dlm_arazoa.addElement(OT1.otarray.get(p).getArazoa());
				}
			}
		}
	}
}
