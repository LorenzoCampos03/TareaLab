/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario11
 */
public class Ejercicio6 {
    public static void main(String[] args) {
    
            double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));

        JOptionPane.showMessageDialog(null, "La suma es" + (a + b) + "\n" + "La resta es" + (a - b) + "\n" + "La multiplicación es" + (a * b) + "\n" + "La division es" + (a / b));
   
    
    }
}
