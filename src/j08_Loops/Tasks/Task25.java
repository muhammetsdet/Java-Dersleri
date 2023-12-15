package j08_Loops.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
   String str = "etme bene enneni";
   String words = "";
        for (int i = 0; i <str.length() ; i++) {
         char letter = str.charAt(i);
         if (words.indexOf(letter) == -1){
             words+=letter;
         }
        }
        System.out.println(words);

    }
}
