/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Estudiante
 */
public class Lab2 extends JFrame {

    JTextField nombre = new JTextField(15);
    JPasswordField contraseña = new JPasswordField(15); 
    String[] generos = { "Masculino", "Femenino" };
    JComboBox generosBox = new JComboBox(generos);
    JTextArea informacion = new JTextArea(4, 15); 
    JButton aceptar = new JButton("Aceptar");
    JButton limpiar = new JButton("Cancel");

    public Lab2() {
         super("Registro de Usuarios");
        setSize(225, 310);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        JLabel nombreUsuario = new JLabel("Nombre: ");
        JLabel contraseñaUsuario = new JLabel("Contraseña: ");
        JLabel telefono = new JLabel("Telefono: ");
        JLabel genero = new JLabel("Genero: ");
        JLabel infoLabel = new JLabel("Informacion: ");
        
        nombreUsuario.setName("lblName");
        contraseñaUsuario.setName("lblPassword");
        telefono.setName("lblPhone");
        genero.setName("lblGender");
        infoLabel.setName("lblResult");
        aceptar.setName("ok");
        limpiar.setName("clean");
        
        informacion.setLineWrap(true); 
        informacion.setWrapStyleWord(true); 
        
        panel.setName("REGISTRO_DE_USUARIOS");
        panel.add(nombreUsuario);
        panel.add(nombre);
        panel.add(contraseñaUsuario);
        panel.add(contraseña);
        panel.add(genero);
        panel.add(generosBox);
        panel.add(infoLabel);
        panel.add(informacion);
        panel.add(aceptar);
        panel.add(limpiar);
        
        add(panel);
        setVisible(true);
        
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + exc);
        }
    }
    public static void main(String[] arguments) {
      
        Lab2 l2 = new Lab2();
    }
}
