/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Se tienen 2 números enteros A y B ( - 109 ≤ A, B ≤ 109).

Queremos en varias lineas el resultado de las siguientes operaciones entre estos números:

6 * A2 + 5 * B2
[A / B] ([] es el operador parte entera)
A / B (division real redondeada a 6 decimales)
f(A), donde f(A) es el valor en ascii correspondiente a A si 33 ≤ A ≤ 126, en otro caso f(A) = 0
f(B), donde f(B) es el valor en ascii correspondiente a B si 33 ≤ B ≤ 126, en otro caso f(B) = 0
Input
La entrada consiste en 2 números enteros A y B ( - 109 ≤ A, B ≤ 109, B ≠ 0)

Output
La salida consiste en 5 lineas, en cada linea el resultado de la operación correspondiente, para operaciones de números reales imprimir el valor redondeado a 6 decimales exactamente
 * @author Carmen_Lucia3
 */
package primerquizestructuras;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PoblemaB {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        while(a<Math.pow(-10,9)){
            a = leer.nextInt();
        }
        int b = leer.nextInt();
        while(b>Math.pow(10,9) && b!=0){
            b = leer.nextInt();
        }
        System.out.println((int)(6*Math.pow(a, 2) + 5 * Math.pow(b, 2)));
        System.out.println((int)a/b);
        DecimalFormat asa = new DecimalFormat("0.000000");
        System.out.println(asa.format(a/b));
        if(a>=33 && a<=126){
            System.out.println((char)a);
        }else{
            System.out.println("0");
        }
        if(b>=33 && b<=126){
            System.out.println((char)b);
        }else{
            System.out.println("0");
        }
    }
    
}
