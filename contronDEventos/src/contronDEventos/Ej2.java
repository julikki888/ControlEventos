package contronDEventos;

import java.awt.*;

import javax.swing.*;

public class Ej2 {

	public static void main(String[] args) throws InterruptedException {

			JFrame f = new JFrame("Gui nueva");
			
			Container contenPane = f.getContentPane();
			
			
			contenPane.setLayout(new BorderLayout(10,0));
			
			
			JButton bNorte = new JButton("Norte");
			JButton bSur = new JButton("Sur");
			JButton bEste = new JButton("Este");
			JButton bOeste1 = new JButton("Oeste1");
			JButton bOeste2 = new JButton("Oeste2");
			JButton bCentro = new JButton("Centro");
			
			bCentro.setPreferredSize(new Dimension(100,100));
			
			JPanel pCentro = new JPanel();
			JPanel pOeste = new JPanel(new GridLayout(2,1));
			
			pOeste.add(bOeste1);
			pOeste.add(bOeste2);
			pCentro.add(bCentro);
			
			contenPane.add(bNorte, BorderLayout.NORTH );
			contenPane.add(bSur, BorderLayout.SOUTH );
			contenPane.add(bEste, BorderLayout.EAST );
			contenPane.add(pOeste, BorderLayout.WEST );
			contenPane.add(pCentro, BorderLayout.CENTER );
			
			
			f.pack();
			
			f.setVisible(true);
			
			
			f.setResizable(false);
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Thread.sleep(1000);
			
			bSur.setVisible(false);
			
			f.pack();


	}

}
