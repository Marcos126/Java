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
        int a,b;

        System.out.println( "Por favor ingrese numero A" );
        a = input.nextInt();
        System.out.println( "Por favor ingrese numero B" );
        b = input.nextInt();
        input.close();

        if(a==b){

        System.out.println( "A es igual a B" );
        }
        else if(a>b){
        System.out.println( "A es mayor que b" );
        }
        else 

        System.out.println( "b es mayor que a" );
    }
}
