package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
      /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz
        a->7
        v->1
        c->-4
        e->2
         */
      static Scanner scn = new Scanner(System.in);
      public static void main(String[] args) {

     secretLanguage();

      }

      private static void secretLanguage() {
            System.out.println("Say a secret");
            String newWords = scn.next();
          newWords = newWords.replace("a", "7");
          newWords = newWords.replace("v", "1");
          newWords = newWords.replace("c", "-4");
          newWords = newWords.replace("e", "2");
            System.out.println("newWords = " + newWords);
      }


}
