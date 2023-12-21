package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    /*
   Distinct:
   Stream içerisinde bulunan ve tekrar eden elemanlar varsa
    bunları distinct metodu ile çıkartabilir ve
   elimizde tekrar etmeyen birbirinden farklı
   elemanlar barından bir veri setimiz kalır
    */
    public static void main(String[] args) {
        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("****Task01*****");
        printBykAlfSiraTekrarsiz(yemahhh);
        System.out.println("\n****Task02*****");
        printCharSayisiTersSiraTekrarsiz(yemahhh);
        System.out.println("\n****Task03*****");
        printCharSayisiSiraTekrarsiz(yemahhh);
        System.out.println("\n****Task04*****");
        printSonCharTersSiraTekrarsiz(yemahhh);

    }

    //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...
    public static void printBykAlfSiraTekrarsiz(List<String> yemahhh) {
        yemahhh
                .stream()
                .distinct()
                .map(String::toUpperCase)
                .sorted()
                .forEach(SeedMethods::stringPrint);

        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir.
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
    }

    // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.
    public static void printCharSayisiTersSiraTekrarsiz(List<String> yemahhh) {
        yemahhh
                .stream()
                .distinct()
                .map(String::length)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(SeedMethods::intPrint);
    }

    // Task03-> : list elemanlarinin character sayisini  k->b sıralı benzersiz print eden code create ediniz.
    public static void printCharSayisiSiraTekrarsiz(List<String> yemahhh) {
        yemahhh
                .stream()
                .distinct()
                .map(String::length)
                .distinct()
                .sorted()
                .forEach(SeedMethods::intPrint);
    }

    // Task04-> : list elemanlarini son characterine göre ters sıralı tekrarsız print eden code create ediniz.
    public static void printSonCharTersSiraTekrarsiz(List<String> yemahhh) {
        yemahhh
                .stream()
                .sorted(Comparator.comparing((t)->t.toString().charAt(t.toString().length()-1)).reversed())
                .distinct()
                .forEach(SeedMethods::stringPrint);

        /*
sorted(Comparator.comparing(str -> str.charAt(str.length() - 1), Comparator.reverseOrder())
sorted((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)))
 */
    }
    // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini   b->k sirali tekrarsiz print eden code create ediniz...
}
