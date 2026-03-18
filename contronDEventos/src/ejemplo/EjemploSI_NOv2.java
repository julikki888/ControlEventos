package ejemplo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class EjemploSI_NOv2 extends JFrame {
	
	private static final long serialVersionUID = 474416017841584711L;
	
	// Variable de instancia
	private JLabel etiqueta;
	private JButton bSi, bNo;
	
	// Constructor
	public EjemploSI_NOv2()
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
		ControlBoton cb = new ControlBoton();
		bSi.addActionListener(cb);
		bNo.addActionListener(cb);
		
		etiqueta.setFocusable(true); //Esto es pa que no empiece el Si focuseado
		
		FocusBoton fb = new FocusBoton();
		bSi.addFocusListener(fb);
		bNo.addFocusListener(fb);
		
	}
	class FocusBoton implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			if(e.getSource()==bSi) {
				bSi.setBackground(Color.orange);
			}else {
				bNo.setBackground(Color.orange);
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			if(e.getSource()==bSi) {
				bSi.setBackground(null);
			}else {
				bNo.setBackground(null);
			}
		}
		
	}
	
	
	class ControlBoton implements ActionListener{
		
		// Método de la interfaz ActionListener
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==bSi)
				etiqueta.setText("Si pulsado");
			else
				etiqueta.setText("No pulsado");
		}
	}
	
	
	// Programa principal
	public static void main(String[] args) {
		EjemploSI_NOv2 miVentana = new EjemploSI_NOv2();
		
		// Pack, setVisible, control de cierre, etc
		miVentana.pack();
		miVentana.setSize(400,100);
		miVentana.setLocationRelativeTo(null);
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
} 