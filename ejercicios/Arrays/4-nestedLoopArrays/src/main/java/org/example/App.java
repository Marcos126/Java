package org.example;

import java.util.Scanner;

/**
 * Leer 10 numeros enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden,
 * primero
 * último
 * segundo
 * ante último
 * tercero
 */
public class App {
    public static void main(String[] args) {
        int nElementos = 10;
        int[] numeros = new int[nElementos];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + " - Por favor ingrese un numero: ");
            numeros[i] = input.nextInt();
        }
        input.close();
        int iterador_inferior = 0;
        int iterador_superior = nElementos - 1;
        while(iterador_inferior < iterador_superior) {
            System.out.println(numeros[iterador_inferior]);
            System.out.println(numeros[iterador_superior]);
            iterador_superior--;
            iterador_inferior++;
        }
    }
}