package j15_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)
        LocalTime suAn = LocalTime.now();// sistemden mevcut zaman(saat-dakika-saniye-nanosaniye) datası suAn'e atandı
        // Trick-> LocalTimee variable için new keyword kullanılmaz

        System.out.println("suAn = " + suAn);// suAn = 20:55:01.605391
        System.out.println("suAn.getNano() = " + suAn.getNano());// 23139000
        System.out.println("suAn.getSecond() = " + suAn.getSecond());//56
        System.out.println("suAn.getHour() = " + suAn.getHour());//20
        System.out.println("suAn.getMinute() = " + suAn.getMinute());// 59

        LocalTime şincik = LocalTime.of(9, 43, 21, 1905);
        LocalTime lt1 = LocalTime.of(9, 43);
        LocalTime lt2 = LocalTime.of(19, 05, 24);

        // tanımlanan herhangi time'ın çncesine->minus(), sonrasına-> plus() mrth ile gidilir
        System.out.println(suAn.minusHours(33).plusMinutes(99));//13:42:43.780394

        LocalTime loopStart = LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano());
        int toplam = 0;
        for (int i = 0; i < 10000; i++) {
            toplam += i;
        }
        LocalTime loopFnish = LocalTime.now();
        System.out.println("loopFnish.getNano() = " + loopFnish.getNano());
        System.out.println("loop run hızı : " + (loopFnish.getNano() - loopStart.getNano()));//

    }
}
