package j08_Loops.Do_WhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    // task -> girilen sayı 13'ten küçük ise "You winnn..." değilse sayı girisi isteyin
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num;
        do {
            System.out.println("Write a number");
            num = scn.nextInt();

        }while (num>=13);
        System.out.println(num + " You winnnnn...");
    }
}
