package Erronka2;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_sartu;
	private JButton btnEuskera;
	private JButton btnEspañol;
	private JPasswordField Pasahitza;
	private JTextField Erabiltzaile_testua;
	private JLabel Label_erabiltzailea;
	private JLabel Label_Pasahitza;
	private JLabel logoa;
	private Fitxategi_class f;
	protected static String izen;
	protected static String izena;
	protected static String xd;
	public static String erabiltzailemota="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		f = new Fitxategi_class();
		f.kargatuLangilea(admin.langileaarray);
		f.kargatuAutoa(registro1.autoaarrayr);
		f.kargatuBezeroa(registro1.bezeroarrayr);
		f.kargatuPiezak(Piezak.piezakarray);
		f.kargatuLanak(Lanak.lanakarray);
		f.kargatuOt(OT1.otarray);
		

		//lehenengo instalazioa
		if(admin.langileaarray.size()>=1) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn_sartu = new JButton("Sartu");
		btn_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<admin.langileaarray.size();i++) {
					if (admin.langileaarray.get(i).getErabiltzailea().equals(Erabiltzaile_testua.getText())) {
						if (admin.langileaarray.get(i).getPasahitza().equals(new String(Pasahitza.getPassword()))) {
							if (admin.langileaarray.get(i).getMota().equals("Admin")) {
								izen=Erabiltzaile_testua.getText();
								izena=admin.langileaarray.get(i).getIzena();
								menu frame = new menu();
								frame.setVisible(true);
								dispose();
								erabiltzailemota=admin.langileaarray.get(i).getMota();
							} else if (admin.langileaarray.get(i).getMota().equals("Harrera")) {
								izen=Erabiltzaile_testua.getText();
								izena=admin.langileaarray.get(i).getIzena();
								harrera_menua frame = new harrera_menua();
								frame.setVisible(true);
								dispose();
								erabiltzailemota=admin.langileaarray.get(i).getMota();
							} else if (admin.langileaarray.get(i).getMota().equals("Mekanikaria")) {
								izena=admin.langileaarray.get(i).getIzena();
								registro2 frame = new registro2();
								frame.setVisible(true);
								dispose();
								erabiltzailemota=admin.langileaarray.get(i).getMota();
							}
							try {
								admin.langileaarray.get(i).log();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							break;

						} else {
							JOptionPane.showMessageDialog(null,(String)"Pasahitza txarra","Txarto dago",
									JOptionPane.INFORMATION_MESSAGE,null);
							Erabiltzaile_testua.setText("");
							Pasahitza.setText("");
							break;
						}
						
					} else {
						
						if ((admin.langileaarray.size())-1 == i) {
							JOptionPane.showMessageDialog(null,(String)"Erabiltzailea ez da egokia","Txarto dago",
									JOptionPane.INFORMATION_MESSAGE,null);
							Erabiltzaile_testua.setText("");
							Pasahitza.setText("");
						}
					}
				}
				

			}
		});
		btn_sartu.setBounds(324, 207, 90, 35);
		contentPane.add(btn_sartu);
		
		Pasahitza = new JPasswordField();
		Pasahitza.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					//erabiltzaile_berria.langileaarray
					for(int i=0;i<admin.langileaarray.size();i++) {
						if (admin.langileaarray.get(i).getErabiltzailea().equals(Erabiltzaile_testua.getText())) {
							if (admin.langileaarray.get(i).getPasahitza().equals(new String(Pasahitza.getPassword()))) {
								if (admin.langileaarray.get(i).getMota().equals("Admin")) {
									izen=Erabiltzaile_testua.getText();
									izena=admin.langileaarray.get(i).getIzena();
									menu frame = new menu();
									frame.setVisible(true);
									dispose();
									erabiltzailemota=admin.langileaarray.get(i).getMota();
								} else if (admin.langileaarray.get(i).getMota().equals("Harrera")) {
									izen=Erabiltzaile_testua.getText();
									izena=admin.langileaarray.get(i).getIzena();
									harrera_menua frame = new harrera_menua();
									frame.setVisible(true);
									dispose();
									erabiltzailemota=admin.langileaarray.get(i).getMota();
								} else if (admin.langileaarray.get(i).getMota().equals("Mekanikaria")) {
									izena=admin.langileaarray.get(i).getIzena();
									registro2 frame = new registro2();
									frame.setVisible(true);
									dispose();
									erabiltzailemota=admin.langileaarray.get(i).getMota();
								}
								try {
									admin.langileaarray.get(i).log();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								break;

							} else {
								JOptionPane.showMessageDialog(null,(String)"Pasahitza txarra","Txarto dago",
										JOptionPane.INFORMATION_MESSAGE,null);
								Erabiltzaile_testua.setText("");
								Pasahitza.setText("");
								break;
							}
							
						} else {
							
							if ((admin.langileaarray.size())-1 == i) {
								JOptionPane.showMessageDialog(null,(String)"Erabiltzailea ez da egokia","Txarto dago",
										JOptionPane.INFORMATION_MESSAGE,null);
								Erabiltzaile_testua.setText("");
								Pasahitza.setText("");
							}
						}
					}
				}
			}
		});
		Pasahitza.setBounds(168, 172, 174, 24);
		contentPane.add(Pasahitza);
		
		Label_erabiltzailea = new JLabel("Erabiltzailea");
		Label_erabiltzailea.setBounds(45, 134, 113, 28);
		contentPane.add(Label_erabiltzailea);
		
		Label_Pasahitza = new JLabel("Pasahitza");
		Label_Pasahitza.setBounds(45, 173, 113, 23);
		contentPane.add(Label_Pasahitza);
		
		Erabiltzaile_testua = new JTextField();
		Erabiltzaile_testua.setBounds(168, 136, 174, 24);
		contentPane.add(Erabiltzaile_testua);
		Erabiltzaile_testua.setColumns(10);

		logoa = new JLabel();
		File sourceimage = new File("fotos/logoRA_psd.png");
		Image image;
		try {
		image = ImageIO.read(sourceimage);
		logoa = new JLabel(new ImageIcon(image));
		} catch (IOException e1) {
		logoa.setVisible(false);
		}
		logoa.setBounds(0, 11, 450, 114);
		contentPane.add(logoa);
		
		btnEspañol = new JButton("Espa\u00F1ol");
		btnEspañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label_erabiltzailea.setText("Usuario");
				Label_Pasahitza.setText("Contraseña");
				btn_sartu.setText("Entrar");
				registro1.btn_bilatu.setText("Buscar");
				btnEspañol.setVisible(false);
				btnEuskera.setVisible(true);
			}
		});
		btnEspañol.setBounds(10, 207, 89, 35);
		contentPane.add(btnEspañol);

		
		btnEuskera = new JButton("Euskera");
		btnEuskera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label_erabiltzailea.setText("Erabiltzailea");
				Label_Pasahitza.setText("Pasahitza");
				btn_sartu.setText("Sartu");
				btnEuskera.setVisible(false);
				btnEspañol.setVisible(true);
			}
		});
		btnEuskera.setBounds(109, 207, 89, 35);
		contentPane.add(btnEuskera);
		btnEuskera.setVisible(false);
		}
		else {
			try {
				setUndecorated(true);
				Lehenengo_erabiltzailea frame = new Lehenengo_erabiltzailea();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}