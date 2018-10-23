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
public class Ej12 {

    static boolean condition = true;

    public static void main(String[] args) {
        
        int num = 1;
        int numDivisors = 0;
        int startingNumber = 2;

        while (condition) {
            numDivisors = 0;
//            System.out.println(num);
            for (int i = 1; i <= (int)Math.sqrt(num); i++) {//With this we take divisors until the square root and then we multiply
                                                            //it by 2 so we dont have to find themand this way we improve the efficiency
                if (num % i == 0) {
                    numDivisors+=2;
                }
            }
            if (Math.sqrt(num)*Math.sqrt(num) == num){//This is done cause the square root divisor would appear twice
                numDivisors--;
            }
            if (numDivisors >= 500) {
                condition = false;
                System.out.println(num + " es el numero");
            }
            num += startingNumber;
            startingNumber++;
        }

    }

}
