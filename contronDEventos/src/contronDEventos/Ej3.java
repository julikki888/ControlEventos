package contronDEventos;

import java.awt.*;

import javax.swing.*;

public class Ej3 {

	public static void main(String[] args) throws InterruptedException {

			JFrame f = new JFrame("Gui nueva");
			
			Container contenPane = f.getContentPane();
			
			
			contenPane.setLayout(new BorderLayout(10,0));
			
			
			JButton bNorte = new JButton("Norte");
			JButton bSur = new JButton("Sur");
			JButton bEste = new JButton("Este");
			JButton bCentro = new JButton("Centro");
			
			bCentro.setPreferredSize(new Dimension(100,100));
			
			JPanel pCentro = new JPanel();
			JPanel pOeste = new JPanel(new GridLayout(2,1));
			
			JRadioButton hombre = new JRadioButton("Hombre",false);
			JRadioButton mujer = new JRadioButton("Mujer",false);
			
			ButtonGroup bGrupo = new ButtonGroup();
			
			bGrupo.add(hombre);
			bGrupo.add(mujer);
			
			bGrupo.setSelected(null, false);
			
			pOeste.add(hombre);
			pOeste.add(mujer);
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



	}

}
