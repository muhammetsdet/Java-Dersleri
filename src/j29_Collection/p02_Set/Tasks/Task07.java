package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task07 {

    /*
    removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    Return tipi linkedhashset
    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i döndür.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList("Germany", "France", "USA", "Canada", "Mexico", "Brazil"));

        String s1 = "Germany";
        String s2 = "USA ";

        System.out.println(removing(lhs, s1, s2));


    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String s1, String s2) {

        if (lhs.contains(s1)) {
            lhs.remove(s1);
        }
        if (lhs.contains(s2)) {
            lhs.remove(s2);
        }
        return lhs;
    }
}
