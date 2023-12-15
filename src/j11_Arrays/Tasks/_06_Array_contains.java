package j11_Arrays.Tasks;

import java.util.Arrays;

/*
String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
Eğer aitse "true" çevirin.
Loops (döngüler) kullanın.
 */
public class _06_Array_contains {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].contains("Apple") ? true : "");
            }

        }
    }



