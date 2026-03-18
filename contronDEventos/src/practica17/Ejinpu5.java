package practica17;

import javax.swing.JOptionPane;

public class Ejinpu5 {

	public static void main(String[] args) {

		try {
			String nombre = JOptionPane.showInputDialog("Escriba un numero");

			
			 if(Double.parseDouble(nombre)==100)
				 JOptionPane.showMessageDialog(null, "Premioo");
			 else
				 JOptionPane.showMessageDialog(null, "Su numero es "+nombre);

				
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"Error", JOptionPane.ERROR_MESSAGE);		
			}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "OOh no pongas strings",
					"Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
