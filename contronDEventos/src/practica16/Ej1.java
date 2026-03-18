package practica16;

import java.awt.*;

import javax.swing.*;

public class Ej1 extends JFrame{


	public Ej1() {

		
		super("EjemploGUI1");
		
		JButton bPrimero  = new JButton("Primero");
		JButton bSegundo  = new JButton("Segundo"); 
		JButton bTercero = new JButton("Tercero"); 
		JButton bCuarto = new JButton("Cuarto"); 
		JButton bQuinto = new JButton("Quinto"); 
		JButton bSexto = new JButton("Sexto"); 
		JButton bSeptimo = new JButton("Septimo"); 
		JButton bOctavo = new JButton("Octavo"); 

		
		// Utilizar algunos de los colores predefinidos en la clase Color
		bTercero.setBackground(Color.blue);
		bTercero.setForeground(Color.white);
		
		// Crear un color, especificando en rgb
		Color violeta = new Color(134,27,131);
		
		bPrimero.setBackground(violeta);
		bPrimero.setForeground(new Color(214,185,210));
		
		// Especificarle el color en Hexadecimal
		bSegundo.setBackground(Color.decode("#DBC380"));
		
		JPanel p = new JPanel(new GridLayout(4,2));
		p.add(bPrimero);
		p.add(bSegundo);
		p.add(bTercero);
		p.add(bCuarto);
		p.add(bQuinto);
		p.add(bSexto);
		p.add(bSeptimo);
		p.add(bOctavo);
		
		JScrollPane scBotonesColores = new JScrollPane(p);
		
		this.add(scBotonesColores);
		
	}
	
	public static void main(String[] args) {
		
		Ej1 f = new Ej1();
		
		
		f.pack();
		
		f.setVisible(true);
		
		f.setResizable(false);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
