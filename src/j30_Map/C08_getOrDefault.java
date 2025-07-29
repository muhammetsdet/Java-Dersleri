package j30_Map;

import java.util.HashMap;

public class C08_getOrDefault {
    public static void main(String[] args) {
        // map.getOrDefault(); -> girilen key map'de varsa key'e ait value yoksa default değer return eder
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm getOrDefault öncesi  = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.getOrDefault(\"Amazon\",\"hajiJAVJAV\") = " + hm.getOrDefault("Amazon", "hajiJAVJAV"));// 296 Euro
        //hm map'de Amazon key oldugu için value'su 296 Euro return edildi
        System.out.println("hm.getOrDefault(\"JavaZAN\",\"hajiJAVJAV\") = " + hm.getOrDefault("JavaZAN", "hajiJAVJAV"));// hajiJAVJAV
        //hm map'de JavaZAN  key olmadıgıu için default value'su hajiJAVJAV return edildi.
        System.out.println("hm = " + hm);// Değişiklik olmadı çünkü CRUD'ın Read kısmını yaptık.

    }
}
