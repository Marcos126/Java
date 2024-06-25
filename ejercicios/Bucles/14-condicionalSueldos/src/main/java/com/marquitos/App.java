package com.marquitos;

import java.util.Scanner;

/**
 * pedir 10 sueldos, Mostrar su suma y cuantos hay mayores de $1000
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Integer sueldo;
        Integer suma_sueldos = 0;
        Integer sueldos_Mayores_a_1000  = 0 ;
        
        for(int i = 0; i <= 9 ; i++){
            System.out.print("Por favor ingrese el siguiente sueldo: ");
            sueldo = input.nextInt();
            suma_sueldos += sueldo;

            if(sueldo > 1000){
            sueldos_Mayores_a_1000++;
            }

        }
        input.close();
        System.out.println("La suma de todos los sueldos es: " + suma_sueldos);
        System.out.println("La cantidad de sueldos mayores a $1000 es: " + sueldos_Mayores_a_1000);



    }
}
