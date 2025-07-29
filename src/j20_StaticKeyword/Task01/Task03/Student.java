package j20_StaticKeyword.Task01.Task03;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi;

    public Student() {
    }

    public Student(String name, int ogrNo) {
        this.name = name;
        this.maxCredit = maxCredit;
    }

    public int toplamKredisi() {
        int toplamKredi = 0;
        for (Lesson les : dersListesi) {
            toplamKredi += les.lessonCredit;
        }
        return toplamKredi;
    }
}
