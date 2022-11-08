package Interview_Questions;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı Giriniz");
        int sayi =scan.nextInt();
        int a =Math.abs(sayi);
        boolean flag=true;

        if (a>=2){
            for (int i = 2; i <a ; i++) {
                if (a%i==0){
                    flag=false;
                    break;
                }
            }
        if (flag==true) {
            System.out.println("sayi asaldir");

        }else System.out.println("sayı asal değildir");


        }else System.out.println("SAyı asal değildir");


    }
}