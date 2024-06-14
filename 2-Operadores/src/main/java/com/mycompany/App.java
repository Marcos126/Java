//Class Math
package com.mycompany;

public class App 
{
    public static void main( String[] args )
    {
        // Raices cuadradas
        // para transformar esto a int, en caso de que no se quiera utilizar double, se puede hacer de la siguiente manera, 
        // int raiz = (int)Math.sqrt(9);
        // System.out.println("La raiz cuadrada es " + raiz );
        //  de esta manera cambiamos los valores a int, aunque si el numero que ingresamos tiene decimales va a mostrar solo la parte entera
        double raiz = Math.sqrt(9);
        System.out.println("La raiz cuadrada es " + raiz );

        // Potencias 
        //
        double base = 5, exponente = 2;
        double potencia = Math.pow(base,exponente);
        System.out.println("La potencia de 3 elevado a 2 es: " +  potencia);
        

        
    }
}
