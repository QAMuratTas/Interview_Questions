package Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    public static void main(String[] args) {


   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir string giriniz :");
        String str = sc.nextLine();
        //split
        String[] arr = str.split("");//her bir karakteri ayırdık
        System.out.println(Arrays.toString(arr));
        // sor()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //count : Sayaç oluştur
        int count = 0;
        // karakterleri karşılaştırmak için for loop

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {// birden fazla karakter içim
                count++;
                System.out.println(arr[i-1]+ " sayısı " + (count + 1));
            } else {
                System.out.println(arr[i-1] + " sayısı " + (count + 1));
                count = 0;
            }

            //if (i == arr.length - 1) {// en son karakter benzersiz ise için çalışır
              //  System.out.println(arr[i] + " sayısı " + (count + 1));

            //}

        }


    }
}
