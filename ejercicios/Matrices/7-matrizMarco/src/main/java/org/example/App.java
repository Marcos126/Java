package org.example;

/**
 * Crear una matriz "Marco" de tamaño 5x5: todos sus elementos deben ser 0, salvo los bordes
 * que deben ser 1. Mostrarla
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [][] marco = new int [10][10];
        for(int i = 0; i< marco.length; i++){
            for(int j = 0; j<marco[i].length;j++){
               if(i == 0 || j == 0 || i == marco.length-1 || j == marco[i].length-1){
                   marco[i][j] = 1;
               }else{
                   marco[i][j] = 0;
               }
            }
        }

        for(int i = 0; i< marco.length; i++){
            for(int j = 0; j<marco[i].length;j++){
                System.out.print(marco[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
