package com.marquitos;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        // Salario del personal: 1000 mensuales
        // comision 150 + 5% del valor del auto

        //Abriendo consola para input del usuario
        Scanner input = new Scanner(System.in);
        
        //Declarando los tipos de las variables
        String empleado;
        float valorAuto, comision,salarioFinal;
        short salarioMensual;
        
        //Declarando valores de las variables
        System.out.println("Por favor ingrese el nombre del empleado");
        empleado = input.next();
        System.out.println("Por favor ingrese el valor de el auto vendido");
        valorAuto = input.nextInt();
        salarioMensual = 1000;
        comision = 150 + (valorAuto * 0.05f);
        salarioFinal = comision + salarioMensual;

        //Cerrando consola para input del usuario
        input.close();
        System.out.println("El total a pargar para el empleado " + empleado + " es de "+ salarioFinal );






    }
}
