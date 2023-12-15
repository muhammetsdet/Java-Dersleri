package j09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
          /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
    */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("mailinizi giriniz : ");
        String mail = input.nextLine();

        String yeniMail = "";// bos kutu

        for (int i = 0; i < mail.length(); i++) {//mail chae sayısı kadar tekrar tanımlandı

            if (mail.charAt(i) == ' ') {// tekraradan gelen her bir mail charının '  ' eşt olma sartı
                continue;//if sartını saglayan döngü tekrar atlanır sonrakı dönfü tekrardan devam eder
            }
            yeniMail += mail.charAt(i);
        }
        System.out.println("yeniMail = " + yeniMail);//
    }
}
