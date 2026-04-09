package practica23;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import inmobiliaria.*;

public class Vista extends JPanel{
	
	/**
	 * Variables de instancia
	 */
	//-----DATOS GENERALES-----//
	
	JTextField tfCodigo, tfPrecio, tfSuperficie, tfDireccion;
	JTextArea taDescripcion;
	JComboBox<EnumPropiedad> cbPropiedad;
	
	//--/////////////////////--//
	
	//-----DATOS VIVIENDA-----//

	JComboBox<EnumViviendas> cbVivienda;
	JComboBox<Integer> cbDormitorios, cbBaños;
	
	//--/////////////////////--//
	
	//-----DATOS FINCA-----//

	JLabel lterreno, lElectrico, lAgua, lViviendaSN;
	
	//--/////////////////////--//
	
	
	public Vista() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		
		panelPrincipal.add(datosGenerales());
		panelPrincipal.add(viviendas());
		panelPrincipal.add(fincas());
		
		panelPrincipal.setPreferredSize(new Dimension(640,620));
		this.setLayout(new FlowLayout());
		this.add(panelPrincipal);
	}
	

	public JPanel datosGenerales() {
		JPanel datosG = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		datosG.setBorder(new TitledBorder("Datos generales"));
		
		JLabel lCodigo = new JLabel("Codigo:");
		JLabel lTPropiedad = new JLabel("Tipo propiedad:");
		JLabel lPrecio = new JLabel("Precio:");
		JLabel lSuperficie = new JLabel("Superficie:");
		JLabel lDireccion  = new JLabel("Direccion:");
		JLabel lDescripcion = new JLabel("Descripcion:");
		
		tfCodigo = new JTextField(3);
		tfPrecio = new JTextField("0",8);
		tfPrecio.setHorizontalAlignment(JTextField.RIGHT);
		tfSuperficie = new JTextField("0",3);
		tfSuperficie.setHorizontalAlignment(JTextField.RIGHT);
		tfDireccion = new JTextField(38);
		
		JPanel panelillo = new JPanel();
		taDescripcion = new JTextArea(4,40);
		JScrollPane descripcion = new JScrollPane(taDescripcion);
		panelillo.add(lDescripcion);
		panelillo.add(descripcion);
		
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
		datosG.add(panelillo);
		
		return datosG;
	}
	
	private Component viviendas() {
		JPanel datosV = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		datosV.setBorder(new TitledBorder("Datos especificos para vivienda"));

		JLabel lNumVivienda = new JLabel("Tipo de vivienda: ");
		JLabel lDormitorios = new JLabel("Numero de dormitorios: ");
		JLabel lBaños = new JLabel("Numero de baños: ");
		
		cbVivienda = new JComboBox<EnumViviendas>(EnumViviendas.values());
		cbVivienda.setEnabled(false);
		
		Integer[] arrayNumeros = {1,2,3,4,5,6,7,8,9};
		cbDormitorios = new JComboBox<Integer>(arrayNumeros);
		cbDormitorios.setEnabled(false);
		cbBaños = new JComboBox<Integer>(arrayNumeros);
		cbBaños.setEnabled(false);
		
		datosV.add(lNumVivienda);
		datosV.add(cbVivienda);
		datosV.add(lDormitorios);
		datosV.add(cbDormitorios);
		datosV.add(lBaños);
		datosV.add(cbBaños);
			
		
		return datosV;
	}

	private Component fincas() {
		JPanel datosF = new JPanel(new GridLayout(4,1));

		return datosF;
	}
	
	
	

	public void control(Controlador ctr) {
		
	}

}
