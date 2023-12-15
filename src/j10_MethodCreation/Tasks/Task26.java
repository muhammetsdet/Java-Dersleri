package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26 {
    // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
    // input-> javacanlara selam olsun
    // output-> javcnlr semou
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        repeat();
        again();

    }

    private static void again() {
        System.out.println("Repeat after me...");
        String sentence = input.nextLine();
        String output ="";
        int sayac=0;
        for (int i = 0; i <sentence.length() ; i++) {
            sayac=0;
            for (int j = 0; j < sentence.length(); j++) {
               if (sentence.charAt(i)==sentence.charAt(j) ){
                   sayac++;
               }
            }
            if (!output.contains(sentence.substring(i,i+1))){
                output += sentence.substring(i,i+1) + sayac;
            }
        }
        System.out.println("output: " +  output);
        System.out.println("***************");
    }

    private static void repeat() {
        System.out.println("Say something...");
        String words = input.nextLine();
        String newWords = words.replaceAll("\\W", "").toLowerCase();
        String uniqueChar = "";
        for (int i = 0; i < newWords.length(); i++) {
         if(!(uniqueChar.contains(newWords.substring(i,i+1)))) {
                uniqueChar += newWords.substring(i,i+1);
            }
            }
        System.out.println(uniqueChar);
            }

        }




