package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numero,dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero por favor"));

        //!= diferente
        //== igual
        //> mayor que 
        //< menor que 
        //<=menor o igual
        //>= mayor o igual
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"El numero es igual a 5");
        }
        else {

            JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
        }
    
    }
}
