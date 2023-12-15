package j08_Loops.Do_WhileLoop.Task;

import java.util.Scanner;

public class Task01 {
      /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

          int toplam = 0;
          int sayi;
          do {
              System.out.println("sayı giriniz : ");
              sayi =input.nextInt();
              toplam+=sayi;
          }while (sayi!=0);

          System.out.println("girilen sayıların toplamı : "+toplam);
      }
}

