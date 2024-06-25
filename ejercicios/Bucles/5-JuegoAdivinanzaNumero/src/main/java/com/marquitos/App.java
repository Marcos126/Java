package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Realizar un juego para adivinar un 
 * numero. Para ello generar un numero aleatorio entre 0-100, y luego ir pidiendo
 * numero indicando " es mayor" o "es menor" segun sea requerido con respecto a N.
 * el proceso termina cuando el usuario acierta y mostrar el numero de intentos.
 */
public class App 
{
    public static void main( String[] args )
{
        int input,numeroAleatorio,counter;

        counter = 1;
        numeroAleatorio = (int)(Math.random() * 101);
        JOptionPane.showMessageDialog(null,"Se ha generado numero aleatorio\nIntenta Adivinarlo");
        input = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        while(input != numeroAleatorio){
            if (input > numeroAleatorio){
                JOptionPane.showMessageDialog(null,"Es mayor");
            }
            else{
                JOptionPane.showMessageDialog(null,"Es menor");
            }
            counter++;
            input = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        }
        JOptionPane.showMessageDialog(null,"Adivinaste!");
        JOptionPane.showMessageDialog(null,"Lo intentaste: " + counter + " Veces");
    }
}
