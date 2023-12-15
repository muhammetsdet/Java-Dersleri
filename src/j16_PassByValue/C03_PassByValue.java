package j16_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {    public static void main(String[] args) {
                     /*
        java non-primitive(Class array list-> referans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
    // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
    //      update edip print eden METHOD create ediniz.
    //1. method-> with for each 2. method-> set(index,value)
    ArrayList<Integer> sayiLst = new ArrayList<>(List.of(24, 20, 87));
    System.out.println("update öncesi sayiList : " + sayiLst); //[24, 20, 87]
    listUpdate1(sayiLst); //[45, 41, 108]
    listUpdate2(sayiLst); //[45, 41, 108]
    System.out.println("update sonrası sayiList : " + sayiLst); //[45, 41, 108]
}//main sonu

    private static void listUpdate2(ArrayList<Integer> sayiLst) {
        for (Integer avuc : sayiLst) {
            avuc += 33;
        }
        System.out.println("listUpdate2 meth run edildi :"+sayiLst);
    }
    private static void listUpdate1(ArrayList<Integer> sayiLst) {
        for (int i = 0; i < sayiLst.size(); i++) {
            sayiLst.set(i,sayiLst.get(i)+21);
        }
        System.out.println("listUpdate1 meth run edildi :"+sayiLst);
    }
}
