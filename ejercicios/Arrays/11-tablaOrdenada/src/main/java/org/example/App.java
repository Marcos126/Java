package org.example;

import java.util.Scanner;

/**
 * Leer 5 elementos numeros que se introducirán ordenados de forma creciente. Estos los guardaremos en una tabla de tamaño 10.
 * Leer un número N, e insertarlo en el lugar adecuado para que la tabla continue ordenada.
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nElementos = 10;
        int [] numeros = {1,3,5,6,8,0,0,0,0,0};
//        for (int i = 0; i < nElementos / 2 ; i++) {
//            System.out.print((i + 1) + ". Por favor ingrese un numero: ");
//            numeros[i] = input.nextInt();
//            if (i > 0) {
//                while (numeros[i] < numeros[i - 1]) {
//                    System.out.print((i + 1) + ". El numero que ingreso no es mayor al anterior: ");
//                    numeros[i] = input.nextInt();
//                }
//            }
//        }

//        System.out.print("Por favor ingrese un numero: ");
//        int auxiliar = input.nextInt();
        int auxiliar = 4;
        int cursor = 0;

        for(int i = 5; i >= 0; i--) {
            if(i > 0){
                if (auxiliar > numeros[i - 1]) {
                    cursor = i;
                    break;
                }
            }
        }
        for(int i = nElementos - 2; i > cursor-1; i--){
            numeros[i+1] = numeros[i];
        }

       numeros[cursor] = auxiliar;


        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
