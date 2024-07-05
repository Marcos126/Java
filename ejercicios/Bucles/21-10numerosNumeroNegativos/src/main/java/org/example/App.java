package org.example;

import java.util.Scanner;

/**

 Pedir 10 numero, y mostrar al final si se ha introducido alguno negativo.

 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int numero;
        boolean numeros_negativos = false;

        for(int i = 1; i <= 10; i++){
            System.out.print("Por favor ingrese un numero: ");
            numero = input.nextInt();
            if(numero < 0){
                numeros_negativos = true;
            }
        }
        if(numeros_negativos){
            System.out.println("Se han introducido numeros negativos");
        }
        else{
            System.out.println("No se han introducido numeros negativos");
        }
    }
}
