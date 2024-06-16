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
        Scanner input = new Scanner(System.in);
        Double numero1,numero2,resultado;

        
        System.out.println("A continuacion se va a realizar la cuenta (a+b)^2");
        System.out.print("Por favor ingrese el primer numero: ");
        numero1 = input.nextDouble();
        System.out.print("Por favor ingrese el segundo numero: ");
        numero2 = input.nextDouble();
        input.close();
        resultado = Math.pow((numero1 + numero2),2);
        
        System.out.println("el resultado de ("+numero1+"+"+numero2+")^2 es: " + resultado);
    }
}
