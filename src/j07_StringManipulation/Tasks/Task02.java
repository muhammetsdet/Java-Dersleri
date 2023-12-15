package j07_StringManipulation.Tasks;

import java.util.Objects;
import java.util.Scanner;

public class Task02 {
    /*  Task->
 Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
  a)Ilk karakteri buyuk harf olmalı
  b)Son karakteri sayi olamlı
,  c)en az 6 karakter uzunlugunda olmalı

*/
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your password");
        String password = scn.next();
        if (Character.isUpperCase(password.charAt(0)) && Character.isDigit(password.charAt(password.length() - 1)) && (password.length() > 6)) {
            System.out.println("Your password is " + password);
        }else {
            System.out.println("enter the password as required");

        }
    }
}
