/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Jesus SS
 */
public class Ej6 {

    static int sum;
    static int square;

    public static void main(String[] args) {
        
        int sumSquares = sumOfSquares();
        System.out.println(sumSquares);
        
        int squareSum = squareOfSum();
        System.out.println(squareSum);
        
        int difference = squareSum -sumSquares;
        System.out.println(difference);
        
    }

    public static int sumOfSquares() {
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
    
    public static int squareOfSum(){
        int sum2 = 0;
        for (int i = 1; i <= 100; i++){
            sum2 += i;
        }
        square = (int)Math.pow(sum2, 2);
        return square;
    }

}
