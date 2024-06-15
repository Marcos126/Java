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

        float calificacion1,calificacion2,calificacion3,resultado;
        calificacion1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese calificacion 1"));
        calificacion2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese calificacion 2"));
        calificacion3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese calificacion 3"));

        resultado = calificacion1 + calificacion2 + calificacion3;

        System.out.println("La calificacion final es: " + resultado);


    }
}
