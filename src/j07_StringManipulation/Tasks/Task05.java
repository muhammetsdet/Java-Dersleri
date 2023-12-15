package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task05 {
    /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..

 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your first name");
        String firstName = scn.next();
        System.out.println("Write your last name");
        String lastName = scn.next();
        String firstLetter = firstName.substring(0, 1).toUpperCase();
        String lastLetter = lastName.substring(0, 1).toUpperCase();
        System.out.println(firstLetter+ firstName.substring(1,firstName.length()) + " " + lastLetter.concat(lastName.substring(1,lastName.length())));


    }
}
