package j15_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate falanGun = bugun.plusDays(33);
        LocalDate feşmekanGun = falanGun.minusDays(66);
        LocalDate mstfBey = LocalDate.of(1985, 5, 17);
        System.out.println("bugun = " + bugun);// bugun = 2023-11-09
        System.out.println("falanGun = " + falanGun);// falanGun = 2023-12-12
        System.out.println("feşmekanGun = " + feşmekanGun);// feşmekanGun = 2023-10-07
        System.out.println("mstfBey = " + mstfBey);// mstfBey = 1985-05-17


        System.out.println("falanGun.isLeapYear() = " + falanGun.isLeapYear());// false
        System.out.println("falanGun.isAfter(mstfBey) = " + falanGun.isAfter(mstfBey));//true
        System.out.println("mstfBey.isBefore(feşmekanGun) = " + mstfBey.isBefore(feşmekanGun));// true

        System.out.println("   ***   ");

        System.out.println("bugun.compareTo(mstfBey) = " + bugun.compareTo(mstfBey));// 38 -> yıl
        System.out.println("falanGun.compareTo(falanGun) = " + falanGun.compareTo(falanGun));// 0
        System.out.println("feşmekanGun.compareTo(falanGun) = " + feşmekanGun.compareTo(falanGun));// -2

  /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */
    }
    }



