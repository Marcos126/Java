package org.example;

/**
 * Leer dos series de 10 enteros, que estaran ordenados crecientemente. Copiar(fusionar)
 * las dos tablas en una tercera, de forma que sigan ordenados.
 */
public class App
{
    public static void main( String[] args )
    {
        int[] serie1 = {1,2,3,4,5,6,7,8,9,10};
        int[] serie2 = {11,12,13,14,15,16,17,18,19,20};

        int[] serie3 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] serie4 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] serie5 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int[] serie6 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        App pp = new App();

        pp.fusionTablas(serie3,serie4);
        System.out.println(" ");
        pp.fusionTablas(serie1,serie2);
        System.out.println(" ");
        pp.fusionTablas(serie5,serie6);

    }
    public void fusionTablas(int [] lista1,int [] lista2){

        int[] lista3 = new int [lista1.length + lista2.length];

        int iterador_lista1 = 0;
        int iterador_lista2 = 0;
        int iterador_lista3 = 0;
        while(iterador_lista1 < lista1.length && iterador_lista2 < lista2.length) {
            if(lista1[iterador_lista1] < lista2[iterador_lista2]){
                lista3[iterador_lista3++] = lista1[iterador_lista1++];
            }else{
                lista3[iterador_lista3++] = lista2[iterador_lista2++];
            }
        }

        while(iterador_lista1 < lista1.length){
            lista3[iterador_lista3++] = lista1[iterador_lista1++];
        }
        while(iterador_lista2 < lista2.length){
            lista3[iterador_lista3++] = lista2[iterador_lista2++];
        }

        for(int i: lista3){
            System.out.println(i);
        }
    }
}
