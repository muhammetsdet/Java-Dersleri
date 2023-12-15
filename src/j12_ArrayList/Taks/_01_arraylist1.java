package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   ismi getCount() olan bir method oluşturun.
   Parametre olarak bir String ArayList  ve  bir tane String

   Return tipi int olmalı.

   ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
   Örneğin;
   ArrayList = Orange , Kiwi , Peach , Banana , Orange
   String Orange:
   Count = 2 olmalı. (Orange 2 kez yazılmış)
    */
public class _01_arraylist1 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        String aloneFruit = "Orange";
        System.out.println("Orange tekrar sayısı: "+getCount(fruits, aloneFruit));

    }

    public static int getCount(List<String> fruits, String aloneFruit) {
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(aloneFruit)) {
                count++;
            }

        }
        return count;
    }


    }
