package org.example;
/*
 Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce
 el precio por litro. Solo existen tres productos con precios:
 0,6 $/litro
 3 $/litro
 1,24 $/litro

 */

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args)
    {
        Integer litros;
        int nro_de_factura;
        int code_articulo;
        int factura_600_plus = 0;
        float valor_actual;
        int conteo_facturas = 0;

        int ventas_articulo_1 = 0;

        float valor_total = 0f;

        Float precio_por_litro;

        for(int i = 1; i<=5;i++){
            nro_de_factura = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de factura"));
            code_articulo = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el code de articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de litros vendida"));


            switch(code_articulo){
                case 1:
                    precio_por_litro = 0.60f;
                    valor_actual = litros * precio_por_litro;
                    valor_total += valor_actual;

                    break;
                case 2:
                    precio_por_litro = 3f;
                    valor_actual = litros * precio_por_litro;
                    valor_total += valor_actual;
                    break;
                case 3:
                    precio_por_litro = 1.24f;
                    valor_actual = litros * precio_por_litro;
                    valor_total += valor_actual;
                    break;
                default:
                    System.out.println("Por favor ingrese un numero del 1 al 3");
                    continue;
            }

            if(precio_por_litro * litros > 600){
                factura_600_plus++;
            }

            if(code_articulo == 1){
                ventas_articulo_1 += litros;
            }

            if(nro_de_factura != 0) {
                conteo_facturas++;
            }


        }
        System.out.println("Valor total de todas las facturas: "+  valor_total);
        System.out.println("Facturas por mas de $600: " + factura_600_plus);
        System.out.println("Ventas del articulo 1: " + ventas_articulo_1);
        System.out.println("La cantidad de facturas fue: " + conteo_facturas);
    }
}