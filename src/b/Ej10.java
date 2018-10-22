/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author Jesus SS
 */
public class Ej10 {

    public static void main(String[] args) {

        int limit = 2000000;
        double suma = 0;

        for (double i = 2; i < limit; i++) {

            if (isPrime(i)) {
//                System.out.println(i);
                suma += i;

            }
        }
//        System.out.println(suma);
        System.out.printf("%.0f\n", suma);

    }

//    public static boolean isPrime(double x) {
//
//        for (double i = 2; i < x - 1; i++) {
//            if (x % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
    //more efficient prime algorythm
        public static boolean isPrime(double n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
