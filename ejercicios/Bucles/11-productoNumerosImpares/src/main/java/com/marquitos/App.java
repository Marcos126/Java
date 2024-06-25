package com.marquitos;

/**
 * diseniar un programa que muestre el producto de los primeros 10 numeros impares
 *
 */
public class App 
{
    public static void main( String[] args )
{
        Integer counter = 0;
        Integer productometro=1;

        for(Integer numero = 0; counter != 10 ; numero ++){
            if(numero % 2 != 0){
                productometro *= numero;
                counter++;

            }
        }
        System.out.println(productometro);
    }
}
