package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class faktura_aukeratu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected static JList<String> list;
	private JButton btn_aukeratu;
	private JButton btn_itzuli;
	protected static DefaultListModel<String> dlm_fak= new DefaultListModel<String>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					faktura_aukeratu frame = new faktura_aukeratu();
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
	public faktura_aukeratu() {
		dlm_fak.removeAllElements();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new JList<String>();
		list.setModel(dlm_fak);
		for(int i = 0;i < OT1.otarray.size();i++) {
			if(OT1.otarray.get(i).getEginda()==false) {
				dlm_fak.addElement(OT1.otarray.get(i).getMat());
			}
		}
		list.setBounds(10, 11, 257, 162);
		contentPane.add(list);
		
		btn_aukeratu = new JButton("Aukeratu");
		btn_aukeratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faktura frame = new Faktura();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_aukeratu.setBounds(307, 11, 90, 35);
		contentPane.add(btn_aukeratu);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				harrera_menua frame = new harrera_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(307, 138, 90, 35);
		contentPane.add(btn_itzuli);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 257, 162);
		contentPane.add(scrollPane);
	}
}
