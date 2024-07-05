package org.example;

import java.util.Scanner;

/**
 * Leer los datos correspondientes a dos tablas de 12 elementos numericos, y mezclarlos en
 * una tercera de forma: 3 de los elementos de la tabla A, 3 elementos de la B, etc.
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int nElementos = 12;
        int nSuma_elementos = 24;
//        int [] numeros_lista_1 = new int[nElementos];
//        int [] numeros_lista_2 = new int[nElementos];
        int [] numeros_lista_3 = new int[nSuma_elementos];
        int [] numeros_lista_1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int [] numeros_lista_2 = {13,14,15,16,17,18,19,20,21,22,23,24};
        Scanner input = new Scanner(System.in);

//        for( int i = 0; i < nElementos ; i++ ){
//            System.out.print((i + 1) + "- Por favor ingrese un numero para la primera lista: ");
//            numeros_lista_1[i] = input.nextInt();
//        }
//
//        for( int i = 0; i < nElementos; i++ ){
//            System.out.print((i + 1) + "- Por favor ingrese un numero para la segunda lista: ");
//            numeros_lista_2[i] = input.nextInt();
//        }

        int iterador_lista_3 = 0;
        int iterador_lista_1 = 0;
        int iterador_lista_2 = 0;




        for (int i = 0; i < 4; i++){

            numeros_lista_3[iterador_lista_3] = numeros_lista_1[iterador_lista_1];
            iterador_lista_3++;
            iterador_lista_1++;
            numeros_lista_3[iterador_lista_3] = numeros_lista_1[iterador_lista_1];
            iterador_lista_3++;
            iterador_lista_1++;
            numeros_lista_3[iterador_lista_3] = numeros_lista_1[iterador_lista_1];
            iterador_lista_3++;
            iterador_lista_1++;

            numeros_lista_3[iterador_lista_3] = numeros_lista_2[iterador_lista_2];
            iterador_lista_3++;
            iterador_lista_2++;
            numeros_lista_3[iterador_lista_3] = numeros_lista_2[iterador_lista_2];
            iterador_lista_3++;
            iterador_lista_2++;
            numeros_lista_3[iterador_lista_3] = numeros_lista_2[iterador_lista_2];
            iterador_lista_3++;
            iterador_lista_2++;

        }

        for(int i: numeros_lista_3){
            System.out.println(i);

        }

    }
}
