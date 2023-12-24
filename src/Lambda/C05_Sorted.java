package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    /*
 Sorted:
 Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
         2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
 İkinci formatı ise Comparator arayüzünden türediği için
 bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.

  */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 12, 15, 2, 5, 6, 3, 89, 43, 34, 22, 58, 50, 71, 35));
        System.out.println("****Task01*****");
        printCiftKareKbSira(sayiList);
        System.out.println("\n****Task02*****");
        printtekKareBkSira(sayiList);
        System.out.println("\n****Task03*****");

        System.out.println("\n****Task04*****");

    }

    // Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz
    public static void printCiftKareKbSira(List<Integer> sayiList) {
        sayiList
                .stream()// list elemanları akışa alındı
                .filter(SeedMethods::ciftMi)//akışdaki list çift elelmanları filtrelendi
                .map(SeedMethods::kareAl)//alışdaki filtrelene çift elemanlar karesine update edildi
                .sorted()//akışdaki karesine update edilen çift elemanlar naturel order yapıldı
                .forEach(SeedMethods::intPrint);//elemalar print edildi

        /*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */
    }

    // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz
    public static void printtekKareBkSira(List<Integer> sayiList) {
        sayiList
                .stream()// list elemanları akışa alındı
                .filter(SeedMethods::tekMi)//akışdaki list çift elelmanları filtrelendi
                .map(SeedMethods::kareAl)//alışdaki filtrelene çift elemanlar karesine update edildi
                .sorted(Comparator.reverseOrder())//akışdaki karesine update edilen çift elemanlar naturel order yapıldı
                .forEach(SeedMethods::intPrint);//elemalar print edildi

    }

}

