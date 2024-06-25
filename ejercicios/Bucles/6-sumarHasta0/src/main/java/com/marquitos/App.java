package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Pedir numeros hata que se teclee un 0, mostrar la suma
 * de todos los numero introducidos.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int sumatoria = 0;
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
        
        while(input !=0 ){ 
            sumatoria += input;
            input = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
        }

        System.out.println(sumatoria);
        JOptionPane.showMessageDialog(null,"La suma total es " + sumatoria);
    }
}
