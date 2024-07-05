package org.example;

import java.util.Scanner;

/**
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados,
 * condicionados (=4) y suspensos.
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int notas;
        int alumnos_aprobados = 0;
        int alumnos_condicionados = 0;
        int alumnos_suspendidos = 0;
        int notas_validas = 0;


       while(true){
            System.out.print("Por favor introduzca una nota: ");
            notas = input.nextInt();
            switch(notas) {
                case 0:
                case 1:
                case 2:
                case 3:
                    alumnos_suspendidos++;
                    notas_validas++;
                    break;
                case 4:
                    alumnos_condicionados++;
                    notas_validas++;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    alumnos_aprobados++;
                    notas_validas++;
                    break;
                default:
                    System.out.println("El numero ingresado debe ser del 1 al 10");
                    continue;
            }
            if(notas_validas == 6){
                break;

            }
        }

        System.out.println("Cantidad de alumnos aprobados: " + alumnos_aprobados);
        System.out.println("Cantidad de alumnos condicionados: " + alumnos_condicionados);
        System.out.println("Cantidad de alumnos desaprobados: " + alumnos_suspendidos );

    }
}