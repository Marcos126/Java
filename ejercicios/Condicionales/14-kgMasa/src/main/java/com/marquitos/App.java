package com.marquitos;

import javax.swing.JOptionPane;

/**
 * Hacer un programa que pase de Kg a otra unidad de medida
 * de masa, mostrar en pantalla un menu con las 
 * posibles opciones
 *
 * gramos       1,000
 * miligramos   1,000,000 
 * libras       2.20462
 * onzas        35.274
 *
 */
public class App 
{
    public static void main( String[] args )
{
        int peso,conversion,opcion;
        double libras,onzas;

        while (true){

            peso = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el peso en kg: "));
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones de conversion:\n"+ 
                "1 - Gramos\n"+
                "2 - Miligramos\n"+
                "3 - Libras\n"+
                "4 - onzas"));
            switch(opcion){
                case 1: conversion = peso * 1000;
                JOptionPane.showMessageDialog(null,"El peso de "+ peso +" En gramos es de: " + conversion);
                break;
                case 2: conversion = peso * 1000000;
                JOptionPane.showMessageDialog(null,"El peso de "+ peso +" En miligramos es de: " + conversion);
                break;
                case 3: libras = peso * 2.20452;
                JOptionPane.showMessageDialog(null,"El peso de "+ peso +" En libras es de: " + libras);
                break;
                case 4: onzas = peso * 35.274;
                JOptionPane.showMessageDialog(null,"El peso de "+ peso +" En onzas es de: " + onzas);
                break;
                default:
                JOptionPane.showMessageDialog(null,"La opcion ingresada no es correcta");
                break;
            }
        }
    }
}
