package com.marquitos;

import javax.swing.JOptionPane;

/**
 * pedir un numero N, y mostrar todos los nmumeros desde 1 hasta N
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer input = Integer.parseInt(JOptionPane.showInputDialog("Por favor introduzca un numero"));
        Integer counter = 0;


        while(counter < input){
            counter++;
            System.out.println(counter);
            
        }

    }
}
