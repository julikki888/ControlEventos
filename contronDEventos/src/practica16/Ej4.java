package practica16;

import java.awt.*;

import javax.swing.*;

public class Ej4 extends JFrame{



	private static final long serialVersionUID = 8693367664672175965L;



	public Ej4() {
		
		super("Mi menu");
		
		JMenuBar mb = new JMenuBar();
		
		JMenu mArchivo = new JMenu("Archivo");
		JMenu mEdicion = new JMenu("Edicion");
		JMenu mVer = new JMenu("Ver");
		JMenu mAyuda = new JMenu("Ayuda");
		
		JMenuItem mItemNormal = new JMenuItem("Normal");
		JMenuItem mItemDiseño = new JMenuItem("Diseño");
		JMenuItem mItemEsquema = new JMenuItem("Esquema");
		JMenu mHerramientas = new JMenu("Barra de Herramientas");
		JMenuItem mItemMapa = new JMenuItem("Mapa del documeto");
		JMenuItem mItemZoom = new JMenuItem("Zoom");
		
		JCheckBoxMenuItem cbItemFormato = new JCheckBoxMenuItem("Formato");
		JCheckBoxMenuItem cbItemEstandar = new JCheckBoxMenuItem("Estandar");
		JCheckBoxMenuItem cbItemDibujo = new JCheckBoxMenuItem("Dibujo");

		mb.add(mArchivo);
		mb.add(mEdicion);
		mb.add(mVer);
		mb.add(mAyuda);
		
		mVer.add(mItemNormal);
		mVer.add(mItemDiseño);
		mVer.add(mItemEsquema);
		mVer.addSeparator();
		mVer.add(mHerramientas);
		mVer.add(mItemMapa);
		mVer.addSeparator();
		mVer.add(mItemZoom);
		
		mHerramientas.add(cbItemFormato);
		mHerramientas.add(cbItemEstandar);
		mHerramientas.add(cbItemDibujo);
		
		//El medio/////////////////////////////
		
		JPanel pPrincipal = new JPanel();
		pPrincipal.setBackground(Color.ORANGE);
		
		JComboBox<String> cb = new JComboBox<>();
		cb.addItem("Courier New");
		cb.addItem("Times NewRoman");
		cb.addItem("Ariel");
		
		JCheckBox cbNegrita = new JCheckBox("Negrita");
		JCheckBox cbCursiva = new JCheckBox("Cursiva");
		JCheckBox cbSubrayado = new JCheckBox("Subrayado");
		
		pPrincipal.add(cb);
		pPrincipal.add(cbNegrita);
		pPrincipal.add(cbCursiva);
		pPrincipal.add(cbSubrayado);
		
		cbNegrita.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 25));
		cbNegrita.setBackground(Color.ORANGE);
		cbNegrita.setForeground(Color.gray);
		
		cbCursiva.setBackground(Color.ORANGE);
		cbSubrayado.setBackground(Color.ORANGE);
		
		this.setJMenuBar(mb);
		
		this.add(pPrincipal);
		
	}
	
	
	
	public static void main(String[] args) {
		Ej4 gui = new Ej4();
		
		gui.pack();
		
		gui.setVisible(true);
				
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
