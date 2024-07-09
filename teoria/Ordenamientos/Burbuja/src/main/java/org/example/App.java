package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] lista_1 = { 34, 7, 23, 32, 5, 62, 78, 4, 1, 29};
        int [] lista_2 = {19, 87, 54, 31, 2, 16, 45, 93, 8, 22};
        int [] lista_3 = {13, 46, 77, 24, 52, 3, 35, 68, 9, 30};


        ordenador(lista_1);
        System.out.println("\n");
        ordenador(lista_2);
        System.out.println("\n");
        ordenador(lista_3);
    }
    public static void ordenador(int [] lista){

        int variable_auxiliar;
        for(int i = 0; i < lista.length - 1 ; i++){
            for (int j = 0; j < lista.length - 1 - i; j++){
                if(lista[j] > lista[j+1]){
                    variable_auxiliar = lista[j+1];
                    lista[j+1] = lista[j];
                    lista[j] = variable_auxiliar;
                }
            }
        }
        for(int i:lista){
            System.out.print(i + " - ");
        }
    }
}
