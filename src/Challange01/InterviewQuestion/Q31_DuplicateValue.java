package Challange01.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q31_DuplicateValue {
       /* Task->
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Girilen bir string için tekrarlanan karakterleri print eden code create ediniz.
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Say something...");
        String str = input.nextLine();
        List<Character> letters = new ArrayList<>();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !letters.contains(arr[j])) {
                    letters.add(arr[j]);
                }
            }
        }
        String str1[] = new String[letters.size()];
        for (int i = 0; i < letters.size(); i++) {
            str1[i] = String.valueOf(letters.get(i));

        }
        System.out.println(Arrays.toString(str1));
    }

}


