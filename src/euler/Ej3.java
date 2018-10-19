package euler;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jesus SS
 */
/*
* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Ej3 {

    public static void main(String[] args) {

        double dividendo;
        double divisor;
        boolean condicion = true;
        boolean condicionG = true;
        double solucion = 0;
        double sigDiv = 0;
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        System.out.println("Dividendo");
        dividendo = sc.nextDouble();
        divisor = 2;

        while (condicionG) {
            
            //Esto calcula un primo
            while (condicion) {

                if ((dividendo % divisor == 0) && (esPrimo(divisor))) {
                    solucion = divisor;
                    sigDiv = dividendo / divisor;
                    condicion = false;
                    if (sigDiv == 1){
                        condicionG = false;
                    }
                }
                divisor++;

            }
            condicion = true;
            dividendo = sigDiv;
            lista.add(solucion);
        }
        
        System.out.println(lista);
        

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
