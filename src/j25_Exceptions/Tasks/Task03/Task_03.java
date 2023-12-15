package j25_Exceptions.Tasks.Task03;

import java.util.Scanner;

public class Task_03 {
    /*
      int v  - int f  isminde 2 adet parametresi olan 'ortalama' isminde bir method create ediniz.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını return edin.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 toplayarak ortalama hesplayan pr create ediniz.
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vize;
        int finl;
        while (true) {
            try {
                System.out.println("agam vize notu giresen : ");
                vize = input.nextInt();
                if (vize < 0 || vize > 100) {//istenmeyen durum kontrolu
                    throw new ArithmeticException("Notlar 0-100 arasında olmalı");

                } else break;
            } catch (Exception e) {
                System.out.println("Agam hatalı giris yapırsen " + e.getMessage());

            }
        }
        while (true) {
            try {
                System.out.println("agam final notu giresen : ");
                finl = input.nextInt();
                if (finl < 0 || finl > 100) {//istenmeyen durum kontrolu
                    throw new ArithmeticException("Notlar 0-100 arasında olmalı");

                } else break;
            } catch (Exception e) {
                System.out.println("Agam hatalı giris yapırsen " + e.getMessage());

            }
        }
        System.out.println("ortalamanız  = " + ortalama(vize, finl));

    }//main sonu

    public static double ortalama(int v, int f) {
        return (v * 0.4) + (f * 0.6);
    }
    }

