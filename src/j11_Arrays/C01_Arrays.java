package j11_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

    //Array declaration
    public static void main(String[] args) {


        //Array declaration
        int a;// -> declare edilen ancak assaignment edilmeyen primitive ilkel veriable
        int arr[];//-> declare edilen ancak assaignment edilmeyen non-primitive int data type array
        // Trick-> tanımlanan ancak atanmayan bir array herhangi bir action'a alınırsa CTE verir.

        String[] isimArr = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur","Recep"};//-> hem decleration hem de assaignmnet edilen String data type array tanımlandı

        int sayiArr[] = new int[5];// eleman sayısı declare edilmiş boş int data type array
        int sayiArr1[] = new int[7];// eleman sayısı declare edilmiş boş int data type array

        // Array'e eleman girişi->update
        sayiArr[3] = 61;//3. index eleman 61 olarak update edildi
        sayiArr[4] = 54;
        sayiArr[0] = 42;
        sayiArr[3] = 54;// 3. index eleman 61 iken 54 olarak update edildi:array elemanları unique(benzersiz) olmak zorunda değil
        // Array eleman  sayısı-> length
        System.out.println("isimArr.length = " + isimArr.length);//isimArr.length = 6
        System.out.println("sayiArr.length = " + sayiArr.length);//sayiArr.length = 5
        //Array print etme...
        System.out.println("sayiArr = " + sayiArr);//[I@6b2fad11
        System.out.println("isimArr = " + isimArr);//[Ljava.lang.String;@73f792cf
        /*
        sout(arr)-> Array non-primitive(referative data)oldg için (obj) refens değeri print eder..
        Arrays.toString(arr) ile array elamaları print edilir....--> best practice
         */
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));// [Muhammed, Sebnem, Musa, Ayse, Sennur, Recep]
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));//[42, 0, 0, 54, 54]
        System.out.println("sayiArr = " + sayiArr);//[I@6b2fad11
        System.out.println("isimArr = " + isimArr);//[Ljava.lang.String;@73f792cf
        // System.out.println("Arrays.toString(Arr) = " + Arrays.toString(arr));//CTE atanmayan array action alamaz
        System.out.println("Arrays.toString(sayiArr1) = " + Arrays.toString(sayiArr1));//[0, 0, 0, 0, 0, 0, 0]

        // Array son index eleman  -> arr[arr.length-1]
        System.out.println("son index eleman  = " + sayiArr[sayiArr.length - 1]);//54
        // Array ilk index eleman -> arr[0]
        System.out.println("ilk index eleman " + sayiArr[0]);//42

        // Array olmayan index eleman

        //  System.out.println("sayiArr[99] = " + sayiArr[99]);//RTE->ArrayIndexOutOfBoundsException

        // Array elemanları print etme -> bad practice


        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));// [Muhammed, Sebnem, Musa, Ayse, Sennur, Recep]

        for (int i = 0; i<isimArr.length;i++){// arr eleman sayısıs kadar tekrar tanımlandı
            System.out.print(isimArr[i]+" ");// tekrardan alınan  herbir arr elemanı print edildi
        }
        System.out.println();
//Array eleman natural ordering (doğal sıralama ->aphabetic a-z n numeric ascending k-b
        System.out.println("sortingen öncesi arr -->" +Arrays.toString(isimArr));
        Arrays.sort(isimArr);// Arr NO yapıldı
        System.out.println("sortingen sonrası arr -->" +Arrays.toString(isimArr));

        System.out.println("sortingen öncesi arr -->" +Arrays.toString(sayiArr));
        Arrays.sort(sayiArr);// Arr NO yapıldı
        System.out.println("sortingen sonrası arr -->" +Arrays.toString(sayiArr));

    }
}
