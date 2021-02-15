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
	private JPasswordField Pasahitza;
	private JTextField Erabiltzaile_testua;
	private JLabel Label_erabiltzailea;
	private JLabel Label_Pasahitza;
	private JLabel logoa;
	private Fitxategi_class f;
	protected static String izen;
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
		f.kargatuLangilea(erabiltzaile_berria.langileaarray);
		f.kargatuAutoa(registro1.autoaarrayr);
		f.kargatuBezeroa(registro1.bezeroarrayr);
		f.kargatuBezeroa(bezero_sortu.bezeroarray);
		f.kargatuAutoa(autoa_sortu.autoaarray);
		f.kargatuBezeroa(autoa_sortu.bezeroarray);
		f.kargatuPiezak(Piezak.piezakarray);
		f.kargatuLanak(Lanak.lanakarray);
		
		
	
		
		//lehenengo instalazioa
		if(erabiltzaile_berria.langileaarray.size()>=1) {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		btn_sartu = new JButton("Sartu");
		btn_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<erabiltzaile_berria.langileaarray.size();i++) {
					if (erabiltzaile_berria.langileaarray.get(i).getErabiltzailea().equals(Erabiltzaile_testua.getText())) {
						if (erabiltzaile_berria.langileaarray.get(i).getPasahitza().equals(new String(Pasahitza.getPassword()))) {
							if (erabiltzaile_berria.langileaarray.get(i).getMota().equals("Admin")) {
								izen=Erabiltzaile_testua.getText();
								menu frame = new menu();
								frame.setVisible(true);
								dispose();
								erabiltzailemota=erabiltzaile_berria.langileaarray.get(i).getMota();
							} else if (erabiltzaile_berria.langileaarray.get(i).getMota().equals("Harrera")) {
								harrera_menua frame = new harrera_menua();
								frame.setVisible(true);
								dispose();
								erabiltzailemota=erabiltzaile_berria.langileaarray.get(i).getMota();
							} else if (erabiltzaile_berria.langileaarray.get(i).getMota().equals("Mekanikaria")) {
								registro2 frame = new registro2();
								frame.setVisible(true);
								dispose();
								erabiltzailemota=erabiltzaile_berria.langileaarray.get(i).getMota();
							}
							break;

						} else {
							JOptionPane.showMessageDialog(null,(String)"Pasahitza txarra","Txarto dago",
									JOptionPane.INFORMATION_MESSAGE,null);
							break;
						}
						
					} else {
						
						if ((erabiltzaile_berria.langileaarray.size())-1 == i) {
							JOptionPane.showMessageDialog(null,(String)"Erabiltzailea ez da egokia","Txarto dago",
									JOptionPane.INFORMATION_MESSAGE,null);
						}
					}
				}
				

			}
		});
		btn_sartu.setBounds(323, 205, 90, 35);
		contentPane.add(btn_sartu);
		
		Pasahitza = new JPasswordField();
		Pasahitza.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					//erabiltzaile_berria.langileaarray
			
					
					
					
					
					for(int i=0;i<erabiltzaile_berria.langileaarray.size();i++) {
						if (erabiltzaile_berria.langileaarray.get(i).getErabiltzailea().equals(Erabiltzaile_testua.getText())) {
							if (erabiltzaile_berria.langileaarray.get(i).getPasahitza().equals(new String(Pasahitza.getPassword()))) {
								if (erabiltzaile_berria.langileaarray.get(i).getMota().equals("Admin")) {
									izen=Erabiltzaile_testua.getText();
									menu frame = new menu();
									frame.setVisible(true);
									dispose();
									erabiltzailemota=erabiltzaile_berria.langileaarray.get(i).getMota();
								} else if (erabiltzaile_berria.langileaarray.get(i).getMota().equals("Harrera")) {
									harrera_menua frame = new harrera_menua();
									frame.setVisible(true);
									dispose();
									erabiltzailemota=erabiltzaile_berria.langileaarray.get(i).getMota();
								} else if (erabiltzaile_berria.langileaarray.get(i).getMota().equals("Mekanikaria")) {
									registro2 frame = new registro2();
									frame.setVisible(true);
									dispose();
									erabiltzailemota=erabiltzaile_berria.langileaarray.get(i).getMota();
								}
								break;

							} else {
								JOptionPane.showMessageDialog(null,(String)"Pasahitza txarra","Txarto dago",
										JOptionPane.INFORMATION_MESSAGE,null);
								break;
							}
							
						} else {
							
							if ((erabiltzaile_berria.langileaarray.size())-1 == i) {
								JOptionPane.showMessageDialog(null,(String)"Erabiltzailea ez da egokia","Txarto dago",
										JOptionPane.INFORMATION_MESSAGE,null);
							}
						}
					}
				}
			}
		});
		Pasahitza.setBounds(168, 167, 174, 24);
		contentPane.add(Pasahitza);
		
		Label_erabiltzailea = new JLabel("Erabiltzailea");
		Label_erabiltzailea.setBounds(45, 129, 113, 28);
		contentPane.add(Label_erabiltzailea);
		
		Label_Pasahitza = new JLabel("Pasahitza");
		Label_Pasahitza.setBounds(45, 168, 113, 23);
		contentPane.add(Label_Pasahitza);
		
		Erabiltzaile_testua = new JTextField();
		Erabiltzaile_testua.setBounds(168, 131, 174, 24);
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
		logoa.setBounds(0, 26, 450, 94);
		contentPane.add(logoa);
		}
		else {
			try {
				erabiltzaile_berria frame = new erabiltzaile_berria();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		}
	}
