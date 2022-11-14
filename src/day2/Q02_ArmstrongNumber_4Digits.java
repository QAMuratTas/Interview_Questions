package day2;

import java.util.Scanner;

public class Q02_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı Girinz:");
        String strSayi = sc.next();
        armstrongMethod(strSayi);

    }

    private static void armstrongMethod(String strSayi) {

        String []basamak =strSayi.split("");
        int toplam =0;
        for (int i = 0; i < basamak.length ; i++) {
            toplam +=Math.pow(Integer.valueOf(basamak[i]), basamak.length);// Math.pow(taban,üs)
            // String olan herbir basamagı  integer a çevirdik
            //basamal.lenght -> üs
        }
        System.out.println(Integer.valueOf(strSayi) == toplam ? "bu bir armstrong sayıdır" : "bu bir armstrong sayi değildir.");


    }
}