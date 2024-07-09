package org.example;

import java.util.Scanner;

/**
 *Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera
 * y a continuación los elementos impares.
 *
 */
public class App
{
    private int[] x;

    public static void main(String[] args )
    {
        int [] numeros_1 = {10, 21, 4, 35, 6, 55, 8, 78, 90, 33};
        int [] numeros_2 = {5, 3, 10, 20, 15, 7, 22, 44, 11, 13};
        int [] numeros_3 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};

        App pp = new App();

        pp.intentoClases(numeros_1);
        System.out.println(" ");
        pp.intentoClases(numeros_2);
        System.out.println(" ");
        pp.intentoClases(numeros_3);
    }

    public void intentoClases(int [] lista){

        int n_elementos_auxiliar = 10;
        int [] numeros_auxiliar = new int[n_elementos_auxiliar];

        int counter = 0;
        int counter_negativo = lista.length - 1;
        for(int i: lista){
            if(i % 2 == 0){
                numeros_auxiliar[counter++] = i;
            }else{
                numeros_auxiliar[counter_negativo--] = i;
            }
        }
        for(int i:numeros_auxiliar){
            System.out.print(i + " ");
        }

    }
}
