package com.marquitos;

import javax.swing.JOptionPane;

/**
 * escribir todos los numeros del 100 al 0 de 7 en 7
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer numeroInicial = 100;

        Integer numeroFinal = 0;

        Integer descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros a descontar:"));

        while(numeroInicial > numeroFinal){
            System.out.println(numeroInicial);
            numeroInicial -= descuento;

        }


    }

}
