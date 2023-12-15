package j10_MethodCreation.Tasks;
import java.util.Scanner;

public class Task12 {
     /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
     static Scanner scn = new Scanner(System.in);
     public static void main(String[] args){

          System.out.println(control());
     }

     private static boolean control() {
          System.out.println("Write your email");
          String email = scn.next();
          if (email.contains("@")&& email.contains(".")&& email.substring(email.length()-11,email.length()-10)!=""){
               return true;

          }else{
               return false;
          }

     }
}
