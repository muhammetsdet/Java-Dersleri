package j08_Loops.Tasks;

import java.util.Scanner;

public class Task29 {
    // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
    // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
    // ornek : Haluk  output: HaLuK

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Say something...");
        String str =scn.next();
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(i % 2 == 0 ? str.substring(i, i + 1).toUpperCase() : str.substring(i, i + 1).toLowerCase());


        }
    }

}
