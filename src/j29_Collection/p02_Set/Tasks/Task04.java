package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task04 {
     /*
    Create a method totalCount()
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(4, 2, 3, 1, 7));

        System.out.println(totalCount(hs));


    }

    public static int totalCount(HashSet<Integer> hs) {

        int numSize = hs.size();
        return numSize;
    }
}
