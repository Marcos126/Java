package com.marquitos;

import java.util.Scanner;

/**
 * Este ejercicio consiste en dividir las horas dadas en semanas, dias, y horas
 */
public class App 
{
    public static void main( String[] args )
    {
        //Abrimos el scanner
        Scanner input = new Scanner(System.in);
        //Declaramos los tipos de las variables 
        int horasIngresadas,semanasCalculadas,diasCalculadas,horasCalculadas,horasSemanales,restoSemanal;
        //Imprimimos el mensaje en pantalla de pedir la hora
        System.out.print("Ingrese las horas a calcular: ");

        //hacemos la cuenta 
        horasIngresadas = input.nextInt();
        input.close();

        horasSemanales = 7 * 24;

        semanasCalculadas = horasIngresadas / horasSemanales;
        restoSemanal = horasIngresadas % horasSemanales;

        diasCalculadas = restoSemanal / 24;
        horasCalculadas = restoSemanal % 24;

        String semanas = Integer.toString(semanasCalculadas);
        String dias = Integer.toString(diasCalculadas);
        String horas = Integer.toString(horasCalculadas);

        System.out.println("Las semanas calculadas fueron: " + semanas + " semanas, " + dias + " dias, " + horas + " horas.");


    }
}
