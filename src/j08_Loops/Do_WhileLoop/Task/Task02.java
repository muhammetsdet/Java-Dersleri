package j08_Loops.Do_WhileLoop.Task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz
        Scanner input = new Scanner(System.in);

        System.out.println("başlama character giriniz : ");
        char startChar = input.next().charAt(0);

        System.out.println("bitis character giriniz : ");
        char endChar = input.next().charAt(0);

        do {
            System.out.print(startChar + " ");
            startChar = (char) (startChar + 1);// mevcut char'ı bir sonrakine atamak için-> a->b->c

        }
        while (startChar <= endChar);

    }
}
