package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task09 {
    /*  TASK :
            StringMethods:
            girilen  bir strngin ilk yarisini print eden code create ediniz
            ORNEK:
             INPUT :istanbul
            OUTPUT :ista

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Say something...");
        String input = scn.nextLine();
        if(input.length()/2 !=0){
            System.out.println(input.substring(0, input.length() / 2));
        }else{
            System.out.println("Write something with an even number of characters");
        }

    }
}
