package j30_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        //map.putIfAbsent(); -> Girilen key map'de yok ise entry(key,value) map'e eklenir ve null return eder.
        //Girilen key map'de var ise key'e ait value return eder
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm putIfAbsent öncesi = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.putIfAbsent(\"Amazon\",\"javaZAM\") = " + hm.putIfAbsent("Amazon", "javaZAM"));//
        System.out.println("hm.putIfAbsent(\"olmayanKey\",\"AgayaBeles\") = " + hm.putIfAbsent("olmayanKey", "AgayaBeles"));//
        System.out.println("hm putIfAbsent sonrası  = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, olmayanKey=AgayaBeles, Vatan=111 Euro}


    }
}
