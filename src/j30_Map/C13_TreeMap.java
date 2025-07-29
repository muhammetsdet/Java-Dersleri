package j30_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
              /*
        TreeMap->Mudur sırası (Doğal sıralama yapar null doğal olmadığı için hata verir.)
        1-TreeMap key'lerde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */


        TreeMap<Integer, String> tm = new TreeMap<>(); //bos tremap tanımlandı
        tm.put(104, "falan filan");
        tm.put(102, "ebik gabık");
        tm.put(101, "ıkır zıkır");
        tm.put(103, "vıddıdı vıddıdı");
        // tm.put( null, "vıddıdı vıddıdı");// RTE->NullPointerException
        tm.put(102, "nörüyong nişleding"); //key dubilcate değil key value update edildi


        System.out.println("tm = " + tm); //  {101=ıkır zıkır, 102=nörüyong nişleding, 103=vıddıdı vıddıdı, 104=falan filan}

        System.out.println("   ***   ");
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm);//

        TreeMap<String, String> tm1 = new TreeMap<>(hm); //bos tremap'3 hashMap parametre atandı
        System.out.println("tm1 hm convert sonrası  = " + tm1);
        //  TreeMap<String, String> tm2 =hm; // CTE-> dataTYpe MissMatch HashMap ile TreeMap eşleşmez.
        //map.cilingKey();-> girilen key map'de varsa return eder yoksa parametre girilen keyden buyuk en kucuk key return eder
        //map.cilingKey();-> en kucuk abi-abla(en yakın buyuk) varsa return eder yoksa null atar
        System.out.println("tm = " + tm);//
        System.out.println("tm.ceilingKey(99) = " + tm.ceilingKey(99));//101
        System.out.println("tm.ceilingKey(102) = " + tm.ceilingKey(102));//102
        System.out.println("tm.ceilingKey(111) = " + tm.ceilingKey(111));//null
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));//101

        System.out.println("tm.floorKey(99) = " + tm.floorKey(99));//null
        System.out.println("tm.floorKey(102) = " + tm.floorKey(102));//102
        System.out.println("tm.floorKey(105) = " + tm.floorKey(105));//104
        System.out.println("tm.floorKey(1) = " + tm.floorKey(1));//null
        //map.floorKey();-> girilen key map'de varsa return eder yoksa parametre girilen keyden kucuk en buyuk key return eder
        //map.floorKey();-> en buyuk kardes(en yakın kardes) varsa return eder yoksa null atar

        // descendingKeySet()->azalan sıralama
        // ascendingKeySet()->artan sıralama :NT->kck->byk
        System.out.println("tm descendingKeySet oncesi= " + tm);//{101=ıkır zıkır, 102=nörüyong nişleding, 103=vıddıdı vıddıdı, 104=falan filan}
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm descendingKeySet onrası= " + tm);//
        System.out.println("tm.firstKey() = " + tm.firstKey());//
        System.out.println("tm.lastKey() = " + tm.lastKey());//



    }
}
