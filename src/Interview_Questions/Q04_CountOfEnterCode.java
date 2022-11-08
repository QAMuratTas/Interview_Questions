package Interview_Questions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
String pin ="sumeyra12345";
int girisHakki=4;
Scanner sc= new Scanner(System.in);
        System.out.println("***********HoşGeldiniz**********");


        while (true) {
            System.out.println("Pin kodu giriniz: ");
            String girilenPin = sc.nextLine();
        if (pin.equals(girilenPin)) {
            System.out.println("Başarılı giriş yaptınız.....");
        break;
        }else {
            System.out.println("Yanlış giriş yaptınız ....");
            girisHakki--;
            System.out.println("kalan giriş hakkınız : "+girisHakki);
        }
if (girisHakki==0){
    System.out.println("giriş hakkınız kalmadi....sim kartınız bloke oldu....");
    break;
}
        }








    }
}
