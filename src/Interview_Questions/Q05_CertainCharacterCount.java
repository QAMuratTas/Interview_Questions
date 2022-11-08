package Interview_Questions;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /*
    * Kullanicidan bir cumle ve bir harf alin,
    * Cumlede harfin kac kere
    * kullanildigini bulup, yazdirin
    * ORNEK:
    * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
    *
    * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cumle = sc.nextLine();

        System.out.println("harf giriniz : ");
        char harf = sc.next().charAt(0);

        int count =0;
        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.charAt(i) == harf) {
                count++;

            }

        }
        System.out.println("girdiğiniz cumlede "+ harf + " harfi "+ count+" kadar var.");



    }}
