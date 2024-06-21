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
        int numeroA,numeroB,numeroC;

        numeroA = input.nextInt();
        numeroB = input.nextInt();
        numeroC = input.nextInt();

        input.close();

        if(numeroA > numeroB & numeroB > numeroC){
            
        System.out.println( numeroA + " " + numeroB + " " +  numeroC );
            
        }

        else if( numeroA > numeroC & numeroC > numeroB) {
        System.out.println( numeroA + " " + numeroC + " " +  numeroB );
        }

        else if( numeroB > numeroA & numeroA > numeroC) {

        System.out.println( numeroB + " " + numeroA + " " +  numeroC );
        }

        else if( numeroB > numeroC & numeroC > numeroA) {
        System.out.println( numeroB + " " + numeroC + " " +  numeroA );
        }

        else if( numeroC > numeroA & numeroA > numeroB) {
        System.out.println( numeroC + " " + numeroA + " " +  numeroB );
        }

        else{
        System.out.println( numeroC + " " + numeroB + " " +  numeroA );
        }
        
        Integer.class
        
    }
}
