package org.example;

import java.util.Scanner;

/**
 * Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posición hacia abajo:
 * el primero al segundo, el segundo al tercero y asi sucesivamente. El último pasa a ver el primero.
 *
 */
public class App
{
    public static void main( String[] args ) {
        int nElementos = 10;
        int[] numeros = new int[nElementos];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < nElementos; i++){
            System.out.print((i+1) + ". Por favor ingrese un numero: ");
            numeros[i] = input.nextInt();
        }

        int help = 0;
        for(int i = nElementos - 1; i > 0; i--) {
            if (i == nElementos - 1) {
                help = numeros[i];
            }
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = help;
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}