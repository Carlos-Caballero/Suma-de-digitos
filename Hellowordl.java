import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 
import javax.swing.JOptionPane;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

public class Hellowordl extends JFrame implements ActionListener {
	
	private JLabel mensaje;
	private JButton boton;
	private JTextField caja;
	private JTextField caja2;
	public Hellowordl() {
		super();
		configurarVentana();
		crearComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("Suma de digitos");
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        }
		
	
	private void crearComponentes(){
		mensaje= new JLabel();
		mensaje.setText("Hola Mundo");
		mensaje.setBounds(175,70, 100, 30);
		mensaje.setForeground(Color.black);
		this.add(mensaje);
		
		boton= new JButton();
		boton.setText("Clickeame");
		boton.setBounds(100, 140, 250, 30);
                boton.setForeground(Color.BLUE);
		boton.addActionListener(this);
		this.add(boton);
		
		caja= new JTextField();
		caja.setBounds(120,100,100,30);
		this.add(caja);
		
		caja2= new JTextField();
		caja2.setBounds(230,100,100,30);
		this.add(caja2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado= caja.getText();
		String resultado2= caja2.getText();
		int num1= Integer.parseInt(resultado);
		int num2= Integer.parseInt(resultado2);
		int total= num1+num2;
		
		JOptionPane.showMessageDialog(this, "el valor es: "+total);
	}
	
	public static void main(String[] args) {
		Hellowordl ventana= new Hellowordl();
		ventana.setVisible(true);
	}
	
	
	
}
