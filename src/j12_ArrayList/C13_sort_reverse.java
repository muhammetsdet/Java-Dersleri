package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C13_sort_reverse {
    public static void main(String[] args) {
        //sort():-> list elemanlarını doğal (NATUREL ORDER) sıralama yapar

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("sortingen öncesi ulkelist = " + ulkelist);// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        Collections.sort(ulkelist);//return type void oldg için sout -> CTE
        System.out.println("sortingen sonrası ulkelist = " + ulkelist);// [Alamanya, Amerigonya, Dingiltere, Güba, Polkonya]
        // **** çoooğ önemli -> reverse() meth list elemanlarını index'e göre ters sıralar

        List<Integer> sayiList = new ArrayList<>(List.of(23,12,21,62,49,11,7,16));
        System.out.println("reverse öncesi sayiList = " + sayiList); //[23, 12, 21, 62, 49, 11, 7, 16]

        Collections.reverse(sayiList);// sort()-> k-b reverse() -> b-k değil
        System.out.println("reverse sonrası sayiList = " + sayiList);//[16, 7, 11, 49, 62, 21, 12, 23]

    }

}
