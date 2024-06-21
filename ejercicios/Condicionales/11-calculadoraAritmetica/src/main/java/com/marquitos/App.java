package com.marquitos;

import java.util.Scanner;

/**
 * Construir un programa que simule el
 * funcionamiento de una calculadora que puede realizar las
 * cuatro ooperaciones aritmeticas basicas ( suma, resta, producto y division)
 * con dos valores numericos enteros. El usuario debe
 * especificar la operacion con el primer caracter del primer parametro
 * de la linea de comandos:
 *
 * S o s para la suma
 * R o r para la resta
 * P o p o M o m para la multiplicacion(producto)
 * D o d para la division
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner input = new Scanner(System.in);
        int numeroA,numeroB,resultado;
        String operacion;

        System.out.print("Por favor ingrese numero A: ");
        numeroA = input.nextInt();
        System.out.print("Por favor ingrese numero B: ");
        numeroB = input.nextInt();
        System.out.print("Ingrese la operacion a realizar\ns/S=Suma\nm/M/p/P=Multipicacion\nr/R=Resta\nd/D=division\noperacion: ");
        operacion = String.valueOf(input.next().charAt(0));

        switch(operacion){
            case "s","S": 
            resultado = numeroA + numeroB;
            System.out.println("El resultado de su suma fue: " + resultado);
            break;
            case "r","R":
            resultado = numeroA - numeroB;
            System.out.println("El resultado de su resta fue: " + resultado);
            break;
            case "m","M","p","P":
            resultado = numeroA * numeroB;
            System.out.println("El resultado de su multiplicacion fue: " + resultado);
            break;
            case "d","D":
            resultado = numeroA / numeroB;
            System.out.println("El resultado de su division fue: " + resultado);
            break;
        }
        input.close();

    }
}
