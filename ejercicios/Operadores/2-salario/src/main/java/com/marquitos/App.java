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
        // 8 horas por dia 
        // 8 * 5 = 40 
        // 4000 pesos la hora 
         
        try (Scanner input = new Scanner(System.in)){

        System.out.println(" Por favor ingrese su salario y horas trabajadas");
        float salario,horas,salarioSemanal;
        salario = input.nextFloat();
        horas = input.nextFloat();
        salarioSemanal = salario * horas;
        System.out.println( "El salario semanal es de " + salarioSemanal );

        }

    }
}
