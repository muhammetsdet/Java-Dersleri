package j29_Collection.p02_Set.Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task11 {
    public static void main(String[] args) {
        // Task 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Task 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        Set<Integer> set = new HashSet<Integer>();
        randomSet(10, set);
    }

    private static void randomSet(int size, Set<Integer> set) { //random olarak üretilen sayilar set.size=size oluncaya kadar sete tekrar tekrar ekleniyor
        Random rand = new Random();
        while (set.size() < size) {
            set.add(rand.nextInt(20));
        }
        System.out.println("Random set = " + set);
        diziyeCevir(set);
    }

    private static void diziyeCevir(Set<Integer> set) {
        ArrayList<Integer> cevrilenList = new ArrayList<>(set);
        System.out.println("cevrilen Array = " + cevrilenList);
    }

}
