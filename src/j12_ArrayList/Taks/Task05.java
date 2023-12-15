package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
  Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
*/
public class Task05 {
    public static void main(String[] args) {
        String isimArr[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
        harfSiralıisimList(isimArr);// [Ali, Ayse, Can, Hasan, Suzan, Veli]
        System.out.println(harfSiralıisimList1(isimArr));//[Ali, Ayse, Can, Hasan, Suzan, Veli]

    }//main sonu

    private static void harfSiralıisimList(String[][] arr) {
        ArrayList<String> isimListi = new ArrayList<>();//array elemanların atanacagı boş list tanımlandı
        for (int i = 0; i < arr.length; i++) {//kat loop
            for (int j = 0; j < arr[i].length; j++) {//daire loop
                isimListi.add(arr[i][j]);

            }
        }
        Collections.sort(isimListi);
        System.out.println(isimListi);
    }

    private static  List<String> harfSiralıisimList1(String[][] arr) {
        List<String> isimListi = new ArrayList<>();//array elemanların atanacagı boş list tanımlandı

        for (int i = 0; i < arr.length; i++) {//kat loop
            for (int j = 0; j < arr[i].length; j++) {//daire loop
                isimListi.add(arr[i][j]);

            }
        }
        Collections.sort(isimListi);

        return isimListi;
    }
    }

