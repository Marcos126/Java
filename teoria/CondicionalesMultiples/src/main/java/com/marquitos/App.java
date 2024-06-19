package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Condicionales multiples utilizando Switch
 *
 * case(opcion){
 * case $opcion: accion
 *               break;
 * case $opcion: accion
 *               break;
 * case $opcion: accion
 *               break;
 * case $opcion: accion
 *               break;
 * }
 */
public class App 
{
    public static void main( String[] args )
    {
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 5"));

        switch(numero){
            case 1: JOptionPane.showMessageDialog(null,"Usted ingreso el dato 1");
            break;
            case 2: JOptionPane.showMessageDialog(null,"Usted ingreso el dato 2");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Usted ingreso el dato 3");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Usted ingreso el dato 4");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Usted ingreso el dato 5");
            break;
            default: JOptionPane.showMessageDialog(null,"Por favor ingrese un numero del 1 al 5");
            break;

        }
    }
}
