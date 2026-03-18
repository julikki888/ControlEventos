package practica16;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Ej2 extends JFrame{

	
	public Ej2() {
		
		super("Ej2");
		
		JMenuBar mb = new JMenuBar();
		
		JMenu mEntrada1 = new JMenu("Entrada 1");
		JMenu mEntrada2 = new JMenu("Entrada 2");
		JMenu mAyuda = new JMenu("Ayuda");
		
		JMenuItem mItem11= new JMenuItem("SubEntrada 1.1.");
		JMenuItem mItem12 = new JMenuItem("SubEntrada 1.2.");
		JMenu m13 = new JMenu("SubEntrada 1.3.");
		
		JMenuItem mItem131 = new JMenuItem("SubEntrada 1.3.1.");
		JCheckBoxMenuItem cbmItem132 = new JCheckBoxMenuItem("SubEntrada 1.3.2.");
		
		m13.add(mItem131);
		m13.add(cbmItem132);
		
		mEntrada1.add(mItem11);
		mEntrada1.addSeparator();
		mEntrada1.add(mItem12);
		mEntrada1.add(m13);
		
		mb.add(mEntrada1);
		mb.add(mEntrada2);
		mb.add(mAyuda);
		
		this.setJMenuBar(mb);
		
		
		mItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
	}
	
	
	
	public static void main(String[] args) {

		Ej2 gui = new Ej2();
		
		gui.pack();
		
		gui.setVisible(true);
		
		gui.setResizable(false);
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
