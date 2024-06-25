package com.marquitos;

import javax.swing.JOptionPane;

/**
 *  Hacer un programa que introducido un numero te diga si es 
 *  par o impar, cerrar cuando se introduzca 0
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));
        while (input != 0){
            if(input % 2 == 0){
                JOptionPane.showMessageDialog(null,"Su numero ingresado es par: " + input);

            }
            else{
                JOptionPane.showMessageDialog(null,"Su numero ingresado es impar: " + input);
            }
        input = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));
        }
        JOptionPane.showMessageDialog(null,"Saliendo...");
         
    }
}
