package org.example;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de tamaño n x m y decir si es simetrica o no.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int nColumnas;
        int nFilas;
        System.out.print("Ingrese el numero de columnas: ");
        nColumnas = input.nextInt();
        System.out.print("Ingrese el numero de filas: ");
        nFilas = input.nextInt();

        int [][] matriz = new int [nColumnas][nFilas];

        for(int i = 0; i < nColumnas; i++){
            for(int j = 0 ; j < nFilas; j++){
                System.out.print("Ingrese el valor para la matriz: ["+i+","+j+"]: ");
                matriz[i][j] = input.nextInt();
            }

        }

        for(int i = 0; i < nColumnas; i++){
            for(int j = 0 ; j < nFilas; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");

        }

        if(nColumnas == nFilas){
            System.out.println("La matriz es simétrica");
        }else{
            System.out.println("La matriz es asimetrica");

        }

    }
}
