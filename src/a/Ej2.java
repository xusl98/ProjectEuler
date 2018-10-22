package a;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus SS
 */
public class Ej2 {

    public static void main(String[] args) {

        int sum = 0;
        int x = 1;  
        int y = 2;  
        while (x <= 4000000) {
            if (x % 2 == 0) {
                sum += x;
            }
            int z = x + y;
            x = y;
            y = z;
        }
        System.out.println(sum);
    }

}
