package practica23;

import java.awt.FlowLayout;

import javax.swing.*;

public class Vista extends JPanel{
	
	/**
	 * Variables de instancia
	 */
	//-----DATOS GENERALES-----//
	
	JLabel lCodigo, lTPropiedad, lPrecio, lSuperficie, lDireccion, lDescripcion;
	JTextField tfCodigo, tfPrecio, tfSuperficie, tfDireccion;
	JTextArea taDescripcion;
	JComboBox<EnumPropiedad> cbPropiedad;
	
	//--/////////////////////--//
	
	
	public Vista() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		
		panelPrincipal.add(datosGenerales());
		
		this.setLayout(new FlowLayout());
		this.add(panelPrincipal);
	}
	
	public JPanel datosGenerales() {
		JPanel datosG = new JPanel();
		
		lCodigo = new JLabel("Codigo:");
		lTPropiedad = new JLabel("Tipo propiedad:");
		lPrecio = new JLabel("Precio:");
		lSuperficie = new JLabel("Superficie:");
		lDireccion  = new JLabel("Direccion:");
		lDescripcion = new JLabel("Descripcion:");
		
		tfCodigo = new JTextField();
		tfPrecio = new JTextField("0");
		tfSuperficie = new JTextField("0");
		tfDireccion = new JTextField();
		
		taDescripcion = new JTextArea();
		
		datosG.add(lCodigo);
		datosG.add(tfCodigo);
		datosG.add(lTPropiedad);
		//datosG.add(cbPropiedad);
		datosG.add(lPrecio);
		datosG.add(tfPrecio);
		datosG.add(lSuperficie);
		datosG.add(tfSuperficie);
		datosG.add(lDireccion);
		datosG.add(tfDireccion);
		datosG.add(taDescripcion);
		
		return datosG;
	}
	

	public void control(Controlador ctr) {
		
	}

}
