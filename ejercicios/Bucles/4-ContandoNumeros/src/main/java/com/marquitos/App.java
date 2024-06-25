package com.marquitos;

import javax.swing.JOptionPane;

/**
 * pedir numero hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int counter,input = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));
        counter = 0;
        while (input >= 0){ 
            counter++;
            input = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));
        }
        JOptionPane.showMessageDialog(null,"Usted a introducido "+ counter + " Numeros");

    }
}
