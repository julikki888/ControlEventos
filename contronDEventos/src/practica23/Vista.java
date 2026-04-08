package practica23;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.Iterator;

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
		JPanel datosG = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		
		lCodigo = new JLabel("Codigo:");
		lTPropiedad = new JLabel("Tipo propiedad:");
		lPrecio = new JLabel("Precio:");
		lSuperficie = new JLabel("Superficie:");
		lDireccion  = new JLabel("Direccion:");
		lDescripcion = new JLabel("Descripcion:");
		
		tfCodigo = new JTextField(3);
		tfPrecio = new JTextField("0",8);
		tfPrecio.setHorizontalAlignment(JTextField.RIGHT);
		tfSuperficie = new JTextField("0",3);
		tfSuperficie.setHorizontalAlignment(JTextField.RIGHT);
		tfDireccion = new JTextField();
		
		taDescripcion = new JTextArea();
		
		cbPropiedad = new JComboBox<EnumPropiedad>(EnumPropiedad.values());
		
		
		datosG.add(lCodigo);
		datosG.add(tfCodigo);
		datosG.add(lTPropiedad);
		datosG.add(cbPropiedad);
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
