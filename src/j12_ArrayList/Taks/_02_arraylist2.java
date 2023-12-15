package j12_ArrayList.Taks;
 /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist =
        return 15 olmalı
         */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {
    public static void main(String[] args) {
        List<Integer> listNum=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(getSum(listNum));
    }

    private static int getSum(List<Integer> listNum) {
        int sum=0;
        for (int i = 0; i <listNum.size() ; i++) {
            sum+=listNum.get(i);
        }
        return sum;
    }

}
