package org.example;

/**
 * Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [][] matriz = {{1,2,3,4,5,6,7,8,9},{2,3,4,5,6,7,8,9,10},{3,4,5,6,7,8,9,10,11},{4,5,6,7,8,9,10,11,12,},{5,6,7,8,9,10,11,12,13}};
        int [][] matriz_transpuesta = new int[9][5];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz_transpuesta[j][i] = matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i < matriz_transpuesta.length; i++) {
            for(int j = 0; j < matriz_transpuesta[i].length; j++) {
                System.out.print(matriz_transpuesta[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
