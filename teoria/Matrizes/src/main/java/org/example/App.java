package org.example;

import java.util.Scanner;

/**
 *Matrices
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        int[] [] matriz = {{1,2,3},{4,5,6},{7,8,9}}; Declarada manualmente
        Scanner input = new Scanner(System.in);
        int nColumnas;
        int nFilas;

        System.out.print("Ingrese numero de columnas: ");
        nColumnas = input.nextInt();
        System.out.print("Ingrese numero de filas: ");
        nFilas = input.nextInt();
        int[][] matriz = new int [nColumnas][nFilas];

        System.out.println("Complete la matriz: ");
        for(int i = 0; i < nColumnas; i++){
            for (int j = 0; j < nFilas; j++){
                System.out.println("Ingrese el valor ["+i+"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < nColumnas; i++){
            for(int j = 0; j < nFilas; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
    }

    }
}
