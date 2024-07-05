package org.example;

import java.util.Scanner;

/**
 * Leer 5 numeros por teclado, almacernarlos en un arreglo y a continuacion
 * realizar la media de los numeros positivos, la media de los negativos,
 * y contar el numero de ceros.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int nCantidad = 5;
        int [] numeros = new int[nCantidad];
        int conteo_negativos = 0;
        int suma_negativos = 0;
        int conteo_positivos = 0;
        int suma_positivos = 0;
        int suma_ceros = 0;
        int media_positivos;
        int media_negativos;

        for(int i = 0; i < 5 ;i++){
            System.out.print((i+1) + "- Por favor ingrese un numero: ");
            numeros[i] = input.nextInt();
        }
        for(int i: numeros){
            if(i > 0){
                suma_positivos += i;
                conteo_positivos++;
            }
            else if (i < 0) {
                suma_negativos += i;
                conteo_negativos++;
            }
            else{
                suma_ceros++;
            }

        }
        if(conteo_positivos != 0){
            media_positivos = suma_positivos / conteo_positivos;
        }else{
            media_positivos = 0;
        }
        if(conteo_negativos != 0){
            media_negativos = suma_negativos / conteo_negativos;
        }else{
            media_negativos = 0;
        }
        System.out.println("La media de negativos fue de: " + media_negativos);
        System.out.println("La media de positivos fue de: " + media_positivos);
        System.out.println("La cantidad de ceros es de: " + suma_ceros);

    }
}
