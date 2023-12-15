package j08_Loops.WhileLoops.WhileLoops_Tasks;

import java.util.Scanner;

public class task05 {
    /*
task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
 ayni satirda aralarina bosluk birakarak print rden code create ediniz
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your full name...");
        String fullName = scn.nextLine();
        String concat = fullName.replaceAll("\\W", "");
        int i =0;
            while (i < concat.length()) {
                System.out.print(concat.charAt(i));
                i++;
            }


    }
}