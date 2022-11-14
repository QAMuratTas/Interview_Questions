package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array uzunluk: ");
        int uzunluk = sc.nextInt();
        int[] arr = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Arrayin " + (i + 1) + ". elemanını giriniz : ");
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("difference: " + (arr[arr.length - 1] - arr[0]));

    }
}