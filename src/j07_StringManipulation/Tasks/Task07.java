package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task07 {
    /*
Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Say something...");
        String something = scn.next();
        System.out.println("say any number");
        int ind = scn.nextInt();
        if (ind<something.length() ) {
            System.out.println(something.charAt(ind));
        } else {
            System.out.println("You can write numbers up to maximum character length");
        }

    }
}