package org.example;

import java.util.Scanner;

/**

 Pedir un numero N, introducir N sueldos y mostrar el sueldo máximo

 */
public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cantidad_sueldos;
        System.out.print("Por favor ingrese la cantidad de sueldos: ");
        cantidad_sueldos = input.nextInt();

        if(cantidad_sueldos <=0){
            System.out.println("La cantidad de sueldos no puede ser menor a 0");
            return;
        }

        int sueldo;
        int biggest_sueldo = 0;


        for(int i = 1; i <= cantidad_sueldos; i++) {
            System.out.printf("Por favor ingrese el sueldo nro %s: ",i);
            sueldo = input.nextInt();
            if (sueldo > biggest_sueldo) {
                biggest_sueldo = sueldo;
            }
        }
        System.out.println("El mayor sueldo fue: " + biggest_sueldo);

    }
}