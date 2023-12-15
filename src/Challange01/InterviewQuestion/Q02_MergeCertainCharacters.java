package Challange01.InterviewQuestion;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Say something...");
        String str = input.nextLine();
        System.out.println("How many time First and last letter to write ");
        int num = input.nextInt();
        System.out.println(FirstLastWrite(str, num));

    }//main sonu

    private static String FirstLastWrite(String str, int num) {
    String output="";
        for (int i = 0; i <num ; i++) {
            //output+=""+str.charAt(0)+str.charAt(str.length()-1);
            output+=str.substring(0,1)+str.substring(str.length()-1);
        }
        return output;
    }

}


//class sonu
