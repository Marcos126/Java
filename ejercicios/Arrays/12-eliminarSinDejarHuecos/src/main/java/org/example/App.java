package org.example;

import java.util.Scanner;

/**
 * Leer por teclado una tabla de 10 elementos numeros enteros y posición
 * (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int nElementos = 10;
        int [] numeros = new int[nElementos];
        for(int i  = 0; i < nElementos; i++){
            System.out.print((i+1) + ". Por favor ingrese un numero: ");
            numeros[i] = input.nextInt();
        }


        int cursor;
        do {
            System.out.print("Por favor ingrese un numero (0-9): ");
            cursor = input.nextInt();
        } while (cursor > 10 || cursor < 0);

        numeros[cursor] = 0;

        for (int i = cursor; i < nElementos - 1; i++){
            numeros[i] = numeros[i+1];
        }
        numeros[nElementos-1] = 0;
        for( int i:numeros){
            System.out.print(i + " ");
        }
    }
}