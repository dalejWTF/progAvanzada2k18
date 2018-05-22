/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7frame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.CheckBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author dalejwtf
 */
public class Ventana extends JFrame {
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;
    private JTextField txtDescripcion;
    private JButton boton1;
    private JCheckBox chbDescribir;
    private JComboBox cmbCiudades;
    private static final String ciudad[]={"Loja","Cuenca","Ambato"};
    
    public Ventana(){
        setLayout(new FlowLayout());
        etiqueta1=new JLabel("Datos Generales");
        etiqueta1.setToolTipText("Titulo");
        ImageIcon ii1= new ImageIcon("/home/dalejwtf/Documents/GitBash/progAvanzada2k18/Clase7Frame/src/Imagenes/maleta.png");
        ImageIcon ii2= new ImageIcon("/home/dalejwtf/Documents/GitBash/progAvanzada2k18/Clase7Frame/src/Imagenes/3doritos.png");
        ImageIcon ii3= new ImageIcon("/home/dalejwtf/Documents/GitBash/progAvanzada2k18/Clase7Frame/src/Imagenes/vistoverde.png");
        
        Icon icono= new ImageIcon(ii1.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        Icon icono2= new ImageIcon(ii2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        Icon icono3= new ImageIcon(ii3.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        
        etiqueta2= new JLabel("Etiqueta con icon", icono,SwingConstants.LEFT);
        etiqueta3= new JLabel();
        etiqueta3.setText("Etiqueta de Titulo");
        
        etiqueta3.setIcon(icono2);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setVerticalAlignment(SwingConstants.BOTTOM);
        texto1= new JTextField("Ingrese Cedula",10);
        
        Font tletra= new Font("Serif",Font.BOLD,18);
        texto2= new JTextField("Nombre....");
        texto2.setFont(tletra);
        texto3= new JPasswordField("Password",10);
        
        boton1= new JButton("Guardar",icono3);
        
        chbDescribir= new JCheckBox("Describir");
        
        txtDescripcion= new JTextField("Ingrese descripcion...");
        txtDescripcion.setEnabled(false);
        
        cmbCiudades= new JComboBox(ciudad);
        
        add(etiqueta1);
        add(etiqueta2);
        add(etiqueta3);
        add(texto1);
        add(texto2);
        add(texto3);
        add(boton1);
        add(chbDescribir);
        add(txtDescripcion);
        add(cmbCiudades);
        //Instanciar manejador de eventos
        ManejadorEventos manejador= new ManejadorEventos();
        texto1.addActionListener(manejador);
        texto2.addActionListener(manejador);
        texto3.addActionListener(manejador);
        boton1.addActionListener(manejador);
        chbDescribir.addActionListener(manejador);
        txtDescripcion.addActionListener(manejador);
        cmbCiudades.addActionListener(manejador);
        
        
    }
    
    
    
    private class ManejadorEventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evento){
            String cadena="";
            
            if (evento.getSource()== texto1){ 
                cadena= String.format("Texto 1: %s", evento.getActionCommand());
            JOptionPane.showMessageDialog(null, cadena);
            }
            if (evento.getSource()== texto2){
                cadena= String.format("Texto 2: %s", evento.getActionCommand());
            JOptionPane.showMessageDialog(null, cadena);
            }
            if (evento.getSource()== texto3){
                cadena= String.format("Texto 3: %s", evento.getActionCommand());
            JOptionPane.showMessageDialog(null, cadena);
            }
            if (evento.getSource()== boton1){
                cadena= String.format("Texto 4: %s", evento.getActionCommand());
            JOptionPane.showMessageDialog(null, cadena);
            }
            if (evento.getSource()== chbDescribir) {
                if (chbDescribir.isSelected()) {
                    txtDescripcion.setEnabled(true);
                }else
                    txtDescripcion.setEnabled(false);
            }
            if (evento.getSource()==txtDescripcion) {
                JOptionPane.showMessageDialog(null, "Data ingresada!");
            }
            if (evento.getSource()== cmbCiudades) {
                JOptionPane.showMessageDialog(null, "Ciudad Elegida!");
            }
        }
    }
}
