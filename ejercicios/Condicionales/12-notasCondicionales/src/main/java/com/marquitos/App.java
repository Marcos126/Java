package com.marquitos;

import java.util.Scanner;

/**
 * pedir una nota del 0 al 10 y mostrarla de la forma:
 * insuficiente, suficiente, bien, notable, sobresaliente.
 * Insuficiente: 0-4
 * Suficiente: 5-6
 * Bien: 7-8
 * Notable: 9
 * Sobresaliente: 10
 */
public class App 
{
    public static void main( String[] args )
{
        Scanner input = new Scanner(System.in);
        int nota;
        System.out.print("Por favor ingrese una calificacion del 0 al 10: ");
        nota = input.nextInt();
        input.close();


        switch(nota){
            case 0:   
            System.out.println("kjjjjjjjjjjjjjjjjjjjjjjj");
            break;
            case 1:   
            case 2:
            case 3:
            case 4:
            System.out.println("La nota ingresada es \"Insuficiente\"\nnota: "+ nota);
            break;
            case 5:
            case 6:
            System.out.println("La nota ingresada es \"Suficiente\"\nnota: "+ nota);
            break;
            case 7:
            case 8:
            System.out.println("La nota ingresada es \"Bien\"\nnota: "+ nota);
            break;
            case 9:
            System.out.println("La nota ingresada es \"Notable\"\nnota: "+ nota);
            break;
            case 10:
            System.out.println("La nota ingresada es \"Sobresaliente\"\nnota: "+ nota);
            break;
            default:
            System.out.println("La nota ingresada no es correcta\nnota: "+ nota);
            break;
        }


    }
}
