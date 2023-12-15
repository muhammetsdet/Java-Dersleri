package j25_Exceptions.Tasks.Task01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
/*
  Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele password giresen : ");
        String password = input.nextLine();
        try {
            if (password.length() < 6 || password.length() > 10) {//pass istenmeyen durum kontrolu
                throw new IllegalArgumentException("Agam pass'ın 6'dan az10'da coğğğ :( ");
            }else System.out.println("Agam pass basarılı selametleee");


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Agam tekrar giresen ");

            System.out.println("Agam bu cıktıyı okuduysan TRY excp fırlattı catch'de handle edildi");
        }

        System.out.println("Agam bu cıktıyı okuduysan app. gayet başarılı run edildi dewamkeee Ç:) ");

    }
}
