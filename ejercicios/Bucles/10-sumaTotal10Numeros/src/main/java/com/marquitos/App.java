package com.marquitos;

import java.util.Scanner;

/**
 *
 * pedir 10 numero y escribir la suma total.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Integer inputNumber;
        Integer sumatoria = 0;
        Integer counter = 0;

        while(counter != 10){
            inputNumber = input.nextInt();
            sumatoria += inputNumber;
            
            counter++;
        }
        System.out.println("La suma de los 10 numeros es: " + sumatoria);
        input.close();
    }
}
