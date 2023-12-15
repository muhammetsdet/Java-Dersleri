package j28_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Trileçe", "KazanDibi", "HavucDilimi", "CennetÇamuru", "Künefix", "Bal-Gaymahhh", "Kerebiç"));
        System.out.println("l1 ilk hali  = " + l1);

        System.out.println("   ***   task01   ***   ");
        // Task01-> l1 elemanlarını  sondan başa dogru print eden code create ediniz.
        ListIterator<String> it1 = l1.listIterator();// 1. step
        while (it1.hasNext()) {// 2. step-> cursor son eleman sonuna konumlandıran iterator
            it1.next();
        }
        while (it1.hasPrevious()) {//son eleman sonrasındakı cursor  geriye doğru iterator tanımlandı
            System.out.print(it1.previous() + " ");// 2. step ana action
        }
        System.out.println();
        System.out.println("   ***   task02   ***   ");
        // Task02-> l1son elemanını :-) ile update edip print eden code create ediniz.
        ListIterator<String> it2 = l1.listIterator();
        String sonEleman = null;
        while (it2.hasNext()) {// 2. step-> cursor son eleman sonuna konumlandıran iterator
            it2.next();
            if (it2.hasNext() == false) {//artık cursor sonda -> cunku sonrasında elaman yok false
                it2.previous();//cursor sondaki elemanı return eder.
                it2.set(it2.next() + " ;-)");// iteratorda return edilen son elaman ;-) ile set edildi
            }
        }

        System.out.println("l1 update sonrası :  " + l1);//

    }
}
