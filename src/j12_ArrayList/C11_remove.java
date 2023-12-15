package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));

        System.out.println("remove öncesi ulkelist = " + ulkelist); // [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        System.out.println("ulkelist.remove(2) = " + ulkelist.remove(2));// Polkonya
        System.out.println("remove sonrası ulkelist = " + ulkelist);// [Alamanya, Güba, Dingiltere, Amerigonya]
        //  System.out.println("ulkelist.remove(33) = " + ulkelist.remove(33));//RTE->IndexOutOfBoundsException:olmayan eleman
        //  ahanda TRıck köşesinde böğün: remove(index)-> silinen elemanı return eder:kelle
        //                               remove(eleman)-> silinen elemanı true/false return eder : rapor
        System.out.println("ulkelist.remove(\"Alamanya\") = " + ulkelist.remove("Alamanya"));//true
        System.out.println("remove sonrası ulkelist = " + ulkelist);// [Güba, Dingiltere, Amerigonya]

        ArrayList<String> sehirlist = new ArrayList<>(Arrays.asList("Angara", "Gonya", "Ayıntap", "Gayseri"));
        ulkelist.addAll(sehirlist);
        System.out.println("ulkelist sehirList eklenmiş hali = " + ulkelist);//[Güba, Dingiltere, Amerigonya, Angara, Gonya, Ayıntap, Gayseri]
        System.out.println("sehirlist = " + sehirlist);//[Angara, Gonya, Ayıntap, Gayseri]
        System.out.println("ulkelist.removeAll(sehirlist) = " + ulkelist.removeAll(sehirlist));//true
        System.out.println("removeAll sonrası ulkelist = " + ulkelist);// [Güba, Dingiltere, Amerigonya]

        System.out.println("removeAll öncesi sehirlist = " + sehirlist);// [Angara, Gonya, Ayıntap, Gayseri]
        System.out.println("sehirlist.removeAll(sehirlist) = " + sehirlist.removeAll(sehirlist));// true
        System.out.println("removeAll sonrası  sehirlist = " + sehirlist);// []

        ArrayList<Integer> sayilist = new ArrayList<>(Arrays.asList(23, 44, 66, 72, 38, 10, 45, 33, 2));
        System.out.println("sayilist.remove(2) = " + sayilist.remove(2));// 66
        //  System.out.println("sayilist.remove(2) = " + sayilist.remove(44));// RTE->->IndexOutOfBoundsException:olmayan eleman
        // ahan da Trick-> sayilist.remove(44)) Integer type listte remove(index n); girilen parametre list elemanı değil eleman index'i olarak derleniz

    }
}
