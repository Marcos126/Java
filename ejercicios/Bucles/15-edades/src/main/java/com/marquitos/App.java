package com.marquitos;

import java.util.Scanner;

/**
Dadas las edades y alturas de 5 alumnos, mostrar la edad
la estatura media, la cantidad de alumnos mayores a 18 anios
y la cantidad de alumnos que miden mas de 1.75

**/
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        Integer edad = 0;
        float edad_Media;
        Integer edad_Total = 0;

        float altura = 0 ;
        float altura_Media;
        float altura_Total = 0;

        Integer alumnos = 5;
        Integer alumnos_Altos = 0;
        Integer alumnos_Mayores = 0;

        for(int i = 1;i<=5;i++){

            System.out.print("Ingrese la edad del alumno nro: " + i + ": ");
            edad = input.nextInt();
            edad_Total += edad;

            System.out.print("Ingrese la altura del alumno nro: " + i + ": ");
            altura = input.nextFloat();
            altura_Total += altura;

            if(edad > 18){
                alumnos_Mayores++;
            }
            if(altura > 1.75){
                alumnos_Altos++;
            }
        }

        input.close();

        edad_Media = edad_Total / alumnos;
        altura_Media = altura_Total / alumnos;

        System.out.println("Edad media de los alumnos: " + edad_Media);
        System.out.println("Altura media de los alumnos: " + altura_Media);
        System.out.println("Cantidad de alumnos mayores: " + alumnos_Mayores);
        System.out.println("Cantida de alumnos altos: " + alumnos_Altos);

    }
}
