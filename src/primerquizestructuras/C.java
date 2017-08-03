/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerquizestructuras;

import java.util.Scanner;

/**
 *Se tiene un arreglo de n números enteros no negativos menores a 109, queremos imprimir una lista de tamaño 2n de la siguiente forma:

Primero va el mayor numero de la lista, segundo va el menor numero de la lista, tercero va el segundo mayor numero de la lista, cuarto va el segundo menor numero de la lista, ... ultimo va el mayor numero de la lista.

Input
La entrada consiste primero de una linea con el numero n (1 ≤ n ≤ 1000), seguida por una linea con los n números de la lista separada por espacios

Output
la lista de tamaño 2n descrita en el problema
 * @author Carmen_Lucia3
 */
public class C {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lenght=reader.nextInt();
        while (lenght > 100000 && lenght <1) {
            lenght = reader.nextInt();
        }

        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = reader.nextInt();
        }
        int[] orderArray = new int[lenght];

        for (int j = 0; j < lenght - 1; j++) {
            for (int i = 0; i < lenght - 1; i++) {

                if (array[i] < array[i + 1]) {

                    int menor = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = menor;

                }

            }
        }

        int[] opposite = new int[lenght];
        for (int i = 1; i <= lenght; i++) {
            opposite[i - 1] = array[lenght - i];
        }
        
        for (int i = 0; i <lenght; i++) {
            System.out.print(array[i] + " " + opposite[i] + " ");
        }

    }

}
