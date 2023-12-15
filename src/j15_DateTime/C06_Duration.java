package j15_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(0,23);
        LocalTime gunduz=LocalTime.of(13,45);
        Duration fark1=Duration.between(gece,gunduz);
        Duration fark2=Duration.between(gunduz,gece);
        System.out.println("fark2 = " + fark2);// PT-13H-22M
        System.out.println("fark1 = " + fark1);// PT13H22M
        System.out.println("fark2.getSeconds() = " + fark2.getSeconds());//-48120

    }
}
