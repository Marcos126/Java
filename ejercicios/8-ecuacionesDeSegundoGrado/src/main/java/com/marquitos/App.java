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
        double a,b,c,x1,x2,discriminante;

        Scanner input = new Scanner(System.in);
        System.out.println( "Por favor ingrese valor de a" );
        a = input.nextDouble();
        System.out.println( "Por favor ingrese valor de b" );
        b = input.nextDouble();
        System.out.println( "Por favor ingrese valor de c" );
        c = input.nextDouble();

        discriminante = Math.pow(b,2)- 4*a*c;

        
        if (discriminante >= 0){

        x1 = (-b + Math.sqrt(discriminante)) / (2*a);
        x2 = (-b - Math.sqrt(discriminante)) / (2*a);

        System.out.println("\nX1 = "+ x2 + "\nX2 = " + x1 );

        }

        else {
        System.out.println("La cuenta no tiene solucion");

        }

        
        input.close();
        //ax^2 + bx + c = 0
        //x = (-b +/- sqrt(b^2 )-4ac)/2a
        // x = -b + Math.sqrt(Math.pow(b,2) - 4*a*c)/2*a
        // x = -b - Math.sqrt(Math.pow(b,2) - 4*a*c)/2*a

    }
}
