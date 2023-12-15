package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
        LocalDate bugun=LocalDate.now();// sistemden mevcut tarih(gun-ay-yıl) datası bugun'e atandı
        // Trick-> LocalDate variable için new keyword kullanılmaz
        System.out.println("bugun = " + bugun);//bugun = 2023-11-09
        System.out.println("bugun.getYear() = " + bugun.getYear());//2023
        System.out.println("bugun.getMonth() = " + bugun.getMonth());//NOVEMBER
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());// 9
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());//313
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());//THURSDAY
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());// 11

        System.out.println("   ***   ");

        LocalDate falanTarih=LocalDate.of(1974,8,23);
        LocalDate filanTarih=LocalDate.of(1974, Month.AUGUST,23);
        // tanımlanan bir date'in öncesi -> minus() ,sonrasına -> plus() ile gidilir.
        System.out.println(falanTarih.minusYears(34).plusMonths(34).plusDays(99));// 1943-09-30


    }
}
