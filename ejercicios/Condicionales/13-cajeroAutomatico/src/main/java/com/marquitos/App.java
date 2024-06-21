package com.marquitos;

import javax.swing.JOptionPane;

/**
 * hacer un programa que simule un cajero automatico con un saldo inicial de 1000 Dolares,
 * con el siguiente menu de opcion:
 *
 * 1 - Ingresar dinero a la cuenta
 * 2 - Retirar dinero de la cuenta
 * 3 - Salir
 *
 */
public class App 
{
    public static void main( String[] args )
{
        int opcion,dinero,inputDinero;
        dinero = 1000;

        while(true){
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la opcion\n" + 
                    "1 - Ingresar dinero a la cuenta\n" + 
                    "2 - Retirar dinero de la cuenta\n" +
                    "3 - Salir "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor introduzca un número válido.");
                continue;
            }
            if(opcion  == 1 ){
                JOptionPane.showMessageDialog(null,"Su saldo actual es de: " + dinero);
                inputDinero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el dinero que desea ingresar a la cuenta: "));
                dinero += inputDinero;
                JOptionPane.showMessageDialog(null,"Usted a agregado correctamente a su cuenta la cantidad " + inputDinero);
            }
            else if(opcion  == 2 ){
                JOptionPane.showMessageDialog(null,"Su saldo actual es de: " + dinero);
                inputDinero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el dinero que desea retirar a la cuenta: "));
                if (inputDinero > dinero){
                    JOptionPane.showMessageDialog(null,"Usted no posee dinero suficiente\nSaldo actual: " + dinero);
                }
                else{
                    dinero -= inputDinero;
                    JOptionPane.showMessageDialog(null,"Usted a retirado correctamente a su cuenta la cantidad " + inputDinero);

                }

            }
            else if(opcion  == 3 ){
                JOptionPane.showMessageDialog(null,"Su saldo final fue de: " + dinero + "\nAdios!");
                break;

            }
            else{
                JOptionPane.showMessageDialog(null,"La opcion ingresada es incorrecta, por favor introduzca las opciones 1 o 2 o 3 ");
            }

        }
    }
}
