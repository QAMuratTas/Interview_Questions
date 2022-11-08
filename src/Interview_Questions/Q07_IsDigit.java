package Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_IsDigit {
      /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {
      String str = "J4\\/4 1$ 34$¥" ;

isDigit(str);




    }

    private static void isDigit(String str) {
        int sum =0;
        for (int i = 0; i <str.length() ; i++) {


            if (Character.isDigit(str.charAt(i))) {


                sum+=Integer.parseInt(String.valueOf(str.charAt(i)));// önce char at i Stringe çevirdi. daha sonra parse int ile integer a çevirdi.

            }

        }
        System.out.println("sum = " + sum);

    }
}
