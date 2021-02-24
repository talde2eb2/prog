package Erronka2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bezero_aldatu extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static String Izena="";
	protected static String Abizena="";
	protected static String Email="";
	protected static String Telefonoa="";
	protected static String Helbidea="";
	protected static String NAN="";
	protected static String CIF="";
	protected static String NIE="";
	protected static boolean x;
	protected static char c;
	private static JComboBox<String> Dokumentazio_mota;
	private JPanel contentPane;
	private static JTextField Izena_testua;
	private static JTextField Abizena_testua;
	private static JTextField Email_testua;
	private static JTextField Telefono_testua;
	private static JTextField Helbide_testua;
	private static JTextField Nan_testua;
	private JLabel Label_izena;
	private JLabel Label_Abizena;
	private JLabel Label_email;
	private JLabel Label_telefonoa;
	private JLabel Label_helbidea;
	private JButton btn_itzuli;
	private JButton btn_gorde_1;
	private JList<String> list;
	private int contador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bezero_aldatu frame = new bezero_aldatu();
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
	public bezero_aldatu() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label_izena = new JLabel("Izena");
		Label_izena.setBounds(10, 33, 70, 14);
		contentPane.add(Label_izena);
		
		Label_Abizena = new JLabel("Abizena");
		Label_Abizena.setBounds(10, 58, 70, 14);
		contentPane.add(Label_Abizena);
		
		Label_email = new JLabel("E-mail");
		Label_email.setBounds(10, 83, 70, 14);
		contentPane.add(Label_email);
		
		Label_telefonoa = new JLabel("Telefonoa");
		Label_telefonoa.setBounds(10, 108, 70, 14);
		contentPane.add(Label_telefonoa);
		
		Label_helbidea = new JLabel("Helbidea");
		Label_helbidea.setBounds(10, 133, 70, 14);
		contentPane.add(Label_helbidea);
		
		Izena_testua = new JTextField();
		Izena_testua.setBounds(108, 30, 150, 20);
		contentPane.add(Izena_testua);
		Izena_testua.setColumns(10);
		
		Abizena_testua = new JTextField();
		Abizena_testua.setBounds(108, 55, 150, 20);
		contentPane.add(Abizena_testua);
		Abizena_testua.setColumns(10);
		
		Email_testua = new JTextField();
		Email_testua.setBounds(108, 80, 150, 20);
		contentPane.add(Email_testua);
		Email_testua.setColumns(10);
		
		Telefono_testua = new JTextField();
		Telefono_testua.setBounds(108, 105, 150, 20);
		contentPane.add(Telefono_testua);
		Telefono_testua.setColumns(10);
		
		Helbide_testua = new JTextField();
		Helbide_testua.setBounds(108, 130, 150, 20);
		contentPane.add(Helbide_testua);
		Helbide_testua.setColumns(10);
		
		Dokumentazio_mota = new JComboBox<String>();
		Dokumentazio_mota.addItem("NAN");
		Dokumentazio_mota.addItem("NIE");
		Dokumentazio_mota.addItem("IFK");
		Dokumentazio_mota.setBounds(10, 154, 70, 22);
		contentPane.add(Dokumentazio_mota);
		
		Nan_testua = new JTextField();
		Nan_testua.setBounds(108, 155, 150, 20);
		contentPane.add(Nan_testua);
		Nan_testua.setColumns(10);
		
		btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(10, 187, 90, 35);
		contentPane.add(btn_itzuli);
		
		btn_gorde_1 = new JButton("Aldatu");
		btn_gorde_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Izena_testua.getText().length()>0 && Nan_testua.getText().length()>0 && Helbide_testua.getText().length()>0 && Telefono_testua.getText().length()>0 &&Helbide_testua.getText().length()>0 && Telefono_testua.getText().length()==9  && KonprobatzaileaTelef()==true && KonprobatzaileaDokumentazioa()==true) {
					registro1.bezeroarrayr.get(contador).setIzena(Izena_testua.getText());
					registro1.bezeroarrayr.get(contador).setAbizena(Abizena_testua.getText());
					registro1.bezeroarrayr.get(contador).setEmail(Email_testua.getText());
					registro1.bezeroarrayr.get(contador).setTelefonoa(Integer.parseInt(Telefono_testua.getText()));
					registro1.bezeroarrayr.get(contador).setHelbidea(Helbide_testua.getText());
					registro1.bezeroarrayr.get(contador).setNan(Nan_testua.getText());
					Fitxategi_class bezero = new Fitxategi_class();
					bezero.gordeBezeroa(registro1.bezeroarrayr);
					
				}
				else {
					JOptionPane.showMessageDialog(null,(String)"Zerbait falta zaizu!!","Ez duzu amaitu",
								JOptionPane.INFORMATION_MESSAGE,null);
				}
			}
		});
		btn_gorde_1.setBounds(312, 187, 90, 35);
		contentPane.add(btn_gorde_1);
		
		list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador=list.getSelectedIndex();
				Izena_testua.setText(registro1.bezeroarrayr.get(contador).getIzena());
				Abizena_testua.setText(registro1.bezeroarrayr.get(contador).getAbizena());
				Email_testua.setText(registro1.bezeroarrayr.get(contador).getEmail());
				Telefono_testua.setText(String.valueOf(registro1.bezeroarrayr.get(contador).getTelefonoa()));
				Helbide_testua.setText(registro1.bezeroarrayr.get(contador).getHelbidea());
				Nan_testua.setText(registro1.bezeroarrayr.get(contador).getNan());
				
			}
		});
		list.setModel(registro1.dlm_Nan);
		list.setBounds(276, 29, 126, 147);
		contentPane.add(list);
	}
	private boolean KonprobatzaileaTelef() {//Funtzio hau Konprobatuko du telefono JTextField-ean bakarrik zenbakiak egongo direla
        boolean emaitza;
        Telefonoa=Telefono_testua.getText();
        try {
            Double.parseDouble(Telefonoa);
            emaitza = true;
        } catch (NumberFormatException excepcion) {
            emaitza = false;
        }

        return emaitza;
    }
	private boolean KonprobatzaileaDokumentazioa() {//Funtzio hau konprobatuko du combo box-an zein akueratu den eta Faktura6-an JLabel-a aldatuko du 
		boolean Konpr=true; 
		if(Dokumentazio_mota.getSelectedIndex()==0) {
			if(NAN_Konprobatzailea()==true) {
				Konpr=true;
			}
			else {
				Konpr=false;
			}
		}
		else if(Dokumentazio_mota.getSelectedIndex()==1) {
			if(NIE_Konprobatzailea()==true) {
				Konpr=true;
			}
			else {
				
				Konpr=false;
			}
		}
		else if(Dokumentazio_mota.getSelectedIndex()==2) {
			if(CIF_Konprobatzailea()==true) {
				Konpr=true;
			}
			else {
				Konpr=false;
			}
		}
		return Konpr;
	}
	private boolean NAN_Konprobatzailea() {//Funtzio hau konprobatuko du NAN-a aukeratzean ea 9 digito dauden, lehengo 8 digitoak zenbakiak direla, azken digitoa letra bat dela eta ea letra hori letra kontrolaren berdina dela
		NAN=Nan_testua.getText();
		int resto=0;
		char Letra = 0;
		int sum;
		char Letra_array;
		char[] letrak={'T' ,'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		
		x = true;
		if (NAN.length()==9) {
			for (int y = 0; y <=7 && x==true; y++) {
				c = NAN.charAt(y); 
				if(c>='0'&& c<='9') {
					x=true;
				}
				else {
	        	x=false;
				}
			}
			c = NAN.charAt(8); 
			if ((c >= 'A' && c <= 'Z') && x==true) {
	           x=true;
	           Letra=NAN.charAt(8);
	        }
	        else {
	        	x=false;
	        }
			sum=Integer.parseInt(bezero_aldatu.NAN.substring(0,8));
			resto=sum % 23;
			Letra_array=letrak[resto];
			if(Letra==Letra_array && x==true) {
				x=true;
			}
			else {
				x=false;
			}
		}
		else {
			x=false;
		}
		
			
		return x;
	}
	private boolean CIF_Konprobatzailea() {////Funtzio hau konprobatuko du CIF-a aukeratzean ea 9 digito dauden eta ea lehengoa letra dela eta beste guztiak zenbakiak
		CIF=Nan_testua.getText();
		x=true;
		if (CIF.length()==9) {
			c = CIF.charAt(0); 
			if ((c >= 'A' && c <= 'Z') && x==true) {
	           x=true;
	        }
	        else {
	        	x=false;
	        }
			for (int y = 1; y <=8 && x==true; y++) {
				c = CIF.charAt(y); 
				if(c>='0'&& c<='9') {
					x=true;
				}
				else {
					x=false;
				}
			}
		}
		else {
			x=false;
		}	
		return x;
	}
	private boolean NIE_Konprobatzailea() {//Funtzio hau konprobatuko du NIE 9 digitoak badira, X,Y edo Z-rekin hasten bada gero 7 digitoak zenbakiak badira eta azken digito letra bat dela eta letra kontroladorea den
		NIE=Nan_testua.getText();
		int resto=0;
		char Letra = 0;
		int sum;
		char Letra_array;
		char[] letrak={'T' ,'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		x=true;
		if (NIE.length()==9) {
			c = NIE.charAt(0); 
			if ((c =='X' || c <= 'Y'|| c <= 'Z') && x==true) {
	           x=true;
	        }
	        else {
	        	x=false;
	        }
			for (int y = 1; y <=7 && x==true; y++) {
				c = NIE.charAt(y); 
	        	if(c>='0'&& c<='9') {
	        		x=true;
	        	}
	        	else {
	        		x=false;
	        	}
			}
			c = NIE.charAt(8); 
			if ((c >= 'A' && c <= 'Z') && x==true) {
				 Letra=NIE.charAt(8);
				x=true;
			}
			else {
				x=false;
			}
			sum=Integer.parseInt(bezero_aldatu.NIE.substring(1,8));
			resto=sum % 23;
			Letra_array=letrak[resto];
			if(Letra==Letra_array && x==true) {
				x=true;
			}
			else {
				x=false;
			}
		}
		else {
			x=false;
		}
		return x;
	}
}
