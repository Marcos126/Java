package com.marquitos;

import java.util.Scanner;

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

        //Cambiamos las variables de int a string
        String semanas = Integer.toString(semanasCalculadas);
        String dias = Integer.toString(diasCalculadas);
        String horas = Integer.toString(horasCalculadas);

        //lo imprimimos en pantalla
        System.out.println("Las semanas calculadas fueron: " + semanas + " semanas, " + dias + " dias, " + horas + " horas.");


    }
}
