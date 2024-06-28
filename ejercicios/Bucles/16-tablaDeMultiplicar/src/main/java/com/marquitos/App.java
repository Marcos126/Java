package com.marquitos;

import java.util.Scanner;

/**
 * pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        Integer numero;

        do{
        System.out.print("Por favor ingrese un numero del 0 al 10: ");
        numero = input.nextInt();
        } while(numero>=10 || numero <=0 );
        

        System.out.println("Tabla de: " + numero);
        
        for(int i = 0;i<=10;i++){
            System.out.println(numero + " * " + i + " = " + numero * i);

        }

        input.close();

    }
}
