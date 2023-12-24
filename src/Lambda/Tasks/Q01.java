package Lambda.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    /*    2) "Q01" olarak adlandırılan bir class oluşturun
            3) 5 String öğesi içeren bir String listoluşturun.
            4) 3 tanesi "A" harfi ile başlayacak
            5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
            5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.
       */
    public static void main(String[] args) {
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Ancak", "Anne", "Al", "Derse", "Kabul et"));
        List<String> list= ulkeList
                .stream()
                .filter(t-> t.startsWith("A") && t.length() <5)
                .map(t->t.toUpperCase())
                .toList();
        System.out.println(list);
    }
/*
 1. Yol-->
 List <String>list = new ArrayList<>(Arrays.asList("Adana", "Ankara", "Adiyaman", "Mersin", "Istanbul"));
        System.out.println(Arrays.toString(list.stream().filter(t -> t.startsWith("A") && t.length() <= 5).map(String::toUpperCase).toArray()));

            List<String> colors = new ArrayList<>(Arrays.asList("Ayse", "Ali", "Aylin", "Canan", "Hakan"));
        startsWithA(colors);
    }
2. Yol-->
    private static void startsWithA(List<String> colors) {
        colors.stream()
                .filter(t -> t.length() < 5 && t.substring(0, 1)
                        .equalsIgnoreCase("A")).forEach(SeedMethods::stringPrint);

    }
    }
 */
}
