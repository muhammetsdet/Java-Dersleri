package j11_Arrays;

import java.util.Arrays;

/*
Çok Boyutlu Diziler
  Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
   Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
   formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
   matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
   satır ve sütun sayısını girmemiz yeterli olacaktır.
  * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
  Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

* 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
*  icerdeki  array'lere  inner->Daire array denir
* 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
*  Array'i ancak tum elemenlari atanarak declare edilmeli
* 3- Multi dimensional array'de bir elemanin indexi icin
*  en distaki array haric, elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
*/
public class C07_MdArrays {
    public static void main(String[] args) {
        int arr1[][]=new int[1][3];
        arr1[0][0]=13;
        arr1[0][2]=12;
        System.out.println(Arrays.deepToString(arr1));

    }
}
