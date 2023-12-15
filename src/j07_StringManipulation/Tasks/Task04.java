package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task04 {   /*      Task->
    Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
    ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
            name1= Java
    name2= haluk
    Print ==> Jahalukva
         */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write first word");
        String word1 = scn.nextLine();
        System.out.println("Write second word");
        String word2 = scn.next();
        if(word1.length()%2 == 0) {
            int middleIndex =   (int) (word1.length()/2);
            System.out.println(word1.substring(0, middleIndex) + word2 + word1.substring(middleIndex));
        }else {
            System.out.println("word2 cannot be added to word1");
        }

    }
}
