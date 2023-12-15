package Challange01.InterviewQuestion;

public class Q26_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı)  print eden   METHOD create ediniz..

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */


    public static void main(String[] args) {
        // String str = "AAABBCDD";
        String str = "ey edip adanada pide ye";
        printFrequency(str);
    }

    public static void printFrequency(String str) {
        String newStr[] = str.replaceAll(" ", "").split("");
        String words = "";

        for (int i = 0; i < newStr.length; i++) {
            int count = 0;
            for (int j = 0; j < newStr.length; j++) {
                if (newStr[i].equals(newStr[j])) {
                    count++;
                }
            }

            if (!words.contains(newStr[i])) {
                words += "" + newStr[i] + count;
            }
        }

        System.out.println(words);
    }
}
