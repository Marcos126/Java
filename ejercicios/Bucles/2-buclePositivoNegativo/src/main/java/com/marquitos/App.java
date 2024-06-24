package com.marquitos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *leer un numero e indicar si es positivo o negativo
 *el proceso se repetira hasta que se introduzca 0
 */
public class App 
{
    public static void main( String[] args )
{

        Scanner input = new Scanner(System.in);
        int numero;
        System.out.print("Por favor introduzca un numero: ");
        try{
            numero = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Por favor ingrese un numero");
            numero = input.nextInt();
        }
        while(numero !=0){
            if(numero > 0){

                System.out.println("El numero es positivo");
            }
            else{
                System.out.println("El numero es negativo");
            }

            System.out.print("Por favor introduzca un numero: ");
            try{
                numero = input.nextInt();
            }catch(InputMismatchException error){
                System.out.println("Por favor ingrese un numero");
                numero = input.nextInt();
            }


        }
            input.close();
    }
}
