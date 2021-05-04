package maquina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Font;

public class ventana {

	private JFrame frmTragamonedas;

	//TPO-Tragamonedas
	//Grupo 12
	//Alumnos: Santiago Salvioli y Dario Ferrari
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frmTragamonedas.setVisible(true);
				
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTragamonedas = new JFrame();
		frmTragamonedas.setTitle("Tragamonedas");
		frmTragamonedas.setBounds(100, 100, 450, 300);
		frmTragamonedas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTragamonedas.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frmTragamonedas.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		Sistema s=new Sistema();
		Maquina m=new Maquina();
		Premio p =new Premio();
		Jugador j=new Jugador();
		
		
		
		
		
		
		
	
		
		JLabel foto = new JLabel(new ImageIcon("maquinola.png"));
		foto.setBounds(117, 35, 183, 217);
		panel.add(foto);
		foto.setVisible(false);
		
		s.setDinero(j.getDinero()); //PASA
		JLabel lblNewLabel = new JLabel("Dinero actual: "+s.getDinero());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 24, 207, 23);
		panel.add(lblNewLabel);
		
		JLabel combo = new JLabel("");
		combo.setHorizontalAlignment(SwingConstants.CENTER);
		combo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		combo.setBounds(42, 52, 316, 75);
		panel.add(combo);
		
		/*
		JLabel combo1 = new JLabel("");
		combo.setHorizontalAlignment(SwingConstants.CENTER);
		combo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		combo.setBounds(42, 52, 316, 75);
		panel.add(combo1);
		
		
		JLabel combo2 = new JLabel("");
		combo.setHorizontalAlignment(SwingConstants.CENTER);
		combo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		combo.setBounds(42, 52, 316, 75);
		panel.add(combo2);
		
		*/
		
		JButton btnNewButton = new JButton("");
		 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.iniciarPartida();
				if(m.getHizotiro()==false){
				foto.setVisible(false);
				
				System.out.println("Partida Iniciada");
				//links de consulta:
				//https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
				//https://www.roseindia.net/java/example/java/swing/frame-close-on-button-click.shtml#:~:text=The%20GUI%20will%20contain%20a,the%20button%20will%20be%20clicked.
				
				JOptionPane.showMessageDialog(frmTragamonedas,
					    "ATENCION: Cada tirada vale 100p",
					    "nota",
					    JOptionPane.WARNING_MESSAGE);
				
				//frame.dispose();
				
				
				m.hizoPrimerTiro();
				}
				
				if(j.getDinero()<100) {
					JOptionPane.showMessageDialog(frmTragamonedas,
						    "Debe ingresar mas dinero o cobrar lo actual para Jugar",
						    "NO HAY SUFICIENTE DINERO",
						    JOptionPane.WARNING_MESSAGE);
					String dineroVentanaString = JOptionPane.showInputDialog(frmTragamonedas, "Ingrese el dinero");
					j.ingresarDinero(Integer.parseInt(dineroVentanaString));
					s.setDinero(j.getDinero());
					lblNewLabel.setText("Dinero actual: "+s.getDinero()); //actualiza el valor
				}else {
				
//crear if de cant casillas
					
					if(s.getCasillas()==3) {
					int a=p.generarCombiancion();
					int b=p.generarCombiancion(); 
					int c=p.generarCombiancion();
				
					combo.setText(+a +"  "+b+"  "+c);
					
					

					int atr =p.comprobarCombinacion3(a,b,c);
					if(atr!=0) {
						
						JOptionPane.showMessageDialog(frmTragamonedas,
							    "Felicidades Usted gano: " +atr,
							    "GANADOR!!!",
							    JOptionPane.WARNING_MESSAGE);
						j.incrementarCredito(atr);
						s.setDinero(j.getDinero());
						
					}
					j.restarTirada();
					
					s.setDinero(j.getDinero());
					lblNewLabel.setText("Dinero actual: "+s.getDinero()); //actualiza el valor
					}
					
					if(s.getCasillas()==4) {
					
					
					//crea random
					
					int a=p.generarCombiancion();
					int b=p.generarCombiancion(); 
					int c=p.generarCombiancion();
					int d=p.generarCombiancion()
;				
					combo.setText(+a +"  "+b+"  "+c+"  "+d);
					
					int atr =p.comprobarCombinacion4(a,b,c,d);
					if(atr!=0) {
						
						JOptionPane.showMessageDialog(frmTragamonedas,
							    "Felicidades Usted gano: " +atr,
							    "GANADOR!!!",
							    JOptionPane.WARNING_MESSAGE);
						j.incrementarCredito(atr);
						s.setDinero(j.getDinero());
						
					}
					j.restarTirada();
					
					s.setDinero(j.getDinero());
					lblNewLabel.setText("Dinero actual: "+s.getDinero());
					
					
					
					}
					
					if(s.getCasillas()==5) {

						
						
						//crea random
						
						int a=p.generarCombiancion();
						int b=p.generarCombiancion(); 
						int c=p.generarCombiancion();
						int d=p.generarCombiancion();
						int e=p.generarCombiancion();
				
						combo.setText(+a +"  "+b+"  "+c+"  "+d+"  "+e);
						
						int atr =p.comprobarCombinacion5(a,b,c,d,e);
						if(atr!=0) {
							
							JOptionPane.showMessageDialog(frmTragamonedas,
								    "Felicidades Usted gano: " +atr,
								    "GANADOR!!!",
								    JOptionPane.WARNING_MESSAGE);
							j.incrementarCredito(atr);
							s.setDinero(j.getDinero());
							
						}
						j.restarTirada();
						
						s.setDinero(j.getDinero());
						lblNewLabel.setText("Dinero actual: "+s.getDinero());
						
						
						
						
					
					}
					//terminar if de cant de casillas
				}
			}
			
		});
		
		btnNewButton.setBounds(316, 62, 53, 23);
		panel.add(btnNewButton);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		
		
		JButton btnNewButton_1 = new JButton("Configurar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(s.getStatus()==false) {
				
					String codigoSecretoVentanaString = JOptionPane.showInputDialog(frmTragamonedas, "Ingrese el codigo secreto (112233)");
					int codigoSecretoVentana=Integer.parseInt(codigoSecretoVentanaString);
					
					if(m.ingresarCodigoSecreto(codigoSecretoVentana)==true) {
					System.out.println("Piola");
					
					String maxVentanaString = JOptionPane.showInputDialog(frmTragamonedas, "CODIGO CORRECTO: Ingrese valor maximo por casillero");
					int maxVentana=Integer.parseInt(maxVentanaString);
					
					p.setCantidadDeFrutas(maxVentana);
					
					String casillerosString = JOptionPane.showInputDialog(frmTragamonedas, "CODIGO CORRECTO: Ingrese cantidad casillas (entre 3 y 5 inclusive)");
					int casilleros=Integer.parseInt(casillerosString);
					if(casilleros<=5&&casilleros>=3) {
					s.SetearCasiilas(casilleros);}else {
						JOptionPane.showMessageDialog(frmTragamonedas,
							    "Debe ingresar un numero entre 3 y 5",
							    "PELIGRO",
							    JOptionPane.WARNING_MESSAGE);
						
					}
					
					String multiString = JOptionPane.showInputDialog(frmTragamonedas, "CODIGO CORRECTO: Ingrese multiplicador (entre 1 y 5 inclusive)");
					int multi=Integer.parseInt(multiString);
					if(multi<=5&&multi>=1) {
						s.setMulti(multi);
						p.setMultiPremio(s.getMulti());
						
						}else {
							JOptionPane.showMessageDialog(frmTragamonedas,
								    "Debe ingresar un numero entre 1 y 5",
								    "PELIGRO",
								    JOptionPane.WARNING_MESSAGE);
							
						}
					
					
					}else {
					
						JOptionPane.showMessageDialog(frmTragamonedas,
							    "Codigo Incorrecto",
							    "Peligro",
							    JOptionPane.WARNING_MESSAGE);
						
						
					}
					
				}else {
					JOptionPane.showMessageDialog(frmTragamonedas,
						    "Para poder configurar la maquina no debe haber una partida en curso",
						    "atencion",
						    JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		btnNewButton_1.setBounds(12, 229, 107, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cobrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(j.getDinero()!=0) {
				JOptionPane.showMessageDialog(frmTragamonedas,
					    "Usted cobro "+j.getDinero(),
					    "atencion",
					    JOptionPane.WARNING_MESSAGE);
				}
				else { JOptionPane.showMessageDialog(frmTragamonedas,
					    "Usted no posee dinero a cobrar",
					    "atencion",
					    JOptionPane.WARNING_MESSAGE);
				}
				m.restarDelTotal(j.getDinero());
				s.setDinero(j.getDinero());
				j.resetDespuesDelCobro();
				s.setDinero(j.getDinero());
				lblNewLabel.setText("Dinero actual: "+j.getDinero());
				if(m.alcanzoRecaudacionMinima()==true) {
					JOptionPane.showMessageDialog(frmTragamonedas,
						    "LA MAQUINA SE ESTA POR QUEDAR SIN RECAUDACION",
						    "PELIGRO",
						    JOptionPane.WARNING_MESSAGE);
				}
				s.finalizarPartida();
			}
		});
		btnNewButton_2.setBounds(199, 229, 74, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(j.getDinero()!=0) {
					JOptionPane.showMessageDialog(frmTragamonedas,
						    "Usted cobro "+j.getDinero(),
						    "atencion",
						    JOptionPane.WARNING_MESSAGE);
					}
					
					m.restarDelTotal(j.getDinero());
					j.resetDespuesDelCobro();
					lblNewLabel.setText("Dinero actual: "+j.getDinero());
					if(m.alcanzoRecaudacionMinima()==true) {
						JOptionPane.showMessageDialog(frmTragamonedas,
							    "LA MAQUINA SE ESTA POR QUEDAR SIN RECAUDACION",
							    "PELIGRO",
							    JOptionPane.WARNING_MESSAGE);
					}
					JOptionPane.showMessageDialog(frmTragamonedas,
						    "Gracias por Jugar",
						    "Anuncio",
						    JOptionPane.WARNING_MESSAGE);
					frmTragamonedas.dispose();
					
			}
		});
		btnNewButton_3.setBounds(359, 229, 65, 23);
		panel.add(btnNewButton_3);
		
		JLabel foto2 = new JLabel(new ImageIcon("maquinola2.png"));
		foto2.setBounds(22, 11, 384, 241);
		panel.add(foto2);
		
		foto2.setVisible(true);
		
	
		
		
		
		
	
	
		
	}
}
