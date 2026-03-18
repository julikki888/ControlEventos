package practica15;

import java.awt.*;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ej1 extends JFrame{

	private static final long serialVersionUID = 3082027434377492181L;

	public Ej1() {
	
		//Pone el titulo a la ventana, llama al constructor de JFrame
		super("Componentes varios");
		
		//Obtener ek panel de JFrame
		Container cp = this.getContentPane();
	
		//--------------------------------------------------
		//---Prepara el panel de abajo---//
		//--------------------------------------------------
		JPanel pBajo = new JPanel();
		cp.add(pBajo,BorderLayout.SOUTH);
		
		JTextField tf = new JTextField();
		pBajo.add(tf);
		
		JCheckBox cb = new JCheckBox("CheckBox",false);
		pBajo.add(cb);
		
		JComboBox<String> comb = new JComboBox<>();
	
		
		//Panel del centro///////////////////////////
		
		
		JPanel panelCentro = new JPanel(new GridLayout(1,3));
		
		
		
		
	}
	

}
