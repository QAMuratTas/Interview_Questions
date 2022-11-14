package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ");
        int sayi = sc.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("daha büyük sayi giriniz...");
        } else {
            while (fibonacci.get(i) < sayi) {// fibonacci elemanları sayidan kucuk oldugu surece
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));// bir önceki eleanla toplai
                i++;


            }

if(fibonacci.get(fibonacci.size()-1)>sayi){
    fibonacci.remove(fibonacci.get(fibonacci.size()-1));// bu elemanı kaldır
                System.out.println("girdiğiniz sayı fibonacci dizisinde bulunmamaktadır."+"\n Girilen sayiya kadar olan fibonacci dizisi :"+fibonacci);
            }else {
    System.out.println("Girdiğiniz sayi fibonacci dizisinde bulunmakatadır.");

            }


        }


    }


}
//while(fibonacci.get(i) + fibonacci.get(i-1))<sayi)  desek te olur sanirim..