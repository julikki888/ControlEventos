package contronDEventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;

public class Ejer01AWT {

	public static void main(String[] args) {

		JFrame f = new JFrame("Gui nueva");
		
		Container contenPane = f.getContentPane();
		
		
		contenPane.setLayout(new BorderLayout(10,0));
		
		
		JButton bNorte = new JButton("Norte");
		JButton bSur = new JButton("Sur");
		JButton bEste = new JButton("Este");
		JButton bOeste = new JButton("Oeste");
		JButton bCentro = new JButton("Centro");
		
		bCentro.setPreferredSize(new Dimension(100,100));
		
		JPanel pCentro = new JPanel();
		
		pCentro.add(bCentro);
		
		contenPane.add(bNorte, BorderLayout.NORTH );
		contenPane.add(bSur, BorderLayout.SOUTH );
		contenPane.add(bEste, BorderLayout.EAST );
		contenPane.add(bOeste, BorderLayout.WEST );
		contenPane.add(pCentro, BorderLayout.CENTER );
		
		bCentro.setForeground(Color.orange);
		bCentro.setBackground(Color.BLUE);
		
		f.pack();
		
		f.setVisible(true);
		
		f.setResizable(false);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
