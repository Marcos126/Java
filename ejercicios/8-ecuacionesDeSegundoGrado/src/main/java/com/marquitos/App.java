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
        double a,b,c,x1,x2;
        Scanner input = new Scanner(System.in);
        System.out.println( "Por favor ingrese valor de a" );
        a = input.nextFloat();
        System.out.println( "Por favor ingrese valor de b" );
        b = input.nextFloat();
        System.out.println( "Por favor ingrese valor de c" );
        c = input.nextFloat();

        x1 = (-b + Math.sqrt(Math.pow(b,2)- 4*a*c)) /2*a;
        x2 = (-b - Math.sqrt(Math.pow(b,2)- 4*a*c)) /2*a;
        
        System.out.println(x1 + "\n" + x2 );
        input.close();
        //ax^2 + bx + c = 0
        //x = (-b +/- sqrt(b^2 )-4ac)/2a
        // x = -b + Math.sqrt(Math.pow(b,2) - 4*a*c)/2*a
        // x = -b - Math.sqrt(Math.pow(b,2) - 4*a*c)/2*a

    }
}
