package org.example;

import java.util.Scanner;

/**
 * Leer por teclado una serie de 10 numeros enteros.
 * La aplicacion debe indicarnos si los numeros estan ordenados de forma
 * creciente o decreciente o si estan desordenados
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int nElementos = 10;
        int [] numeros = new int[nElementos];
        boolean creciente = false;
        boolean decreciente = false;


        for(int i = 0 ; i< nElementos ; i++){
            System.out.print((i+1) + ". Por favor Ingrese un numero: ");
            numeros[i] = input.nextInt();
        }
        for(int i = 0 ; i < (nElementos-1);i++){
            if (numeros[i] > numeros[i+1]){
                decreciente = true;
            }
            if (numeros[i] < numeros[i+1]){
                creciente = true;
            }
        }
        if(creciente && decreciente){
            System.out.println("Los numeros estan desordenados");
        }
        if(!creciente && decreciente){
            System.out.println("Los numeros estan ordenados de manera decreciente");
        }
        if(creciente && !decreciente){
            System.out.println("Los numeros estan ordenados de manera creciente");
        }
        if(!creciente && !decreciente){
            System.out.println("Los numeros son iguales");
        }
    }

}
