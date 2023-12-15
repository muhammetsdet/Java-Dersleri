package j11_Arrays.Tasks;

import java.util.Arrays;
/*
 String Array (Dizi) oluşturunuz.
 elemanları : Apple, Orange , Banana, Kiwi
 Array'leri tüm elemanları yazdırınız.
  */
public class _01_Create_array {

       public static void main(String[] args) {
           String fruits [] = {"Apple", "Orange", "Banana", "Kiwi"};
           System.out.println(Arrays.toString(fruits));
           for (int i = 0; i <fruits.length ; i++) {
               System.out.print((i+1) + "."+fruits[i] + "-");
           }

       }
}
/*
           String fruits [] = {"Apple", "Orange", "Banana", "Kiwi"};
           for (int i = 0; i <fruits.length ; i++) {
               System.out.print((i+1) + "."+fruits[i] + "-");
           }

 */