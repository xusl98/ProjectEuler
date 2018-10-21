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
public class Ej9 {

    static double limit = 1000;
    static double num1;
    static double num2;
    static double num3;

    public static void main(String[] args) {

        System.out.println(Pythag());

    }

    public static String Pythag() {

        for (int i = 1; i <= limit - 2; i++) {
            //This means the first number cannot be bigger than 1000 - 2 meaning that the other 
            //two variables will have at least value 1 (1*1)
            if (i > 374){
                System.out.println(i);
            }
            num1 = i;
            for (int c = 1; c <= (limit - i - 1); c++) {
                //This means the second number cannot be bigger than 1000 - i -1 meaning that the other 
                // variable will have at least value 1 and it also takesin account the value of the previous number
                num2 = c;
                for (int j = 1; j <= (limit - i - c); j++) {
                    //This means the second number cannot be bigger than 1000 - i -c cause it takes in account the 
                    //two previous numbers
                    num3 = j;

                    if ((Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2)) && (num1 + num2 + num3 == limit)) {
                        
                        System.out.printf("%.0f*%.0f*%.0f = %.0f\n", num1, num2, num3, (num1*num2*num3));
                        return num1 + "+" + num2 + "+" + num3 + "=" + limit;
                    }

                }

            }

        }
        return "Not found";
    }

}
