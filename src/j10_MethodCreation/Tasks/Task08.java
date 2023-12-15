package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task08 {
     /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz
   input: 2023
   output:false
    */
     public static void main(String[] args) {

    /*
    Task->   girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.

   input: 2023
   output:false
    */
          Scanner input = new Scanner(System.in);
          System.out.println("yılınızı  giriniz : ");
          int yil = input.nextInt();
          System.out.println(leapYearControl1(yil));//
          System.out.println(leapYearControl2(yil));//
          System.out.println(leapYearControl2(2040));// true
          System.out.println(leapYearControl1(2040));// true
     }//main sonu

     private static String leapYearControl1(int year) {
          return    (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)?"true":"false";
     }
     private static boolean leapYearControl2(int year) {
          return      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)?true:false;

     }
}
