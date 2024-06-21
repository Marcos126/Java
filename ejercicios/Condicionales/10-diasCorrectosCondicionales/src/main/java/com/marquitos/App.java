package com.marquitos;

import java.util.Scanner;

/**
 * Pedir el dia, mes y anio de una fecha e indicar si la fecha es correcta.
 * Con mes de 28, 30 y 31 dias. Sin anios bisiestos
 *
 * 1 Enero          31  
 * 3 Marzo          31
 * 5 Mayo           31
 * 7 Julio          31
 * 8 Agosto         31
 * 10 Octubre       31
 * 12 Diciembre     31
 * 4 Abril          30
 * 6 Junio          30
 * 9 Septiembre     30
 * 11 Noviembre     30
 * 2 Febrero        28
 *
 */
public class App 
{
    public static void main( String[] args )
{
        int dia,mes,anio,anioLength;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el dia: ");
        dia = input.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = input.nextInt();
        System.out.print("Ingrese el anio: ");
        anio = input.nextInt();
        anioLength = String.valueOf(anio).length();
        input.close();


        if (anioLength == 4 &&  anio != 0 ){
            System.out.println("El anio fue ingresado correctamente: " + anio);
            switch(mes){
                case 1,3,5,7,8,10,12:
                if(dia <=31 && dia > 0){
                    System.out.println("El mes ingresado fue correcto: " + mes );
                    System.out.println("El dia ingresado fue correcto: " + dia);
                    System.out.println("Fecha ingresada correctamente!\nFecha: " + dia + "/" + mes + "/" + anio );
                    break;
                }
                else{
                    System.out.println("El mes ingresado fue correcto: " + mes );
                    System.out.println("El dia ingresado es incorrecto.: " + dia);
                    System.out.println("Fecha ingresada incorrectamente");
                    break;
                }
                case 4,6,9,11:
                if(dia <=30 && dia > 0){
                    System.out.println("El mes ingresado fue correcto: " + mes );
                    System.out.println("El dia ingresado fue correcto: " + dia);
                    System.out.println("Fecha ingresada correctamente!\nFecha: " + dia + "/" + mes + "/" + anio );
                    break;
                }
                else{
                    System.out.println("El mes ingresado fue correcto: " + mes );
                    System.out.println("El dia ingresado es incorrecto.: " + dia);
                    System.out.println("Fecha ingresada incorrectamente");
                    break;
                }
                case 2:
                if(dia <=28 && dia > 0){
                    System.out.println("El mes ingresado fue correcto: " + mes );
                    System.out.println("El dia ingresado fue correcto: " + dia);
                    System.out.println("Fecha ingresada correctamente!\nFecha: " + dia + "/" + mes + "/" + anio );
                    break;
                }

                else{
                    System.out.println("El mes ingresado fue correcto: " + mes );
                    System.out.println("El dia ingresado es incorrecto.: " + dia);
                    System.out.println("Fecha ingresada incorrectamente");
                    break;
                }
                default: 
                System.out.println("Fecha ingresada incorrectamente");
                System.out.println("El mes fue ingresado incorrectamente: " + mes );
                System.out.println("No se puede comprobar si el dia ingresado fue correto: " + dia );
            }

        }

    }


}
