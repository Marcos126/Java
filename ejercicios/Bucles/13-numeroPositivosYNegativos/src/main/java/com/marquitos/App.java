package com.marquitos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Pedir 10 numeros, mostrar la media de los numeros positivos, 
 * la media de los numero negativos y la cantidad de ceros
 *
 */
public class App 
{
    public static void main( String[] args )
{
        Scanner input = new Scanner(System.in);
        Integer numero;
        Integer suma_pos = 0;
        Integer suma_neg = 0;
        Integer conteo_pos = 0;
        Integer conteo_neg = 0;
        Integer conteo_ceros = 0;
        float media_pos;
        float media_neg;

        for(int i = 0; i<= 9;i++){
            numero = input.nextInt();

            if(numero == 0){
                conteo_ceros += 1;
            }
            else if(numero > 0){
                suma_pos += numero;
                conteo_pos += 1;
            }
            else if(numero < 0){
                suma_neg += numero;
                conteo_neg += 1;
            }


            System.out.println(i);
        }

        input.close();
        if(conteo_pos != 0 ){
            media_pos = suma_pos / conteo_pos;
            JOptionPane.showMessageDialog(null, "Media de numeros positivos: " + media_pos);
        }
        else{

            JOptionPane.showMessageDialog(null, "No hubo numero positivos");
        }
        if(conteo_neg != 0){
            media_neg = suma_neg / conteo_neg;
            JOptionPane.showMessageDialog(null, "Media de numeros negativos: " + media_neg );

        }
        else{
            JOptionPane.showMessageDialog(null, "No hubo numero negativos");

        }

        JOptionPane.showMessageDialog(null, "Conteo de ceros: " + conteo_ceros );
    }
}
