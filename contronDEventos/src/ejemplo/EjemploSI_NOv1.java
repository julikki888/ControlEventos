package ejemplo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploSI_NOv1 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 474416017841584711L;
	
	// Variable de instancia
	private JLabel etiqueta;
	private JButton bSi, bNo;
	
	// Constructor
	public EjemploSI_NOv1()
	{
		// Poner título a la ventana
		super("Con actionListener");
		
		// Creo un objeto de tipo container con el método getContentPane()
		Container contentPane = this.getContentPane();
		
		// Establecer el gestor de esquemas
		contentPane.setLayout(new FlowLayout());
		
		// Crear los componentes
		bSi = new JButton("Si");
		bNo = new JButton("No");
		etiqueta = new JLabel("Pulsaciones");
		
		// Añadir los componentes al JFrame
		contentPane.add(etiqueta);
		contentPane.add(bSi);
		contentPane.add(bNo);
		
		
		// Añadir control a los botones (enlazar el componente event con
		// la interfaz que lo que programa)
		bSi.addActionListener(this);
		bNo.addActionListener(this);
	}
	
	// Programa principal
	public static void main(String[] args) {
		EjemploSI_NOv1 miVentana = new EjemploSI_NOv1();
		
		// Pack, setVisible, control de cierre, etc
		miVentana.pack();
		miVentana.setSize(400,100);
		miVentana.setLocationRelativeTo(null);
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	// Método de la interfaz ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bSi)
			etiqueta.setText("Si pulsado");
		else
			etiqueta.setText("No pulsado");
	}
	
	
} 