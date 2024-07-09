package org.example;

import java.util.Scanner;


/**
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
 * Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer
 * trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media
 * del alumno que se encuentra en la posicion N (N se lee por teclado)
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        float [] alumno_1 = {7.5f,8.2f,8.8f};
        float [] alumno_2 = {6.0f,6.4f,7.1f};
        float [] alumno_3 = {9.0f,8.8f,9.2f};
        float [] alumno_4 = {7.0f,7.3f,7.5f};
        float [] alumno_5 = {8.5f,8.4f,8.0f};

        float total_alumnos = 0f;
        float promedio_alumnos;

        float total_alumno_1;
        float total_alumno_2;
        float total_alumno_3;
        float total_alumno_4;
        float total_alumno_5;

        System.out.println("Notas alumno 1: ");
        total_alumno_1 = total(alumno_1);
        total_alumnos += total_alumno_1;

        System.out.println("Notas alumno 2: ");
        total_alumno_2 = total(alumno_2);
        total_alumnos += total_alumno_2;

        System.out.println("Notas alumno 3: ");
        total_alumno_3 = total(alumno_3);
        total_alumnos += total_alumno_3;

        System.out.println("Notas alumno 4: ");
        total_alumno_4 = total(alumno_4);
        total_alumnos += total_alumno_4;

        System.out.println("Notas alumno 5: ");
        total_alumno_5 = total(alumno_5);
        total_alumnos += total_alumno_5;

        promedio_alumnos = (total_alumnos / 5) / 3 ;


    System.out.println("\nEl promedio por trimestre de los alumnos es de: " + promedio_alumnos);

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, ingrese el alumno que desea buscar:  ");
        int busqueda_alumno = input.nextInt();

        switch (busqueda_alumno){
            case 1:
                System.out.println("El promedio para el alumno 1 es: " + total_alumno_1 /  3 );
                break;
            case 2:
                System.out.println("El promedio para el alumno 1 es: " + total_alumno_2 /  3 );
                break;
            case 3:
                System.out.println("El promedio para el alumno 1 es: " + total_alumno_3 /  3 );
                break;
            case 4:
                System.out.println("El promedio para el alumno 1 es: " + total_alumno_4 /  3 );
                break;
            case 5:
                System.out.println("El promedio para el alumno 1 es: " + total_alumno_5 /  3 );
                break;
            default:
                System.out.println("No ha ingresado un numero valido");
        }

    }
    public static float total(float [] alumno){

        float total_alumno = 0;
        int counter_alumno = 1;
        for(float i: alumno){
            System.out.println("Trimestre nro " + counter_alumno++ + " : "+ i);
            total_alumno += i;
        }

        return total_alumno;
    }
}
