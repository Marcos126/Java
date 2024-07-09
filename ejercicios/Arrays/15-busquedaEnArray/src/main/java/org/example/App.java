package org.example;

import java.util.Scanner;

/**
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
 * Se debe mostrar la posicion en que se encuentra, Si no está, indicarlo con un mensaje
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] lista_1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int busqueda_1 = 7;

        int [] lista_2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int busqueda_2 = 55;

        int [] lista_3 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int busqueda_3 = 5;

        int [] lista_4 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int busqueda_4 = 0;

        Scanner input = new Scanner(System.in);
        int nElementos = 10;
        int [] lista_de_prueba = new int [nElementos];

        for (int i = 0; i < nElementos;i++){
            System.out.print((i+1) + ". Por favor ingrese un numero: ");
            lista_de_prueba[i] = input.nextInt();
            if(i > 0){
                while(lista_de_prueba[i] < lista_de_prueba[i-1]){
                    System.out.print((i+1) + ". El numero debe ser mayor al anterior. : ");
                    lista_de_prueba[i] = input.nextInt();
                }
            }
        }

        System.out.println("Ingrese el numero que desea buscar: " );
        int busqueda_prueba = input.nextInt();

        busqueda(lista_de_prueba, busqueda_prueba);

        busqueda(lista_1,busqueda_1);
        busqueda(lista_2,busqueda_2);
        busqueda(lista_3,busqueda_3);
        busqueda(lista_4,busqueda_4);
    }

    public static void busqueda(int[] lista, int busqueda){


        for( int i = 0; i < lista.length; i++){
            if(lista[i] == busqueda){
                System.out.println("La posicion: " + i + " Tiene el valor: "  + busqueda) ;
                return;
            }
        }
        System.out.println("No se ha encontrado el valor en la tabla");
    }
}
