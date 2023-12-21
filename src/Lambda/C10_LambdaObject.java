package Lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C10_LambdaObject {
    /*
      TASK :
      fields --> Universite (String)
                 bolum (String)
                 ogrcSayisi (int)
                 notOrt (int)
                 olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
       */
    public static void main(String[] args) {
        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "Ucak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi muh.", 216, 55);

        List<C10_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("****Task 01*****");
        System.out.println(kontrolNotOrt74Byk(unv));
        System.out.println("****Task 02*****");
        System.out.println(kontrolOgrSayisi110Byk(unv));
        System.out.println("****Task 03*****");
        System.out.println(kontrolBolumMat(unv));
        System.out.println("****Task 04*****");
        System.out.println(printOgrSayisiTersSira(unv));
        System.out.println("****Task 05*****");
        System.out.println(printNotOrtTersSiraIlk3(unv));
        System.out.println("****Task 06*****");
        System.out.println(printOgrSayisiEnAz2(unv));
        System.out.println("****Task 07*****");
        System.out.println(printNotOrt63BykOgrSayisiToplam(unv));
        System.out.println("****Task 08*****");
        System.out.println(printOgrSayisi333BykNotOrtOrtalamasi(unv));
        System.out.println("****Task 09*****");
        System.out.println(printMatBolSayisi(unv));
        System.out.println("****Task 10*****");
        System.out.println(printOgrSayisi571BykMaxNotOrt(unv));
        System.out.println("****Task 11*****");
        System.out.println(printOgrSayisi1071KckMinNotOrt(unv));

    }

    // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
    public static String kontrolNotOrt74Byk(List<C10_University> unv) {
        return unv.stream().allMatch(t -> t.getNotOrt() > 74) ?
                "Uni not ortalamasi 74'den buyuk" :
                "Uni not ortalamasi 74'den buyuk degil";
    }

    //task02->ogrc sayilarinin hicbirinin 110 den az olmadigini  kontrol eden code create ediniz.
    public static String kontrolOgrSayisi110Byk(List<C10_University> unv) {
        return unv.stream().noneMatch(t -> t.getOgrcSayisi() <= 110) ?
                "Uni ogrenci sayisi 110'dan buyuk" :
                "Uni ogrenci sayisi 110'den buyuk degil";
    }

    //task03->universite'lerde herhangi birinde "matematik" bolumu olup olmadigini  kontrol eden code create ediniz.
    public static String kontrolBolumMat(List<C10_University> unv) {
        return unv.stream().anyMatch(t -> t.getBolum().contains("Mat")) ?
                "Uni en az birinde matematik bolumu var" :
                "Uni hicbirinde matematik bolumu yok";
    }

    //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<C10_University> printOgrSayisiTersSira(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed())
                .collect(Collectors.toList());
    }

    //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...
    public static List<C10_University> printNotOrtTersSiraIlk3(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
    public static List<C10_University> printOgrSayisiEnAz2(List<C10_University> unv) {
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
    }

    //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
    public static int printNotOrt63BykOgrSayisiToplam(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t -> t.getNotOrt() > 63)
                .mapToInt(C10_University::getOgrcSayisi)
                .sum();
    }

    //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
    public static OptionalDouble printOgrSayisi333BykNotOrtOrtalamasi(List<C10_University> unv) {
        return unv
                .stream()
                .filter(t -> t.getOgrcSayisi() > 333)
                //.mapToDouble(t->t.getNotOrt())
                .mapToDouble(C10_University::getNotOrt)
                .average();
    }

    //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...
    public static long printMatBolSayisi(List<C10_University> unv){
        return  unv
                .stream()
                //.filter(t->t.getBolum().equalsIgnoreCase("Matematik"))
                .filter(t->t.getBolum().contains("Mat"))
                .count();
    }

    //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
    public static OptionalInt printOgrSayisi571BykMaxNotOrt(List<C10_University> unv){
        return unv
                .stream()
                .filter(t->t.getOgrcSayisi()>571)
                .mapToInt(C10_University::getNotOrt)
                .max();
    }

    //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
    public static OptionalInt printOgrSayisi1071KckMinNotOrt(List<C10_University> unv){
        return unv
                .stream()
                .filter(t->t.getOgrcSayisi()<1071)
                .mapToInt(C10_University::getNotOrt)
                .min();
    }
}
