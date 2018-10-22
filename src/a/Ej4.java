package a;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jesus SS
 */

/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
public class Ej4 {

    public static ArrayList<Integer> lista = new ArrayList<>();

    public static int copia = 0;

    public static void main(String[] args) {

        int num;
        int mayor = 0;

        for (int i = 100; i <= 999; i++) {

            for (int c = 100; c <= 999; c++) {
                num = i * c;
//                System.out.println(i+"*"+c);
                if (sacarNumeros(num)) {
                    if (num > mayor) {
                        mayor = num;
                    }
                }
            }
        }
        System.out.println(mayor);

        /*Ya está hecho el cálculo de i es pálindromo falta sacar lo del múltiplo de los 3 dígitos*/
    }

    public static boolean sacarNumeros(int x) {
        boolean salida = true;
        copia = x;
        String c = String.valueOf(x);

        for (int i = 0; i < c.length(); i++) {
            lista.add(x % 10);
            x = x / 10;
        }
//        System.out.println(lista);
        return esPalindromo();
    }

    public static boolean esPalindromo() {

        boolean salida = true;
        int ii = lista.size() - 1;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i) != lista.get(ii)) {
                salida = false;
                lista.clear();
            }
            ii--;
        }

        if (salida == true) {
//            System.out.println("si es");
        } else {
//            System.out.println("no lo es");
        }
        return salida;
    }

}
