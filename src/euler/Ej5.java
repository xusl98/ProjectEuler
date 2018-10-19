package euler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus SS
 */
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
public class Ej5 {

    public static void main(String[] args) {

//        boolean sirve = true;
        boolean condicion = true;
        int num = 20;
        int resultado = 0;
        int i;
        while (condicion) {
            //Calcula si es divisible entre unos numeros
            for (i = 1; i <= 20; i++) {
//                System.out.println(num + "%" + i);
                if (num % i != 0) {
                    i = 50;
                }
            }
            if (i == 21) {
                resultado = num;
                condicion = false;
            }
            num += 20;

        }

        System.out.println(resultado);
        //TAMBIEN SE PUEDE HACER ASI MAS SIMPLIFICADO
//        int i = 20;
//
//        while (i % 2 != 0 || i % 3 != 0 || i % 4 != 0 || i % 5 != 0
//                || i % 6 != 0 || i % 7 != 0 || i % 8 != 0 || i % 9 != 0
//                || i % 10 != 0 || i % 11 != 0 || i % 12 != 0 || i % 13 != 0
//                || i % 14 != 0 || i % 15 != 0 || i % 16 != 0 || i % 17 != 0
//                || i % 18 != 0 || i % 19 != 0 || i % 20 != 0) {
//            i += 20;
//        }

    }

}
