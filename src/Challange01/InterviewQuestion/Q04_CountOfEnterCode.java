package Challange01.InterviewQuestion;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";
        int girilenHak=3;
        while (true){
            System.out.println("Pin kodunu gir");
            String kPin=input.nextLine();
            if (pin.equals(kPin)){
                System.out.println("Pin doğru");
                break;
            }else {
                System.out.println("Hatalı pin giridniz");
                girilenHak--;
                System.out.println("Kalan Hak: " + girilenHak);
            }
            if (girilenHak==0){
                System.out.println("tel kapandi");
                break;
            }
        }

    }

}
