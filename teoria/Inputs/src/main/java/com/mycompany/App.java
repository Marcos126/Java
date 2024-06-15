package com.mycompany;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
        String cadena;
        int entero;
        char letra;
        float decimal;

        cadena = JOptionPane.showInputDialog(" Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog(" Digite una entero: "));
        letra = JOptionPane.showInputDialog(" Digite una letra: ").charAt(0);
        decimal = Float.parseFloat(JOptionPane.showInputDialog(" Digite una decimal: "));

        JOptionPane.showMessageDialog(null,"Su cadena introducida fue: " + cadena);
        JOptionPane.showMessageDialog(null,"Su entero introducido fue: " + entero);
        JOptionPane.showMessageDialog(null,"Su letra introducida fue: " + letra);
        JOptionPane.showMessageDialog(null,"Su decimal introducido fue: " + decimal);
    }
}
