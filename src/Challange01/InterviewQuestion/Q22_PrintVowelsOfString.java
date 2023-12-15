package Challange01.InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Say something...");
        String words = input.nextLine().toLowerCase();

        String vowelArr[] = {"a", "e", "i", "o", "u"};
        String newWords[] = words.split("");

        for (int i = 0; i < newWords.length; i++) {
            for (int j = 0; j < vowelArr.length; j++) {
                if (newWords[i].equals(vowelArr[j])) {
                    System.out.print(newWords[i] + " ");
                    break;
                }
            }
        }
        System.out.println("***cincix code****");
        System.out.println(words.replaceAll("[^aeiouz]",""));
        System.out.println(words.replaceAll("[aeiou]",""));
    }

}
