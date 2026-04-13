package practica23;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import inmobiliaria.EnumPropiedad;

public class Controlador implements ItemListener, ActionListener{
	
	/**
	 * Variables de instancia
	 */
	private Vista miVista;
	
	/**
	 * Constructor
	 * @param v
	 */
	public Controlador(Vista v) {
		miVista = v;
	}
	
	/**
	 * Método que habilita/deshabilita todos los componentes de un determinado panel
	 * Si el Panel, tiene subpaneles (tendremos que volver a llamar al método), por
	 * lo que estaremos hablando de recursividad
	 * @param p
	 * @param estado
	 */
	private void estadoPanel(JPanel p, boolean estado) {
		// Obtenemos un array con todos los componentes del Panel
		// Ese array nos lo devuelve el método getComponents
		for (Component c: p.getComponents()) {
			if (c instanceof JPanel) // Si el componente es otro panel, volvemos
				// a llamar a este método (recursividad)
				estadoPanel((JPanel)c, estado);
			else
				c.setEnabled(estado);
		}
		p.setEnabled(estado); // Por último deshabilitamos también el panel
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem() == EnumPropiedad.LOCAL ||
				e.getItem() == EnumPropiedad.SOLAR || e.getItem() == EnumPropiedad.APARCAMIENTO) {
			estadoPanel(miVista.getDatosF(), false);
			estadoPanel(miVista.getDatosV(), false);
		}
		if (e.getItem() == EnumPropiedad.FINCA) {
			estadoPanel(miVista.getDatosF(), true);
			estadoPanel(miVista.getDatosV(), false);
		}
		if (e.getItem() == EnumPropiedad.VIVIENDA) {
			estadoPanel(miVista.getDatosF(), false);
			estadoPanel(miVista.getDatosV(), true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
