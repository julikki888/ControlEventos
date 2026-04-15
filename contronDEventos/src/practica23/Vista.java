package practica23;

import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.border.*;

import inmobiliaria.*;

public class Vista extends JPanel{
	
	/**
	 * Variables de instancia
	 */
	//-----DATOS GENERALES-----//
	
	private JPanel datosG;
	private JTextField tfCodigo, tfPrecio, tfSuperficie, tfDireccion;
	private JTextArea taDescripcion;
	private JComboBox<EnumPropiedad> cbPropiedad;
	
	//--/////////////////////--//
	
	//-----DATOS VIVIENDA-----//

	private JPanel datosV;
	private JComboBox<EnumViviendas> cbVivienda;
	private JComboBox<Integer> cbDormitorios, cbBaños;
	 
	//--/////////////////////--//
	
	//-----DATOS FINCA-----//

	private JPanel datosF;
	private JComboBox<EnumTerreno> cbTerreno;
	private JRadioButton rbSiElectrico, rbNoElectrico, rbSiAgua, rbNoAgua, rbSiVivienda, rbNoVivienda;
	
	//--/////////////////////--//
	
	//-----DATOS PROPIEDAD-----//
	
	private JPanel datosP;
	private JButton bGuardar, bConsultar, bBorrar, bLimpiar;
	
	//--/////////////////////--//
	
	
	public Vista() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		
		panelPrincipal.add(datosGenerales());
		panelPrincipal.add(viviendas());
		panelPrincipal.add(fincas());
		panelPrincipal.add(propiedad());
		
		panelPrincipal.setPreferredSize(new Dimension(640,520));
		this.setLayout(new FlowLayout());
		this.add(panelPrincipal);
	}

	public JPanel datosGenerales() {
		datosG = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
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
		datosV = new JPanel(new FlowLayout(FlowLayout.CENTER));
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
		datosF = new JPanel(new GridLayout(4,1));
		datosF.setBorder(new TitledBorder("Datos especificos para fincas rusticas"));
		
		JPanel finca1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel finca2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel finca3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel finca4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lterreno = new JLabel("Tipo terreno: ");
		cbTerreno = new JComboBox<EnumTerreno>(EnumTerreno.values());
		finca1.add(lterreno);
		finca1.add(cbTerreno);
		
		JLabel lElectrico = new JLabel("Suministro electrico: ");
		ButtonGroup bgElectrico = new ButtonGroup();
		rbSiElectrico = new JRadioButton("Si");
		rbNoElectrico = new JRadioButton("No");
		bgElectrico.add(rbSiElectrico);
		bgElectrico.add(rbNoElectrico);
		finca2.add(lElectrico);
		finca2.add(rbSiElectrico);
		finca2.add(rbNoElectrico);
		
		JLabel lAgua = new JLabel("Suministro de agua: ");
		ButtonGroup bgAgua = new ButtonGroup();
		rbSiAgua = new JRadioButton("Si");
		rbNoAgua = new JRadioButton("No");
		bgAgua.add(rbSiAgua);
		bgAgua.add(rbNoAgua);
		finca3.add(lAgua);
		finca3.add(rbSiAgua);
		finca3.add(rbNoAgua);
		
		JLabel lViviendaSN = new JLabel("Dispone de vivienda: ");
		ButtonGroup bgVivienda = new ButtonGroup();
		rbSiVivienda = new JRadioButton("Si");
		rbNoVivienda = new JRadioButton("No");
		bgVivienda.add(rbSiVivienda);
		bgVivienda.add(rbNoVivienda);
		finca4.add(lViviendaSN);
		finca4.add(rbSiVivienda);
		finca4.add(rbNoVivienda);
		
		datosF.add(finca1);
		datosF.add(finca2);
		datosF.add(finca3);
		datosF.add(finca4);
		
		return datosF;
	}
	

	private Component propiedad() {
		datosP = new JPanel(new GridLayout(1,4,3,0));
		datosP.setPreferredSize(new Dimension(640,12));
		datosP.setBorder(new TitledBorder("Operaciones disponibles sobre propiedades"));
		
		bGuardar = new JButton("Guardar");
		bConsultar = new JButton("Consultar");
		bBorrar = new JButton("Borrar");
		bLimpiar = new JButton("Limpiar");
				
		datosP.add(bGuardar);
		datosP.add(bConsultar);
		datosP.add(bBorrar);
		datosP.add(bLimpiar);
		
		return datosP;
	}

	

	public void control(Controlador ctr) {
		
		cbPropiedad.addItemListener(ctr);
		
		
	}

	public JPanel getDatosG() {return datosG;}
	public JTextField getTfCodigo() {return tfCodigo;}
	public JTextField getTfPrecio() {return tfPrecio;}
	public JTextField getTfSuperficie() {return tfSuperficie;}
	public JTextField getTfDireccion() {return tfDireccion;}
	public JTextArea getTaDescripcion() {return taDescripcion;}
	public JComboBox<EnumPropiedad> getCbPropiedad() {return cbPropiedad;}
	public JPanel getDatosV() {return datosV;}
	public JComboBox<EnumViviendas> getCbVivienda() {return cbVivienda;}
	public JComboBox<Integer> getCbDormitorios() {return cbDormitorios;}
	public JComboBox<Integer> getCbBaños() {return cbBaños;}
	public JPanel getDatosF() {return datosF;}
	public JComboBox<EnumTerreno> getCbTerreno() {return cbTerreno;}
	public JRadioButton getRbSiElectrico() {return rbSiElectrico;}
	public JRadioButton getRbNoElectrico() {return rbNoElectrico;}
	public JRadioButton getRbSiAgua() {return rbSiAgua;}
	public JRadioButton getRbNoAgua() {return rbNoAgua;}
	public JRadioButton getRbSiVivienda() {return rbSiVivienda;}
	public JRadioButton getRbNoVivienda() {return rbNoVivienda;}
	public JPanel getDatosP() {return datosP;}
	public JButton getbGuardar() {return bGuardar;}
	public JButton getbConsultar() {return bConsultar;}
	public JButton getbBorrar() {return bBorrar;}
	public JButton getbLimpiar() {return bLimpiar;}

	public void setDatosG(JPanel datosG) {this.datosG = datosG;}
	public void setTfCodigo(JTextField tfCodigo) {this.tfCodigo = tfCodigo;}
	public void setTfPrecio(JTextField tfPrecio) {this.tfPrecio = tfPrecio;}
	public void setTfSuperficie(JTextField tfSuperficie) {this.tfSuperficie = tfSuperficie;}
	public void setTfDireccion(JTextField tfDireccion) {this.tfDireccion = tfDireccion;}
	public void setTaDescripcion(JTextArea taDescripcion) {this.taDescripcion = taDescripcion;}
	public void setCbPropiedad(JComboBox<EnumPropiedad> cbPropiedad) {this.cbPropiedad = cbPropiedad;}
	public void setDatosV(JPanel datosV) {this.datosV = datosV;}
	public void setCbVivienda(JComboBox<EnumViviendas> cbVivienda) {this.cbVivienda = cbVivienda;}
	public void setCbDormitorios(JComboBox<Integer> cbDormitorios) {this.cbDormitorios = cbDormitorios;}
	public void setCbBaños(JComboBox<Integer> cbBaños) {this.cbBaños = cbBaños;}
	public void setDatosF(JPanel datosF) {this.datosF = datosF;}
	public void setCbTerreno(JComboBox<EnumTerreno> cbTerreno) {this.cbTerreno = cbTerreno;}
	public void setRbSiElectrico(JRadioButton rbSiElectrico) {this.rbSiElectrico = rbSiElectrico;}
	public void setRbNoElectrico(JRadioButton rbNoElectrico) {this.rbNoElectrico = rbNoElectrico;}
	public void setRbSiAgua(JRadioButton rbSiAgua) {this.rbSiAgua = rbSiAgua;}
	public void setRbNoAgua(JRadioButton rbNoAgua) {this.rbNoAgua = rbNoAgua;}
	public void setRbSiVivienda(JRadioButton rbSiVivienda) {this.rbSiVivienda = rbSiVivienda;}
	public void setRbNoVivienda(JRadioButton rbNoVivienda) {this.rbNoVivienda = rbNoVivienda;}
	public void setDatosP(JPanel datosP) {this.datosP = datosP;}
	public void setbGuardar(JButton bGuardar) {this.bGuardar = bGuardar;}
	public void setbConsultar(JButton bConsultar) {this.bConsultar = bConsultar;}
	public void setbBorrar(JButton bBorrar) {this.bBorrar = bBorrar;}
	public void setbLimpiar(JButton bLimpiar) {this.bLimpiar = bLimpiar;}
}
