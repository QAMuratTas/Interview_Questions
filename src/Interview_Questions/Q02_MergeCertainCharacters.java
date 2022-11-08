package Interview_Questions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir String giriniz:  ");
        String str = scanner.nextLine();
        System.out.println("Bir sayı giriniz:");
        int syi =scanner.nextInt();

        System.out.println("ilkSonHarf(str, syi) = " + ilkSonHarf(str, syi));


    }

    private static String ilkSonHarf(String str, int syi) {

        String ilkSon= str.substring(0,1) + str.substring(str.length() - 1);
        System.out.println("ilk son harfler : "+ilkSon);
        String output="";
        for (int i = 0; i <syi ; i++) {

            output +=ilkSon;


        }

        return output;
    }


}
