package org.example;

import java.util.Scanner;

/**
 * pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int calificacion;
        boolean suspendidos = false;

        for(int i = 1; i <= 5;i++){
            System.out.printf("Introduzca la calificacion nro %s: ",i);
            calificacion = input.nextInt();
            if(calificacion <= 4){
                suspendidos = true;
            }
        }
        if(suspendidos){
            System.out.println("Hay alumnos que suspendieron");
        }
        else{
            System.out.println("Ningun alumno suspendio");
        }
    }
}
