
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiririn
 */
public class EjemploPasswordField {
     public static void main(String[] args) {    
 JFrame frame = new JFrame("Ejemplo de JPasswordField");    
JPasswordField campoPassword = new JPasswordField();   
JLabel etiqueta = new JLabel("Contraseña:");    

etiqueta.setBounds(20, 100, 80, 30);    
campoPassword.setBounds(100, 100, 100, 30);    

frame.add(campoPassword);  
frame.add(etiqueta);  

frame.setSize(300, 300);    
frame.setLayout(null);    
frame.setVisible(true);
     }
}
