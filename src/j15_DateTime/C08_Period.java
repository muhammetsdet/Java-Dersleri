package j15_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // priod-> iki tarih arasındaki geçen tekrarlana datayı tutar...
        LocalDate bugun = LocalDate.now();
        LocalDate mstfBey = LocalDate.of(1985, 5, 17);

        Period p1 = Period.between(bugun, mstfBey);
        System.out.println("p1 = " + p1);//p1 = P-38Y-5M-23D
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());// -461
        System.out.println("p1.getDays() = " + p1.getDays());// -23
        System.out.println("p1.getYears() = " + p1.getYears());// -38

        System.out.println("   ***   ");

        System.out.println("bugun = " + bugun);//
        Period period6Gun = Period.ofDays(6);// 6 gunde bir tekrar date tanımlandı

        System.out.println("bugun.minus(p1) = " + bugun.minus(p1));// 2062-05-02
        System.out.println("bugun.plus(period6Gun) = " + bugun.plus(period6Gun));//  2023-11-15
        // Task-> 18 eylul 2023 başlayan sdet kursu 11 aylık planlanırsa bitiş tarihini gun sayısını print eden code create ediniz.

        Period periodCw = Period.ofMonths(11);
        LocalDate kursStart = LocalDate.of(2023, 9, 18);
        System.out.println("kurs bitiş tarihi = " + kursStart.plus(periodCw).format(DateTimeFormatter.ISO_LOCAL_DATE)); //kurs bitiş tarihi = 2024-08-18
        // ISO -> International Organization for Standardization

        Period ebikGabık=Period.ofMonths(4).ofDays(33);// 4 ay ve 33 gun de bir tekrarlana period tanımlandı
        System.out.println("bugun.plus(ebikGabık) = " + bugun.plus(ebikGabık));//2023.11.09 + 33 gun =? 2023-12-12

        // ahan da trick-> period tanımında birden çok tarih zaman girildiğinde daima sonuncu parametre derlenir. önceki parmetler ezilir


    }
}
