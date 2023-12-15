package j28_Iterators.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {

        /*
        task -> Verilen bir integer listin tek  elemanlarının karesini tersten iterator  print eden code create ediniz
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {//pointer son eleman sonuna konumladıran iterator tanımlandı

            it.next();

        }
        while (it.hasPrevious()) {//
            int a=it.previous();
            if (a % 2 == 1) {//iteratorden alınanher bir eleman tek sartı
                it.set(a * a);
            }else it.remove();//if sartı saglamayan herbir iterator elamanı silindi

        }
        System.out.println("list = " + list);// [625, 2209, 4761, 2025]
    }
}
