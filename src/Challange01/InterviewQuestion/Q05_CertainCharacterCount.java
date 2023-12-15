package Challange01.InterviewQuestion;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Say something...");
        String str =input.nextLine();
        System.out.println("Hangi harfi istiyorsunu,,,");
        char ch =input.next().charAt(0);//inputta nextChar yok o yüzden bu şekikde oluyor. Contains char almaz
int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Girdiğinir cümlede " +ch+ " harfi "+ count+ " kere kullanılmiş");
    }
}
