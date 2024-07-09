package org.example;

import java.util.Scanner;

/**
 * Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de columnas: ");
        int nColumnas = input.nextInt();
        System.out.print("Ingrese el numero de filas: ");
        int nFilas = input.nextInt();

        int [][] matriz =  new int[nFilas][nColumnas];

        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.println("Ingrese valor para ["+i+"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        int suma_filas = 0;
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        int suma_columnas = 0;

        for (int j = 0; j < nFilas; j++) {
            suma_columnas = 0;
            for (int i = 0; i < nColumnas; i++) {
                    suma_columnas += matriz[i][j];
            }
            System.out.println("La suma de la columna: " + j + " es: " + suma_columnas);
        }
        for (int i = 0; i < nColumnas; i++) {
            suma_filas = 0;
            for (int j = 0; j < nFilas ; j++) {
                suma_filas += matriz[i][j];
            }
            System.out.println("La suma de la filas: " + i + " es: " + suma_filas);
        }
    }
}
