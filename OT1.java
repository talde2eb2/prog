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
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import javax.swing.JScrollPane;
public class OT1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_gorde;
	private JButton btn_itzuli;
	private JButton btn_ezabatu;
	private JLabel Label_Autoa;
	private JLabel Label_LanIzena;
	private JLabel Label_ID;
	private JLabel Label_Fecha;
	private JLabel Label_Langilea;
	private JLabel Label_id;
	private JLabel Label_Data;
	private JLabel Label_Arazoak;
	private JLabel Label_LA;
	private JLabel Label_Bezeroa;
	private JScrollPane scroll_lis;
	private JTextField arazoa_text;
	private JList<String> arazoa_list;
	protected  DefaultListModel<String> dlm_arazoa= new DefaultListModel<String>();
	protected static ArrayList<OT_class> otarray = new ArrayList<OT_class>();
	private int contador;
	private String ParteZenb;

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
		
		btn_gorde = new JButton("Gorde");
		btn_gorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
				
			OT_class ot=new OT_class(partezenb(),dlm_arazoa.getElementAt(0),false);
			otarray.add(ot);
			
			Fitxategi_class ot1 = new Fitxategi_class();
			ot1.GordeOt(otarray);
			
				System.out.println(otarray.get(0).Arazoa);
				
			
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();}
				catch(ArrayIndexOutOfBoundsException e2) {
					JOptionPane.showMessageDialog(null,"error");
					
				}
				
				
			}
		});
		btn_gorde.setBounds(450, 486, 124, 35);
		contentPane.add(btn_gorde);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(250, 486, 124, 35);
		contentPane.add(btn_itzuli);
		
		Label_Autoa = new JLabel("Erabilgailua (vehiculo)");
		Label_Autoa.setBounds(250, 30, 213, 14);
		contentPane.add(Label_Autoa);
		
		Label_LanIzena = new JLabel("Auto");
		
		Label_LanIzena.setBounds(250, 94, 46, 14);
		contentPane.add(Label_LanIzena);
		
		Label_ID = new JLabel(partezenb());
		
		Label_ID.setBounds(250, 119, 77, 14);
		contentPane.add(Label_ID);
		
		Label_Fecha = new JLabel(""+LocalDate.now());
		Label_Fecha.setBounds(250, 144, 77, 14);
		contentPane.add(Label_Fecha);
		
		Label_Langilea = new JLabel("Langilea");
		Label_Langilea.setBounds(46, 94, 77, 14);
		contentPane.add(Label_Langilea);
		
		Label_id = new JLabel("IdLana");
		Label_id.setBounds(46, 119, 77, 14);
		contentPane.add(Label_id);
		
		Label_Data = new JLabel("Data");
		Label_Data.setBounds(46, 144, 77, 14);
		contentPane.add(Label_Data);
		
		Label_Arazoak = new JLabel("Arazoak");
		Label_Arazoak.setBounds(46, 180, 77, 14);
		contentPane.add(Label_Arazoak);
		
		Label_LA = new JLabel("LAN AGINDUA (OT) 1");
		Label_LA.setBounds(46, 30, 185, 58);
		contentPane.add(Label_LA);
		
		Label_Bezeroa = new JLabel("Bezeroa");
		Label_Bezeroa.setBounds(250, 55, 213, 14);
		contentPane.add(Label_Bezeroa);
		
		arazoa_text = new JTextField();
		arazoa_text.setBounds(250, 177, 198, 35);
		contentPane.add(arazoa_text);
		arazoa_text.setColumns(10);
		//boton falta que solo se pueda meter 1 entrada
		JButton btn_sartu = new JButton("Sartu");
		btn_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(arazoa_text.getText().equals("")) {
			
			JOptionPane.showMessageDialog(null,"error");
			}
		else {
			dlm_arazoa.addElement(arazoa_text.getText());
			}
				
			}
		});
		btn_sartu.setBounds(473, 176, 101, 35);
		contentPane.add(btn_sartu);
		
		arazoa_list =  new JList<String>();
		arazoa_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=arazoa_list.getSelectedIndex();
				System.out.println(contador);  
			}
		
		});
		arazoa_list.setModel(dlm_arazoa);
		arazoa_list.setBounds(250, 223, 198, 236);
		contentPane.add(arazoa_list);
	
		
		
		
		
		btn_ezabatu = new JButton("Ezabatu");
		btn_ezabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				dlm_arazoa.removeElementAt(contador);
				contador=-1;
				
				}
				catch(ArrayIndexOutOfBoundsException si){
					JOptionPane.showMessageDialog(null,"error");
				}
	}
		});
		btn_ezabatu.setBounds(473, 222, 101, 35);
		contentPane.add(btn_ezabatu);
		
		scroll_lis = new JScrollPane(arazoa_list);
		scroll_lis.setBounds(250, 223, 198, 236);
		contentPane.add(scroll_lis);
	}
	public String partezenb() {
		
		//ID lan agindua sortu
		//lan agindualgordeta badaude:
		if (otarray.size()>=1) {
		String x;
		//arraylistaren azken elementuaren idBezeroa atera eta x bariablean gorde
		x=otarray.get(otarray.size()-1).getIdlana();

		//katearen lehenengo letra kendu (B123)
		x= x.substring(2, x.length());

		//Zzenbakieei bat gehitu
		int zenb=Integer.parseInt(x);
		zenb=zenb+1;
		System.out.println(zenb);
		//katea sortu eta baliablean gorde
		x="LA"+(zenb);
		ParteZenb=x;
		System.out.println(x);


		}
		else {
		//lehenendo bezeroaren id sortzeko
		String x="LA1";
		ParteZenb=x;
		System.out.println(ParteZenb);
		}
		return ParteZenb;

		}

} 