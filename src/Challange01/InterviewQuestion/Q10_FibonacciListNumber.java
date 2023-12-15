package Challange01.InterviewQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayıya kadar FIBONACCI dizisini print eden code create ediniz.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Write any number of");
        int sayi =input.nextInt();
        if (sayi<=0){
            System.out.println("Write a real number");

        } else if (sayi==1) {
            list.add(1);
            System.out.println(list);

        } else if (sayi==2) {
            list.add(1);
            list.add(1);
            System.out.println(list);

        } else{
            int sayi1=1;
            int sayi2=1;
            int sayi3;
            list.add(sayi1);
            list.add(sayi2);

            for (int i = 3; i <= sayi; i++) {
                sayi3=sayi1+sayi2;
                list.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
            }
        }
        System.out.println(list);

    }
}