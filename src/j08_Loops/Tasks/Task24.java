package j08_Loops.Tasks;

import java.util.Scanner;

public class Task24 {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */
    public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
        System.out.println("Say something...");
        String words = scn.nextLine();
        String opposite = "";
        for (int i = words.length()-1 ; i >=0 ; i--) {
            opposite+=words.charAt(i);

        }
        System.out.println(opposite);
    }


}
