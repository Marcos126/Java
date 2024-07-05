package org.example;

import java.util.Scanner;

/**
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlo en el orden inverso al introducido
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int [] numeros = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print((i+1) + ": Ingrese un numero: ");
            numeros[i] = input.nextInt();
        }

        for(int i = 4; i > -1 ;i--){
            System.out.println(numeros[i]);
        }
        input.close();
    }
}
