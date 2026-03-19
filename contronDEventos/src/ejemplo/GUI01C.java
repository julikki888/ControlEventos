package ejemplo;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI01C extends JFrame{
    /**
     * 
     */
    private static final long serialVersionUID = -1319340370301512276L;
    // Variable de instancia
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JTextField texto1, texto2;
    private JButton bSi, bNo;
    // Constructor
    public GUI01C()
    {
        // Poner título a la ventana
        super("Con actionListener");
        // Creo un objeto de tipo container con el método
        // getContentPane()
        Container contentPane = this.getContentPane();
        // Establecer el gestor de esquemas
        contentPane.setLayout(new FlowLayout());
        // Crear los componentes
        etiqueta1 = new JLabel("Usuario");
        etiqueta2 = new JLabel("Contraseña");
        etiqueta3 = new JLabel("Introduzca usuario y contraseña");
        
        texto1 = new JTextField(12);
        texto2 = new JPasswordField(12);
        
        bSi = new JButton("Aceptar");
        bNo = new JButton("Cancelar");
        
        // Añadir "alias" con el metodo setActionCommnad a los botones
        bSi.setActionCommand("botonSi");
        bNo.setActionCommand("botonNo");
        // Añadir los componentes al JFrame
        contentPane.add(etiqueta1);
        contentPane.add(texto1);
        contentPane.add(bSi);
        
        contentPane.add(etiqueta2);
        contentPane.add(texto2);
        contentPane.add(bNo);
        
        contentPane.add(etiqueta3);
        
        // Pack, setVisible, control de cierre, etc
        this.pack();
        this.setSize(350,150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Añadir control a los botones
        ControlBoton cb = new ControlBoton();
        
        bSi.addActionListener(cb);
        bNo.addActionListener(cb);
    }
    // Programa principal
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new GUI01C();
    }
    class ControlBoton implements ActionListener
    {
        // Método de la interfaz ActionListener
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == bSi) {
                
                if(texto1.getText().equalsIgnoreCase("anas")
                        && texto2.getText().equalsIgnoreCase("anas")) {
                    
                    etiqueta3.setText("Contraseña correcta");
                    etiqueta3.setForeground(Color.green);
                }
                
                else {
                    
                    etiqueta3.setText("Contraseña incorrecta");
                    etiqueta3.setForeground(Color.red);
                }
                
            } else {
                
                etiqueta3.setText("Introduzca usuario y contraseña");
                etiqueta3.setForeground(Color.black);
                //etiqueta3
            }
        }
    }
}