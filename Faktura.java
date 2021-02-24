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
import java.awt.event.ActionEvent;
import javax.swing.JList;


public class Faktura extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static int fakturaznbk=0;
	protected static int totala=0;
	protected static int bez=0;
	protected static int beztotala=0;
	private JButton btn_Gorde;
	private JButton btn_Itzuli;
	private JButton btn_PDF;
	private JButton btnEuskera;
	private JButton btnEspañol;
	private JLabel Label_Total;
	private JLabel Label_Bez;
	private JLabel lblGuztira;
	private JLabel Label_€;
	private JLabel Label_Lanak;
	private JLabel Label_Fecha;
	private JLabel Label_Data;
	private JLabel Label_nº;
	private JLabel Label_Dirua;
	private JLabel Label_Bezdirua;
	private JLabel Label_datuak1;
	private JLabel Label_datuak2;
	private JLabel Label_datuak3;
	private JLabel Label_datuak4;
	private JLabel Label_datuak5;
	private JLabel Label_BDatuak;
	private JLabel Label_Izena;
	private JLabel Label_Abizena;
	private JLabel Label_Nan;
	private JLabel Label_Helbidea;
	private JLabel Label_Telefonoa;
	private JLabel lblIzen;
	private JLabel Label_Abizen;
	private JLabel Label_nan;
	private JLabel Label_Helbide;
	private JLabel Label_telefono;
	private JLabel Label_IDatuak;
	private JLabel Label_Matrikula;
	private JLabel Label_Modeloa;
	private JLabel Label_Mat;
	private JLabel Label_modelo;
	private JList<String> list;
	private JList<String> list_1;
	private JList<String> list_2;
	protected static DefaultListModel<String> dlm_piezalana= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_kant= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_prezioa= new DefaultListModel<String>();
	private JPanel contentPane;
	private String prezio_has;
	private String BEZ1;
	private String emaitza;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faktura frame = new Faktura();
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
	public Faktura() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn_Gorde = new JButton("Gorde");
		btn_Gorde.setBounds(52, 569, 104, 35);
		contentPane.add(btn_Gorde);
		
		btn_Itzuli = new JButton("Itzuli");
		btn_Itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_Itzuli.setBounds(166, 569, 104, 35);
		contentPane.add(btn_Itzuli);
		
		btn_PDF = new JButton("PDF Sortu");
		btn_PDF.setBounds(282, 569, 104, 35);
		contentPane.add(btn_PDF);
		
		Label_Total = new JLabel("");
		Label_Total.setBounds(120, 460, 46, 30);
		contentPane.add(Label_Total);
		
		Label_Bez = new JLabel("BEZ-a");
		Label_Bez.setBounds(120, 487, 46, 30);
		contentPane.add(Label_Bez);
		
		lblGuztira = new JLabel("Guztira");
		lblGuztira.setBounds(120, 528, 86, 30);
		contentPane.add(lblGuztira);
		
		Label_€ = new JLabel("\u20AC");
		Label_€.setBounds(305, 290, 46, 14);
		contentPane.add(Label_€);
		
		Label_Lanak = new JLabel("Lanak");
		Label_Lanak.setBounds(10, 290, 46, 14);
		contentPane.add(Label_Lanak);
		
		Label_Fecha = new JLabel(""+LocalDate.now());
		Label_Fecha.setBounds(339, 53, 86, 14);
		contentPane.add(Label_Fecha);
		
		Label_Data = new JLabel("Data");
		Label_Data.setBounds(249, 53, 86, 14);
		contentPane.add(Label_Data);
		
		list = new JList<String>();
		list.setModel(dlm_piezalana);
		list.setBounds(10, 315, 234, 134);
		contentPane.add(list);
		
		list_1 = new JList<String>();
		list_1.setModel(dlm_kant);
		list_1.setBounds(249, 315, 51, 134);
		contentPane.add(list_1);
		
		list_2 = new JList<String>();
		list_2.setModel(dlm_prezioa);
		list_2.setBounds(305, 315, 120, 134);
		contentPane.add(list_2);
		
		Label_nº = new JLabel("n\u00BA");
		Label_nº.setBounds(249, 290, 46, 14);
		contentPane.add(Label_nº);
		
		Label_Dirua = new JLabel("t");
		Label_Dirua.setBounds(166, 460, 73, 30);
		contentPane.add(Label_Dirua);
		
		Label_Bezdirua = new JLabel("b");
		Label_Bezdirua.setBounds(161, 487, 78, 30);
		contentPane.add(Label_Bezdirua);
		
		Label_datuak1 = new JLabel("New label");
		Label_datuak1.setBounds(166, 528, 86, 30);
		contentPane.add(Label_datuak1);
		
		Label_datuak2 = new JLabel("REKORD AUTORAK S.L.");
		Label_datuak2.setBounds(10, 11, 143, 14);
		contentPane.add(Label_datuak2);
		
		Label_datuak3 = new JLabel("Zumarralakarregi kalea, 13");
		Label_datuak3.setBounds(10, 25, 161, 14);
		contentPane.add(Label_datuak3);
		
		Label_datuak4 = new JLabel("Tfnoa: 6589003948");
		Label_datuak4.setBounds(10, 39, 143, 14);
		contentPane.add(Label_datuak4);
		
		Label_datuak5 = new JLabel("NIF: 47839940F");
		Label_datuak5.setBounds(10, 53, 131, 14);
		contentPane.add(Label_datuak5);
		
		Label_BDatuak = new JLabel("BEZEROAREN DATUAK:");
		Label_BDatuak.setBounds(10, 78, 189, 14);
		contentPane.add(Label_BDatuak);
		
		Label_Izena = new JLabel("Izena");
		Label_Izena.setBounds(30, 96, 80, 14);
		contentPane.add(Label_Izena);
		
		Label_Abizena = new JLabel("Abizena");
		Label_Abizena.setBounds(30, 116, 80, 14);
		contentPane.add(Label_Abizena);
		
		Label_Nan = new JLabel("NAN/IFK");
		Label_Nan.setBounds(30, 136, 80, 14);
		contentPane.add(Label_Nan);
		
		Label_Helbidea = new JLabel("Helbidea");
		Label_Helbidea.setBounds(30, 156, 80, 14);
		contentPane.add(Label_Helbidea);
		
		Label_Telefonoa = new JLabel("Telefonoa");
		Label_Telefonoa.setBounds(30, 176, 80, 14);
		contentPane.add(Label_Telefonoa);
		
		lblIzen = new JLabel("Auto");
		lblIzen.setText("");
		lblIzen.setBounds(120, 96, 214, 14);
		contentPane.add(lblIzen);
		
		Label_Abizen = new JLabel("");
		Label_Abizen.setBounds(121, 116, 214, 14);
		contentPane.add(Label_Abizen);
		
		Label_nan = new JLabel("");
		Label_nan.setBounds(121, 136, 214, 14);
		contentPane.add(Label_nan);
		
		Label_Helbide = new JLabel("");
		Label_Helbide.setBounds(120, 156, 214, 14);
		contentPane.add(Label_Helbide);
		
		Label_telefono = new JLabel("");
		Label_telefono.setBounds(121, 176, 214, 14);
		contentPane.add(Label_telefono);
		
		Label_IDatuak = new JLabel("IBILGAILUAREN DATUAK");
		Label_IDatuak.setBounds(10, 201, 189, 14);
		contentPane.add(Label_IDatuak);
		
		Label_Matrikula = new JLabel("Matrikula");
		Label_Matrikula.setBounds(30, 226, 80, 14);
		contentPane.add(Label_Matrikula);
		
		Label_Modeloa = new JLabel("Modeloa");
		Label_Modeloa.setBounds(30, 251, 80, 14);
		contentPane.add(Label_Modeloa);
		
		Label_Mat = new JLabel("");
		Label_Mat.setBounds(121, 226, 214, 14);
		contentPane.add(Label_Mat);
		
		Label_modelo = new JLabel("");
		Label_modelo.setBounds(120, 251, 214, 14);
		contentPane.add(Label_modelo);
		
		btnEspañol = new JButton("Espa\u00F1ol");
		btnEspañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnEuskera.setVisible(true);
				btnEspañol.setVisible(false);
			}
		});
		btnEspañol.setBounds(237, 7, 89, 35);
		contentPane.add(btnEspañol);
		
		btnEuskera = new JButton("Euskera");
		btnEuskera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnEspañol.setVisible(true);
				btnEuskera.setVisible(false);
			}
		});
		btnEuskera.setBounds(336, 7, 89, 35);
		contentPane.add(btnEuskera);
		btnEuskera.setVisible(false);
		for(int i = 0;i<registro1.autoaarrayr.size();i++) {
			if (faktura_aukeratu.dlm_fak.getElementAt(faktura_aukeratu.list.getSelectedIndex()).equals(registro1.autoaarrayr.get(i).getMatrikula())) {
			for(int a = 0;a<registro1.bezeroarrayr.size();a++) {
				if(registro1.autoaarrayr.get(i).getBezero().equals(registro1.bezeroarrayr.get(a).getNan())) {
					lblIzen.setText(registro1.bezeroarrayr.get(a).getIzena());
					Label_Abizen.setText(registro1.bezeroarrayr.get(a).getAbizena());
					Label_nan.setText(registro1.bezeroarrayr.get(a).getNan());
					Label_Helbide.setText(registro1.bezeroarrayr.get(a).getHelbidea());
					Label_telefono.setText(String.valueOf(registro1.bezeroarrayr.get(a).getTelefonoa()));
					Label_Mat.setText(registro1.autoaarrayr.get(i).getMatrikula());
					Label_modelo.setText(registro1.autoaarrayr.get(i).getModelo());
				}
			}
		}
	}
	for(int a = 0;a<OT1.otarray.get(faktura_aukeratu.contador).getOtarray_pieza().size();a++) {
		dlm_piezalana.addElement(OT1.otarray.get(0).getOtarray_pieza().get(a).getIzena());
		dlm_kant.addElement(String.valueOf(OT1.otarray.get(0).getOtarray_pieza().get(a).getKant()));
		dlm_prezioa.addElement(String.valueOf(OT1.otarray.get(0).getOtarray_pieza().get(a).getPrezioa()));
	}
	for(int a = 0;a<OT1.otarray.get(faktura_aukeratu.contador).getOtarray_lana().size();a++) {
		dlm_piezalana.addElement(OT1.otarray.get(0).getOtarray_lana().get(a).getIzena());
		dlm_kant.addElement(String.valueOf(OT1.otarray.get(0).getOtarray_lana().get(a).getKant()));
		dlm_prezioa.addElement(String.valueOf(OT1.otarray.get(0).getOtarray_lana().get(a).getPrezioa()));
	}
	kalkulua();
	Label_Dirua.setText(prezio_has);
	Label_Bezdirua.setText(BEZ1);
	Label_datuak1.setText(emaitza);
	
	}
	public void kalkulua() {
		double prez_has=0;
		double BEZ=0;
		double totala=0;
		for(int i=0;i<dlm_piezalana.getSize();i++) {
			prez_has=prez_has+(Double.parseDouble(dlm_kant.getElementAt(i))*Double.parseDouble(dlm_prezioa.getElementAt(i)));
		}
		BEZ=prez_has*0.21;
		totala=prez_has+BEZ;
		prezio_has=String.valueOf(prez_has);
		BEZ1=String.valueOf(BEZ);
		emaitza=String.valueOf(totala);
	}
}
	
