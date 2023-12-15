package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

/*
       common_values() isminde bir method oluşturun.
       Parametre olarak 2 tane Integer ArrayList
       Return tipi integer ArrayList olmalı
        İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
       Örneğin;
       ArrayList 1:    3 , 2 , 5 , 6
       ArrayList 2:     5 , 8 , 9
       return  5 olmalı
       Örneğin;
       ArrayList 1: 8,7,9,6,7
       ArrayList 2: 6,7,12,3,1
       return 6 ve 7 olmalı
    */
public class _07_arraylist7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1=new ArrayList<>(Arrays.asList(  8,7,9,6,7));
        ArrayList<Integer> numbers2=new ArrayList<>(Arrays.asList(  6,7,12,3,1));

        System.out.println(common_values(numbers1,numbers2));
    }
    private static ArrayList<Integer> common_values(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2) {
        ArrayList<Integer> common=new ArrayList<>();
        for (Integer num:numbers1) {
            if (numbers2.contains(num)&&!common.contains(num)) {
               common.add(num);
            }
        }
      return common;
    }
}
