package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    public static void main(String[] args) {
        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        //List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe"));
        System.out.println("****Task01*****");
        kontrolChar7Az(yemahhh);
        System.out.println(kontrolChar7Az1(yemahhh));
        System.out.println("\n****Task02*****");
        System.out.println(kontrolWBaslamayan(yemahhh));
        System.out.println("\n****Task03*****");
        System.out.println(kontrolXBitEnAz(yemahhh));
        System.out.println("\n****Task04*****");
    }

    // Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.
    public static void kontrolChar7Az(List<String> yemahhh) {
        boolean azMi = yemahhh
                .stream()
                .allMatch((t) -> t.length() <= 7);
        if (azMi) {
            System.out.println("Tum elemanlarin karakteri 7 veya 7'den az");
        } else {
            System.out.println("Tum elemanlarin karakteri 7 veya 7'den az degil");
        }

//        if (yemahhh.stream().allMatch((t)->t.length()<=7)){
//            System.out.println("Tum elemanlarin karakteri 7 veya 7'den az");
//        }else {
//            System.out.println("Tum elemanlarin karakteri 7 veya 7'den az degil");
//        }
    }

    public static String kontrolChar7Az1(List<String> yemahhh) {
        return yemahhh.stream().anyMatch((t) -> t.length() <= 7) ?
                "Tum elemanlarin karakterinin en az biri 7 veya 7'den az" :
                "Tum elemanlarin karakteri 7 veya 7'den az degil";
    }

    // Task02-> List elemanlarinin hicbirinin "W" ile baslamamasını kontrol eden code create ediniz...
    public static String kontrolWBaslamayan(List<String> yemahhh) {
        return yemahhh
                .stream()
                .noneMatch((t) -> t.substring(0, 1).equalsIgnoreCase("w")) ?
                "Menude w ile baslayan bir yemek yok" :
                "Menude W ile baslayan en az bir yemek var";
    }

    // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...
    public static String kontrolXBitEnAz(List<String> yemahhh) {
        return yemahhh.stream().anyMatch(t -> t.endsWith("x")) ?
                "Menude en az bir tane X ile biten yemek var" :
                "Menude en az bir tane X ile biten yemek yok";
    }
}
