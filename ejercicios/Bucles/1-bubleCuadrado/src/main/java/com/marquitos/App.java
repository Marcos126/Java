package com.marquitos;

import java.util.Scanner;

/**
 * Leer un numero y mostrar su cuadrado, repeti el
 * proceso hasta que se introduzca un numero negativo.
 */
public class App 
{
    public static void main( String[] args )
{

        Scanner input = new Scanner(System.in);
        double numero,resultado;

        System.out.print("Por favor ingrese un numero para calcular su cuadrado: ");
        numero = input.nextDouble();

        while(numero>0){
            if(numero>0){
                resultado = Math.pow(numero,2);
                System.out.println("El resultado es " + resultado);
                System.out.print("Por favor ingrese un numero para calcular su cuadrado: ");
                numero = input.nextDouble();
                continue;
            }
            else{
                input.close();
            }

        }
            System.out.println("Ingreso un numero prohibido\n\n\n[!]Saliendo...");
    }

}
