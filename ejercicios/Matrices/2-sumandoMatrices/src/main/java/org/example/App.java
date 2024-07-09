package org.example;

/**
 * Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [][] matriz_1 = { {5,2,3},{1,4,6},{7,8,9}};
        int [][] matriz_2 = { {1,0,4},{2,3,5},{3,1,2}};
        int [][] matriz_3 = new int [3][3];

        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1.length; j++){
                matriz_3[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
        for(int i = 0; i < matriz_3.length; i++){
            for (int j = 0; j < matriz_3.length; j++){
                System.out.print(matriz_3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
