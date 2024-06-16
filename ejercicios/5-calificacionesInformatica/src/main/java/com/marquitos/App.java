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
        // System.out.println( "Hello World!" );
        //Declarando tipos de variables
        Scanner input = new Scanner(System.in);
        String estudiante;
        float participacion, primerExamenParcial,segundoExamenParcial,examenFinal,calificacionFinal;

        //Pidiendo las variables al usuario
        System.out.print("Por favor indique el nombre del estudiante: ");
        estudiante = input.nextLine();

        System.out.print("Por favor indique la calificacion en 'Participacion': ");
        participacion = input.nextFloat() * 0.1f;

        System.out.print("Por favor indique la calificacion en 'Primer examen parcial': ");
        primerExamenParcial = input.nextFloat() * 0.25f;

        System.out.print("Por favor indique la calificacion en 'Segundo examen parcial': ");
        segundoExamenParcial = input.nextFloat() * 0.25f;
        
        System.out.print("Por favor indique la calificacion en 'Examen Final': ");
        examenFinal = input.nextFloat() * 0.4f;
        input.close();

        calificacionFinal = participacion + primerExamenParcial + segundoExamenParcial + examenFinal;

        //imprimiendo el resultado en pantalla 
        System.out.println( "La calificacion final para el estudiante: " + estudiante + "\n es: " + calificacionFinal);
        

    }
}
