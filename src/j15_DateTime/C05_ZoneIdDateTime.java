package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZoneIdDateTime {
    public static void main(String[] args) {
        // herhangi bir ulke/sehir(local) tarih-zaman datasını tutar
        LocalDate usaDate=LocalDate.now(ZoneId.of("America/Los_Angeles"));//America/Los_Angeles mevcut date atandı
        LocalTime usatime=LocalTime.now(ZoneId.of("America/New_York"));//America/New_York mevcut time atandı

        System.out.println("usaDate = " + usaDate);//2023-11-09
        System.out.println("usatime = " + usatime);//14:04:53.301134

        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("Japan"));
        System.out.println("zdt1 = " + zdt1);//zdt1 = 2023-11-10T04:10:35.563785+09:00[Japan]
        // ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("America"));//RTE->ZoneRulesException
        ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("CET"));
        System.out.println("zdt3 = " + zdt3);// zdt3 = 2023-11-09T20:14:11.603215+01:00[CET]
    }
}
