package com.marquitos;

import javax.swing.JOptionPane;

/**
 *Este programa va a tomar 2 numeros y va a decir si ambos son pares o impares
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numeroA,numeroB;
        numeroA  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero A"));
        numeroB  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero B"));

        if(numeroA % 2 == 0){
        System.out.println( "el numero A es par" );
        }
        else{
        System.out.println( "el numero A es impar" );
        }
        if(numeroB % 2 == 0){
        System.out.println( "el numero B es par" );
        }
        else{
        System.out.println( "el numero B es impar" );
        }
    }
}
