/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerquizestructuras;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *Se tienen 2 números enteros positivos A y B.

Ambos números tienen una representación en binario A2 y B2, en esta representación podemos hacer la operación XOR (o exclusivo) por cada dígito (bit), la operación XOR retorna 0 en caso que ambos bits sean iguales y 1 en caso que no lo sean. Por ejemplo sea A = 9 y B = 5, las representaciones en binario correspondientes son A2 = 1001 B2 = 0101, ahora A2 XOR B2 = 1100. Ahora A XOR B es la representación decimal de A2 XOR B2, en el ejemplo anterior A XOR B = 12
Por otro lado, por el teorema fundamental de la aritmética tenemos que para los 2 enteros existe un único entero K y un único entero R (0 ≤ R < B) tal que A = B * K + R, el numero R se llama el modulo o residuo de A en B y se denota R = A MOD B.
En este problema queremos que dado 2 números A y B (1 ≤ A, B ≤ 109) se imprima A XOR B y A MOD B

Input
La entrada consiste en 2 numeros enteros positivos A, B (1 ≤ A, B ≤ 109)

Output
La salida consiste en 2 lineas, la primera con el resultado de A XOR B y la segunda con el resultado de A MOD B
 * @author Carmen_Lucia3
 */
public class PrimerQuizEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        while(a<1){
            a = leer.nextInt();
        }
        int b = leer.nextInt();
        while(b>Math.pow(10,9)){
            b = leer.nextInt();
        }
        int c = a^b;
        int r = a%b;
        System.out.println(c);
        System.out.println(r);
    }
    
}
