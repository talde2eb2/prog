package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class OT1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_gorde;
	private JButton btn_itzuli;
	private JButton btn_aldatu;
	private JLabel Label_Autoa;
	private JLabel Label_LanIzena;
	private JLabel Label_Fecha;
	private JLabel Label_Langilea;
	private JLabel Label_Data;
	private JLabel Label_Arazoak;
	private JLabel Label_LA;
	private JLabel Label_Bezeroa;
	private int pos=0;
	private JTextArea textArea;
	protected static DefaultListModel<String> dlm_arazoa= new DefaultListModel<String>();
	protected static ArrayList<OT_class> otarray = new ArrayList<OT_class>();
	protected static int contador;
	//private String ParteZenb;

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
		
		textArea = new JTextArea();
		textArea.setBounds(250, 144, 198, 294);
		contentPane.add(textArea);
		
		btn_gorde = new JButton("Gorde");
		btn_gorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
					OT_class ot=new OT_class(textArea.getText(),Label_Autoa.getText());
					otarray.add(ot);
			
					Fitxategi_class ot1 = new Fitxategi_class();
					ot1.GordeOt(otarray);			
			
					harrera_menua frame = new harrera_menua();
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
		btn_itzuli.setBounds(179, 486, 124, 35);
		contentPane.add(btn_itzuli);
		Label_Autoa = new JLabel(registro1.autoaarrayr.get(registro1.contador).getMatrikula());
		for(int i = 0;i<otarray.size();i++) {
			if(registro1.autoaarrayr.get(registro1.contador).getMatrikula().equals(otarray.get(i).getMat())) {
				textArea.setText(otarray.get(i).getArazoa());
				pos=i;
			}
		}
		Label_Autoa.setBounds(250, 30, 213, 14);
		contentPane.add(Label_Autoa);
		
		Label_LanIzena = new JLabel("Auto");
		Label_LanIzena.setText(Login.izena);
		Label_LanIzena.setBounds(250, 94, 46, 14);
		contentPane.add(Label_LanIzena);
		
		Label_Fecha = new JLabel(""+LocalDate.now());
		Label_Fecha.setBounds(250, 119, 77, 14);
		contentPane.add(Label_Fecha);
		
		Label_Langilea = new JLabel("Langilea");
		Label_Langilea.setBounds(46, 94, 77, 14);
		contentPane.add(Label_Langilea);
		
		Label_Data = new JLabel("Data");
		Label_Data.setBounds(46, 119, 77, 14);
		contentPane.add(Label_Data);
		
		Label_Arazoak = new JLabel("Arazoak");
		Label_Arazoak.setBounds(46, 144, 77, 14);
		contentPane.add(Label_Arazoak);
		
		Label_LA = new JLabel("LAN AGINDUA (OT) 1");
		Label_LA.setBounds(46, 8, 185, 58);
		contentPane.add(Label_LA);
		
		Label_Bezeroa = new JLabel(registro1.autoaarrayr.get(registro1.contador).getBezero());
		Label_Bezeroa.setBounds(250, 55, 213, 14);
		contentPane.add(Label_Bezeroa);
		
		btn_aldatu = new JButton("Aldatu");
		btn_aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otarray.get(pos).setArazoa(textArea.getText());
			}
		});
		btn_aldatu.setBounds(313, 486, 127, 35);
		contentPane.add(btn_aldatu);
		
		
	}
} 