package com.marquitos;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner input = new Scanner(System.in);
        double valorCompra,totalAPagar;
        
        System.out.print("Ingrese el valor de su compra: ");
        valorCompra = input.nextDouble();
        input.close();

        if(valorCompra >= 300){
            totalAPagar = valorCompra * 0.8;
            System.out.println( "Usted accedio al descuento y el total de su compra es: " +  totalAPagar);
        }
        else{
            System.out.println( "Usted no accedio al descuento y el total de su compra es: " +  valorCompra);

        }

    }
}
