package com.marquitos;

import java.util.Scanner;

/**
 *pedir un numero N y calcular su factorial
 *
 */
public class App 
{
    public static void main( String[] args )
{
        Scanner input = new Scanner(System.in);
        Integer factorial = input.nextInt();
        Integer calculadora = 1 ;


        while(factorial != 0){
            calculadora *= factorial;
            factorial--;
        }
        input.close();
        System.out.println(calculadora);
    }
}
