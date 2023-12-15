package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını kontrol edip print eden code create ediniz..with for-each
        String arr1[] = {"Abdullah", "Ferhat", "Sennur", "Sahin", "Ayse", "Can", "Burak" };
        String arr2[] = {"Sebnem", "Haluk", "Merve", "Sennur", "Ayse", "javaCAN", "javaSU" };
        ArrayList<String > ortakIsimList=new ArrayList<>();//ortak isimlerin eklenecagi boş list tanımlandı

        for (String avuc1:arr1 ) {// abdullahgiller
            for (String avuc2:arr2 ) {//sebnemgiller
                if (avuc1.equals(avuc2)){//
                    //  ortakIsimList.add(avuc1);
                    ortakIsimList.add(avuc2);
                }
            }
        }
        System.out.println("ortakIsimList = " + ortakIsimList);

    }
}
