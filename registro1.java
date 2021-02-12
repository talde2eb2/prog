package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registro1 extends JFrame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField bilatu_testua;
	private JTextField bilatu_testua2;
	private JList<String> list;
	private JList<String> list_1;
	private JButton btn_bilatu;
	private JButton btn_sortu;
	private JButton btn_bilatu2;
	private JButton btn_sortu2;
	private JButton btn_atzera;
	private JButton btn_atzera_1;
	private JButton btn_OT;
	private JLabel Label_nan;
	private JLabel Label_autoa;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private Fitxategi_class f;
	protected static DefaultListModel<String> dlm_Nan= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_matrikula= new DefaultListModel<String>();
	protected static ArrayList<bezero_class> bezeroarrayr = new ArrayList<bezero_class>();
	protected static ArrayList<autoa_class> autoaarrayr = new ArrayList<autoa_class>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro1 frame = new registro1();
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
	public registro1() {
		f = new Fitxategi_class();
		f.kargatuBezeroa(bezero_sortu.bezeroarray);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn_bilatu = new JButton("Bilatu");
		btn_bilatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean bil = false;
				for(int i = 0;i < dlm_Nan.getSize() && bil==false;i++) {
					if(dlm_Nan.getElementAt(i).equals(bilatu_testua.getText())) {
						bil = true;
						list.setSelectedIndex(i);
					}
				}
			}
		});
		btn_bilatu.setBounds(172, 40, 90, 35);
		contentPane.add(btn_bilatu);
		
		btn_sortu = new JButton("Sortu");
		btn_sortu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bezero_sortu frame = new bezero_sortu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_sortu.setBounds(172, 86, 90, 35);
		contentPane.add(btn_sortu);
		
		btn_bilatu2 = new JButton("Bilatu");
		btn_bilatu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean bil2 = false;
				for(int i = 0;i < dlm_matrikula.getSize() && bil2==false;i++) {
					if(dlm_matrikula.getElementAt(i).equals(bilatu_testua2.getText())) {
						bil2 = true;
						list_1.setSelectedIndex(i);
					}
				}
			}
		});
		btn_bilatu2.setBounds(421, 40, 90, 35);
		contentPane.add(btn_bilatu2);
		
		btn_sortu2 = new JButton("Sortu");
		btn_sortu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				autoa_sortu frame = new autoa_sortu();
				frame.setVisible(true);
				dispose();
				
				
			}
		});
		btn_sortu2.setBounds(421, 86, 90, 35);
		contentPane.add(btn_sortu2);
		
		btn_atzera = new JButton("Itzuli");
		btn_atzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				harrera_menua frame = new harrera_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_atzera.setBounds(223, 333, 89, 35);
		contentPane.add(btn_atzera);
		
		btn_OT = new JButton("Sartu OT");
		btn_OT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OT1 frame = new OT1();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_OT.setBounds(322, 333, 89, 35);
		contentPane.add(btn_OT);
		btn_OT.setVisible(false);
		
		bilatu_testua = new JTextField();
		bilatu_testua.setBounds(10, 41, 136, 34);
		contentPane.add(bilatu_testua);
		bilatu_testua.setColumns(10);
		
		bilatu_testua2 = new JTextField();
		bilatu_testua2.setBounds(275, 41, 136, 34);
		contentPane.add(bilatu_testua2);
		bilatu_testua2.setColumns(10);
		
		Label_nan = new JLabel("Bezeroa NAN, NIE edo IFK");
		Label_nan.setBounds(10, 16, 155, 14);
		contentPane.add(Label_nan);
		
		Label_autoa = new JLabel("Autoa matrikula");
		Label_autoa.setBounds(275, 16, 136, 14);
		contentPane.add(Label_autoa);
		
		list = new JList<String>();
		list.setModel(dlm_Nan);
		list.setBounds(10, 86, 136, 222);
		contentPane.add(list);
		
		list_1 = new JList<String>();
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_OT.setVisible(true);
			}
		});
		list_1.setModel(dlm_matrikula);
		list_1.setBounds(275, 86, 136, 222);
		contentPane.add(list_1);
		
		btn_atzera_1 = new JButton("Faktura");
		btn_atzera_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_atzera_1.setBounds(422, 333, 89, 35);
		contentPane.add(btn_atzera_1);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 86, 136, 222);
		contentPane.add(scrollPane);
		
		scrollPane_1 = new JScrollPane(list_1);
		scrollPane_1.setBounds(272, 86, 141, 222);
		contentPane.add(scrollPane_1);
		
		if(bezero_sortu.bezeroarray.size()>0) {
			for(int p=0;p<bezero_sortu.bezeroarray.size();p++) {
				if(dlm_Nan.contains(bezero_sortu.bezeroarray.get(p).getNan())){
					
				}
				else {
					dlm_Nan.addElement(bezero_sortu.bezeroarray.get(p).getNan());
				}
			}
		}
		if(registro1.bezeroarrayr.size()>0) {
			for(int p=0;p<registro1.bezeroarrayr.size();p++) {
				if(dlm_Nan.contains(registro1.bezeroarrayr.get(p).getNan())){
					
				}
				else {
					dlm_Nan.addElement(registro1.bezeroarrayr.get(p).getNan());
				}
			}
		}
		if(autoa_sortu.autoaarray.size()>0) {
			for(int p=0;p<autoa_sortu.autoaarray.size();p++) {
				if(dlm_matrikula.contains(autoa_sortu.autoaarray.get(p).getMatrikula())){
					
				}
				else {
					dlm_matrikula.addElement(autoa_sortu.autoaarray.get(p).getMatrikula());
				}
			}
		}
		if(registro1.autoaarrayr.size()>0) {
			for(int p=0;p<registro1.autoaarrayr.size();p++) {
				if(dlm_matrikula.contains(registro1.autoaarrayr.get(p).getMatrikula())){
					
				}
				else {
					dlm_matrikula.addElement(registro1.autoaarrayr.get(p).getMatrikula());
				}
			}
		}
	}
}
