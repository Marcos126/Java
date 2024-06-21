package com.marquitos;

import java.util.Scanner;

/*
 * Pedir el dia, mes y anio de una fecha e indicar
 * si la fecha es correcta. Suponiendo que todos los 
 * meses son de 30 dias.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int mes,dia,anio,anioLength;
        
        System.out.print( "Ingrese el dia: " );
        dia = input.nextInt();
        System.out.print( "Ingrese el mes: " );
        mes = input.nextInt();
        System.out.print( "Ingrese el anio: "  );

        anio = input.nextInt();
        anioLength = String.valueOf(anio).length();


        if((dia > 0 && dia <= 30) && (mes > 0 && mes <= 12 ) && (anioLength == 4 && anio > 0 )){
            System.out.println( "IF statement funcionando correctamente\nLa fecha ingresada es valida\nFechaIngresada: " + dia +"/"+ mes +"/"+ anio  );

        }
        else { 
            System.out.println( "If statement funcionando correctamente, fecha ingresada no valida" );

        }



        input.close();
    }
}
