package practica17;

import java.awt.*;

import javax.swing.*;

public class Ej1 extends JFrame{

	public Ej1() {
		
		
		super("Titulo de Jframe");
		
		
		Container gcp = this.getContentPane();
		
		gcp.setLayout(new FlowLayout());
		
		gcp.add(new JButton("Boton 1"));
		gcp.add(new JButton("Boton 2"));
		
		// ------------------------------------------------
		// Crear un diálogo asociado a esta ventana (Frame)
		// ------------------------------------------------
		JDialog d = new JDialog(this,"Título de diálogo",false);
		// this es el JFrame, he heredado de JFrame
		d.setLayout(new FlowLayout());
		
		d.add(new JLabel("Esto es una ventana de diálogo"));
		d.add(new JButton("OK"));
		d.pack();
		d.setSize(200, 90);
		d.setResizable(false);
		d.setVisible(true);
		d.setLocationRelativeTo(this);
		//d.setLocation(200,200);
		// Controlar el cierre del diálogo, OJO, se oculta, no se sale de la aplicación
		d.setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		Ej1 gui1 = new Ej1();
		
		gui1.setPreferredSize(new Dimension(400,200));
		gui1.pack();
		gui1.setLocationRelativeTo(null);
		gui1.setVisible(true);
		gui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
