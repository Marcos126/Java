package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Una empresa que se dedica a la venta de desinfetantes necesita un programa para 
 * gestionar las facturas. En cada factura figura: el codigo del articulo,
 * la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas:
 * Facturacion total, cantidad de litros vendidos del articulo 1 y cuantas facturas 
 * se emitieron de mas de $600
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer litros;
        Integer nro_de_factura;
        Integer codigo_articulo;
        Integer factura_600_plus = 0;
        Integer ventas_articulo_1 = 0;

        Float valor_total = 0f;

        Float precio_por_litro;

        for(int i = 1; i<=5;i++){
            nro_de_factura = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de factura"));
            codigo_articulo = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el codigo de articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de litros vendida"));
            precio_por_litro = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese el precio por litro(usando .)"));

            valor_total += litros * precio_por_litro;
            
            if(precio_por_litro * litros > 600){
                factura_600_plus++;
            }

            if(codigo_articulo == 1){
                ventas_articulo_1 += litros;
            }
        }
            System.out.println("Valor total de todas las facturas: "+  valor_total);
            System.out.println("Facturas por mas de $600: " + factura_600_plus);
            System.out.println("Ventas del articulo 1: " + ventas_articulo_1);
    }
}
