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
public class Ejercicio5 {

    public static void main(String[] args) {

        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));

        JOptionPane.showMessageDialog(null, "La suma es" + (a + b));
        JOptionPane.showMessageDialog(null, "La resta es" + (a - b));
        JOptionPane.showMessageDialog(null, "La multiplicación es" + (a * b));
        JOptionPane.showMessageDialog(null, "La division es" + (a / b));
    
    }

}
