package org.example;

import java.util.Scanner;

/**
 * Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace N posiciones
 * en el arreglo (N es digitado por el usuario)
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int nElementos = 10;
//        int [] numeros = new int[nElementos];
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int [] numeros_auxiliar = new int [nElementos];
        int desplazamiento;
        int counter_desplazamiento=0;
        int auxiliar = 0;

        System.out.print("Por favor ingrese la cantidad de lugares a desplazar: ");
        desplazamiento = input.nextInt();

        while(counter_desplazamiento < desplazamiento % nElementos) {
            for (int i = nElementos - 1; i > 0; i--) {
                if (i == nElementos - 1) {
                    auxiliar = numeros[i];
                }
                numeros[i] = numeros[i - 1];

            }

            counter_desplazamiento++;
            numeros[0] = auxiliar;
        }

        for(int i: numeros){
            System.out.print(i + " ");
        }
    }
}
