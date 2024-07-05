package org.example;

import java.util.Scanner;

/**
 *Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera
 * de la forma: el 1.º de a y el 1.º de b, el 2.º de a y el 2.º de b, etc.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int nElementos = 10;
        int nSuma_elementos = 20;
        int [] numeros_lista_1 = new int[nElementos];
        int [] numeros_lista_2 = new int[nElementos];
        int [] numeros_lista_3 = new int[nSuma_elementos];
        Scanner input = new Scanner(System.in);

        for( int i = 0; i < nElementos ; i++ ){
            System.out.print((i + 1) + "- Por favor ingrese un numero para la primera lista: ");
            numeros_lista_1[i] = input.nextInt();
        }
        for( int i = 0; i < nElementos; i++ ){
            System.out.print((i + 1) + "- Por favor ingrese un numero para la segunda lista: ");
            numeros_lista_2[i] = input.nextInt();
        }

        int iterador_lista_3 = 0;


        for (int i = 0; i < nElementos; i++){

            numeros_lista_3[iterador_lista_3] = numeros_lista_1[i];
            iterador_lista_3++;
            numeros_lista_3[iterador_lista_3] = numeros_lista_2[i];
            iterador_lista_3++;

        }

        for(int i: numeros_lista_3){
            System.out.println(i);

        }

    }
}