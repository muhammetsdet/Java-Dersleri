package j08_Loops.Tasks;

import java.util.Scanner;

public class Task28 {

    // task-> girilen  bir char karakterden sonra gelen 10 karakteri print eden code create ediniz
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Say a character....");
        String chr = scn.next();
      /* Instead of finding the index of the character received from the user,
         Calculate new character using character's ASCII value and incremented value in loop
        Let's get the ASCII value of the character directly.
        */
        char character = chr.charAt(0);
        for (int j = 1; j <= 10; j++) {
            char newChar = (char) (character + j);
            System.out.print(j +"." +newChar + " ");
        }
    }



}

