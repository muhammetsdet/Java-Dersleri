package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task06 {
    /*
Girilen String'in son karakterini silen code create ediniz...
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Say something...");
        String say = scn.next();
        System.out.println(say.substring(0, say.length() - 1));
        System.out.println(say);// When ı print again It doesn't delete permanently
    }
}
