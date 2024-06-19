package com.marquitos;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor ingrese un numero: ");
        numero = input.nextInt();
        input.close();

        if (numero % 10 == 0){
        System.out.println("El numero es multiplo de 10");


        }
        else{
        System.out.println("El numero no es multiplo de 10");
        }

    }
}
