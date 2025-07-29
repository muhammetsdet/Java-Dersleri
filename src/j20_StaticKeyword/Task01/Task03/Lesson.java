package j20_StaticKeyword.Task01.Task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson {
     /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
     String lessonName;
    int lessonCredit;

    public Lesson() {
    }

    public Lesson(String lessonName, int lessonCredit) {
        this.lessonName = lessonName;
        this.lessonCredit = lessonCredit;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", lessonCredit=" + lessonCredit +
                '}';
    }
}
