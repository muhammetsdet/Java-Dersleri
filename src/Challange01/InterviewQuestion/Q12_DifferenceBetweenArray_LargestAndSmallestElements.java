package Challange01.InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz");
        int boyut= input.nextInt();
        int arr[]=new int[boyut];
        for (int i = 0; i <boyut ; i++) {
            System.out.println(i + ". index eemanı giriniz");
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1] - arr[0]);

        //2.Yol
        int buyuk=0;
        int kucuk=Integer.MAX_VALUE;
        System.out.println(kucuk);
        for (Integer w:arr) {
            if (buyuk < w){
                buyuk=w;
            }
            if (kucuk>w){
                kucuk=w;
            }
        }
        System.out.println(buyuk - kucuk);
        System.out.println("***");
        System.out.println(buyuk);
        System.out.println("***");
        System.out.println(kucuk);

    }
}