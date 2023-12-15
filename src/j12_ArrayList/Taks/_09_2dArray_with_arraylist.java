package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */
public class _09_2dArray_with_arraylist {
    public static void main(String[] args) {
int arr2d[][]={ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
ArrayList<Integer> list2d = new ArrayList<>();
        for (int i = 0; i <arr2d.length ; i++) {
            for (int j = 0; j <arr2d[i].length ; j++) {
                list2d.add(arr2d[i][j]);
            }
        }
        System.out.println(list2d);
    }
}
