package practica17;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class Ej5 extends JFrame{

    private static final long serialVersionUID = 5014779004727041667L;
    
    public Ej5() {
        
        super.setTitle("Componentes varios");
        
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        
        panelPrincipal.setBorder(new EmptyBorder(10,30,10,30));
        
        panelPrincipal.add(panelNorte(), BorderLayout.NORTH);
        panelPrincipal.add(panelSur(), BorderLayout.SOUTH);
        panelPrincipal.add(panelOeste(), BorderLayout.WEST);
        panelPrincipal.add(panelCentro(), BorderLayout.CENTER);
        panelPrincipal.add(panelEdad(), BorderLayout.EAST);
        
        this.add(panelPrincipal);
        
        
        

        
        
        
    }
    
    private JPanel panelNorte() {
        
        JPanel panel = new JPanel();
        
        panel.add(new JLabel("Esto es un ejercicio de JAVA"));
        
        return panel;
    }
    
    private JPanel panelOeste() {
        
        JPanel panel = new JPanel(new GridLayout(3,1));
        
        panel.setBorder(new EmptyBorder(0,0,0,12));
        
        panel.add(new JButton("Boton 1"));
        panel.add(new JButton("Boton 2"));
        panel.add(new JButton("Boton 3"));
        
        return panel;
    }
    
    private JPanel panelCentro() {
        
        JPanel panel = new JPanel();
        
        //panel.setBorder(new EmptyBorder(10,30,10,30));
        
        Vector<String> campoTexto = new Vector<>();
        
        
        for(int i = 1; i <= 10; i++) {
            
            campoTexto.add("Item numero " + i);
        }
        
        JList<String> lista = new JList<>(campoTexto);
        
        JScrollPane panelScroll = new JScrollPane(lista);
        
        panel.add(panelScroll);
        
        return panel;
    }
    
    private JPanel panelEdad() {
        
        JPanel panelEdad = new JPanel(new GridLayout(4,1));
        
        //panel.setBorder(new EmptyBorder(10,30,10,30));
        
        panelEdad.add(new JLabel("Marca tu edad: "));
        
        ButtonGroup grupoBotones = new ButtonGroup();
        
        JRadioButton boton1 = new JRadioButton("Menor de 20");
        JRadioButton boton2 = new JRadioButton("Mayor de 20 y menor de 35");
        JRadioButton boton3 = new JRadioButton("Mayor de 35");
        
        grupoBotones.add(boton1);
        grupoBotones.add(boton2);
        grupoBotones.add(boton3);
        
        panelEdad.add(boton1);
        panelEdad.add(boton2);
        panelEdad.add(boton3);
        
        panelEdad.setBorder(
                new CompoundBorder(
                new TitledBorder("Borde compuesto"),
                new BevelBorder(BevelBorder.RAISED)));
        
        
        // PRUEBA DE BORDES SOBRE EL panelEdad
        
        // EtcherBorder --> Crea una linea resaltada o hundida.
        // panelEdad.setBorder(new EtchedBorder(EtchedBorder.RAISED));
                      
        // TitledBorder --> Crea un borde añadiendo un tilulo a otro borde.
        // panelEdad.setBorder(new TitledBorder("Marca tu edad"));
        // panelEdad.setBorder(new TitledBorder(new LineBorder(Color.blue,3,true),"Titulo"));
                
        // LineBorder --> Dibuja una linea de diferentes grosores..
        // panelEdad.setBorder(new LineBorder(Color.red,5));
                
        // MatteBorder --> Crea un borde usando un color o una imagen.
        // panelEdad.setBorder(new MatteBorder(5,15,30,30,Color.LIGHT_GRAY));
             
        // BevelBorder --> Presenta al componente alzado o hundido.
        // panelEdad.setBorder(new BevelBorder(BevelBorder.LOWERED));
        
        // SoftBevelBorder --> Mas suave que BevelBorder.
        // panelEdad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
                
        // EmptyBorder --> Borde para añadir espacio vacio.
        // panelEdad.setBorder(new EmptyBorder(5,15,30,30));
        
        // CompoundBorder --> Compone dos bordes en uno solo
        // panelEdad.setBorder(
        // new CompoundBorder(new EtchedBorder(),
        // new LineBorder(Color.red,3)));
        
        return panelEdad;
    }
    
    private JPanel panelSur() {
        
        JPanel panel = new JPanel();
        
        JComboBox<String> cbElecciones = new JComboBox<>();
        
        for(int i = 1; i <= 5; i++) {
            
            cbElecciones.addItem("Eleccion " + i);
        }
        
        panel.add(cbElecciones);
        panel.add(new JLabel(" Observacion: "));
        panel.add(new JTextField(12));
        
        return panel;
    }

    public static void main(String[] args) {

        Ej5 ej = new Ej5();
        
        //ej.setPreferredSize(new Dimension(500, 300));
        ej.pack();
        ej.setLocationRelativeTo(null);
        ej.setVisible(true);
        ej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}