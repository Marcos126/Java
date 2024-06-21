package com.marquitos;

import java.util.Scanner;

/**
 *un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 *Si trabaja 40 horas o menos se le paga $16 por hora
 *Si trabaja mas de 40 horas se le paga $16 por las hora por las primeras 40 horas y
 *$20 por cada hora extra
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int horasTrabajadas,pagaPorHora,pagaPorHoraExtra,horasExtra,sueldoFinal;

        System.out.print( "Por favor ingrese sus horas trabajadas: " );
        horasTrabajadas  = input.nextInt();
        input.close();

        pagaPorHora = 16;
        pagaPorHoraExtra = 20;

        if( horasTrabajadas > 40){

            horasExtra = horasTrabajadas - 40;
            sueldoFinal = (40 * pagaPorHora) +  (horasExtra * pagaPorHoraExtra);
            System.out.println( "Su salario a cobrar(con horas extra) es de: " + sueldoFinal);
        }

        else {
            sueldoFinal = horasTrabajadas * pagaPorHora;
            System.out.println( "Su salario a cobrar(sin horas extra) es de: " + sueldoFinal );

        }
    }
}
