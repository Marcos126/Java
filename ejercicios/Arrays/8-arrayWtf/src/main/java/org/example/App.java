package org.example;

import java.util.Scanner;

/**
 * Diseñar una aplicación que declare una tabla de 10 elementos enteros.
 * Leer mediante el teclado 8 numeros. Después se debe pedir un número y una posición, insertarlo
 * en la posición indicada, desplazando los que estén detrás
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        int nElementos = 10;
        int[] numeros = new int[nElementos];

        for(int i = 0; i < nElementos-2; i++){
            System.out.print((i+1) + ". Por favor ingrese un numero: ");
            numeros[i] = input.nextInt();
        }

        int cursor;
        int input_cursor;

        System.out.print("\nPor favor ingrese un numero: ");
        input_cursor = input.nextInt();

        System.out.print("Por favor ingrese el orden en el que quiere su numero (1-10): ");
        cursor = input.nextInt() - 1;

        int counter = nElementos - 1;
        while(counter > (cursor)){
            numeros[counter] = numeros[(counter-1)];
            counter--;
        }

        numeros[cursor] = input_cursor;

        for(int i:numeros){
            System.out.print(i + " ");
        }

    }
}