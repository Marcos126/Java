package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Pedir numero hasta que se introduzca uno negativo, y calcular la media 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer input;
        input = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        Integer counter = 0;

        Integer sumatoria = 0;

        while(input >= 0 ){

            sumatoria += input;
            counter++;
            input = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        }

        sumatoria = sumatoria/counter;
        JOptionPane.showMessageDialog(null,"La media de tu cuenta seria: " + sumatoria);
    }
}
