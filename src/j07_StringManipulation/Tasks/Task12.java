package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task12 {       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write 3 words name ");
        String name = scn.nextLine().toUpperCase();
        String firstLetter = name.substring(0,1);
        String secondLetter = name.substring(name.indexOf(" ")+1 );
        String thirdLetter = name.substring(name.lastIndexOf(" ")+1);
        System.out.println(" " + firstLetter.charAt(0) + secondLetter.charAt(0) + thirdLetter.charAt(0));

    }
}
