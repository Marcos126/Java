package org.example;

import java.util.Scanner;

/**
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int [] numeros = new int [5];
        for(int i = 0; i < 5; i++){
            System.out.print((i+1) + ": Por favor ingrese un numero: " );
            numeros[i] = input.nextInt();
        }

        System.out.println("Numeros ingresados en orden: ");
        for(int i:numeros){
            System.out.println(i);
        }
    }
}
