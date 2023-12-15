package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime -> yıl-ay-gun-saat-dakika-saniye datalarını tutar

        LocalDateTime ldt =LocalDateTime.now();// sistemden mevcut yıl-ay-gun-saat-dakika-saniye datalarını ldt'ye atandı
        System.out.println("ldt = " + ldt);//2023-11-09T21:15:13.894671
        System.out.println("ldt.getSecond() = " + ldt.getSecond());//13
        System.out.println("ldt.getDayOfYear() = " + ldt.getDayOfYear());// 313
        System.out.println("ldt.getMonthValue() = " + ldt.getMonth());//NOVEMBER

        LocalDate ld = LocalDate.of(1905,2,13);
        LocalTime lt=LocalTime.of(17,55,3);

        LocalDateTime ldt1=LocalDateTime.of(ld,lt);
        System.out.println("ldt1 = " + ldt1);//ldt1 = 1905-02-13T17:55:03
        LocalDateTime ldt3=  ldt1.minusMonths(15).minusMinutes(100).plusDays(33).plusHours(1).minusSeconds(1905);

        System.out.println("ldt3 = " + ldt3);// 1903-12-16T16:43:18
        System.out.println("ldt3.minusSeconds(1000).plusYears(23) = " + ldt3.minusSeconds(1000).plusYears(23));//
        System.out.println("ldt3 = " + ldt3);// 1903-12-16T16:43:18
        // Local Date time variable atama yapılmazsa değişmediği için immutable 'dır


    }
}
