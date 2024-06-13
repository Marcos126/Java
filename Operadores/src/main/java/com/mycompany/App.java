package com.mycompany;

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
        float numero1,numero2,suma,resta,div,mult,resto;

        System.out.println("Por favor ingrese 2 numeros.");
        numero1 = input.nextFloat();
        numero2 = input.nextFloat();

        suma = numero1+numero2;
        resta = numero1-numero2;
        div = numero1/numero2;
        mult = numero1 * numero2;
        resto = numero1%numero2;

        System.out.println(" Resultado de la suma: " + suma);
        System.out.println(" Resultado de la resta: " + resta);
        System.out.println(" Resultado de la division: " + div );
        System.out.println(" Resultado de la multiplicacion: " + mult);
        System.out.println(" Resultado del resto: " + resto);
    }


}
