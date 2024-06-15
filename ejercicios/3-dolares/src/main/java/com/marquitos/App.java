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
        Scanner input =  new Scanner(System.in);
        float guillermo,luis,juan,resultado;
        System.out.print( "Ingrese la cantidad de dinero que tiene Guillermo: " );
        guillermo = input.nextFloat();
        luis = guillermo / 2 ;
        juan = (guillermo + luis) / 2;
        resultado =  guillermo + luis + juan;

        System.out.println("En total los 3 tienen " + resultado);
        input.close();

    }

}
