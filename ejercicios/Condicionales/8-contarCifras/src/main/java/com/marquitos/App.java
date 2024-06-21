package com.marquitos;

import java.util.Scanner;

/**
 * pedir un numero entre 0 y 99999 y decir cuantas cifras tiene 
 *
 */
public class App 
{
    public static void main( String[] args )
{

        Scanner input = new Scanner(System.in);
        int number,numbersLength;
        String transition;
        number = input.nextInt();
        transition = String.valueOf(number);
        numbersLength = transition.length();
        // count = 0;
        // if(true){
        //
        // }
        //

        while (number < 100000 || number > 0){
            System.out.println("Su numero tiene " + numbersLength + " cifras.");
            break;
        }
        input.close();
    }
}
