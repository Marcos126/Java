package org.example;

/**
 * Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla.
 */
public class App
{
    public static void main( String[] args )
    {
        int[][] matriz = {{4,8,12},{3,7,11},{5,9,13}};
        int[][] matriz_transpuesta = new int[3][3];



        for(int i = 0; i < matriz.length; i++){
            for( int j = 0; j < matriz[i].length; j++){
                matriz_transpuesta[i][j] = matriz[j][i];
            }

        }
        for(int i = 0; i < matriz.length; i++){
            for( int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz_transpuesta[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
