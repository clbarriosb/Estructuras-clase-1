/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerquizestructuras;

import java.util.Scanner;

/**
 *Julieta es una niña a la que le gustan los juegos donde tiene que pensar de maneras no convencionales, en este caso ella creo un juego llamado "Ganoi" donde inicia con un numero n entero positivo (1 ≤ n ≤ 100), si n = 1 Julieta escribe 1 en el tablero, en otro caso Julieta hace Ganoi de n / 2 en caso que n sea par o de (n + 1) / 2 en caso que n sea impar, luego escribe n en el tablero y finalmente hace Ganoi de n / 3 en caso que n sea divisible entre 3, en otro caso hace Ganoi de n - 1

Input
La entrada consiste de un numero entero positivo n (1 ≤ n ≤ 100)

Output
La salida consiste en varios números separados por espacios, los números que Julieta escribió, en el orden en el que lo hizo
 * @author Carmen_Lucia3
 */
public class D {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        while (a < 1 && a > 100) {
            a = leer.nextInt();
        }
        int b = a;
        if (a == 1) {
            System.out.print(a + " ");
            System.exit(0);
        } else {
            while (a != 1) {
                if (a % 2 == 0) {
                    a = a / 2;
                    System.out.print(a + " ");
                } else {
                    a = ((a + 1) / 2);
                    System.out.print(a + " ");
                }
            }

        }
        System.out.print(b + " ");
        while (b != 1) {
            if (b % 3 == 0) {
                b = b / 3;
                System.out.print(b + " ");
            } else {
                b = b - 1;
                System.out.print(b + " ");
            }
        }
    }
}
