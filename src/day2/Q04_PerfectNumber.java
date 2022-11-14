package day2;

import java.util.Scanner;

public class Q04_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi = scanner.nextInt();

        perfectNumber(sayi);
        girilenSayiyaKadarOlanPerfect(sayi);

    }

    private static void girilenSayiyaKadarOlanPerfect(int sayi) {
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {// girilen sayıya bakar
            for (int j = 1; j <i ; j++) {// bölenleri kontrol edilir.
                if(i%j==0) {// sayının herhangı bit bolenı varsa
                    toplam+=j;// bölenleri toplama ekle

                }

            }
            if (toplam==i){
                System.out.println(i + " mukemmel sayıdır");

            }
            toplam=0;
        }



    }

    private static void perfectNumber(int sayi) {

        int toplam =0;

        for (int i = 1; i <sayi ; i++) {//1 den başlayarak bölenleri kontrol edeceğiz sayi dahil olmamalı
            if (sayi%i==0){// sayının herhangi bir böleni  (i)varsa
                toplam+=i;// toplam değişkenine ekle
                System.out.print(i+" ");// bölenleri görmek için ekledik
            }

        }
        System.out.println();
        if (toplam==sayi){// bölenlerin toplamı sayıa eşitase
            System.out.println(sayi + " sayisi mükemmel sayıdır..");

        }else
            System.out.println(sayi + " sayisii mukemmel sayi değildir...");


    }
}