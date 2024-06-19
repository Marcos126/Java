package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        char letra;
        letra = JOptionPane.showInputDialog("Por favor ingrese una letra:").charAt(0);
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"La letra ingresada es mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"La letra ingresada es minuscula");
        }
    }
}
