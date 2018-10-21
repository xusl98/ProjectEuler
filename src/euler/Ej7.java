/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.ArrayList;

/**
 *
 * @author Jesus SS
 */
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
public class Ej7 {

    static ArrayList<Integer> lista = new ArrayList<>();

    public static void main(String[] args) {
        int count = 1;
        boolean condition = true;
        int numPrime = 0;

        int x = 0;
        while (condition) {
            count++;
            if (esPrimo(count)) {
                numPrime++;
//                System.out.println(x);
//                x++;
//                System.out.println(count);
//                lista.add(count);
            }
            if (numPrime == 10001) {
                System.out.println(count);
                condition = false;
            }
        }

    }

    public static boolean esPrimo(double x) {

        boolean salida = true;

        for (double i = x - 1; i > 1; i--) {
            if (x % i == 0) {
                salida = false;
            }
        }

        return salida;
    }

}
