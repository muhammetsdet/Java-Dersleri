package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
   hillNum() isminde bir method oluşturun.
   Parametre olarak Integer ArrayList
   Return tipi int,
   Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
   Örneğin;
   ArrayList  5,4,6,2,1
   2, 6'dan küçük ve 1 den büyüktür.
   Return 2 olmalı.
    */
public class _06_arraylist6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));
        System.out.println(hillNum(numbers));
    }

    private static int hillNum(ArrayList<Integer> numbers) {
        for (int i = 1; i < numbers.size()-1; i++) {
            if ((numbers.get(i) < numbers.get(i - 1) && numbers.get(i) > numbers.get(i + 1))) {
               return numbers.get(i);

            }
        }
        return -1;
    }
}
/*
 public static void main(String[] args) {
        ArrayList<Integer>numList = new ArrayList<>(Arrays.asList(5,4,6,2,1));
        System.out.println(hillNum(numList));
    }
    private static int hillNum(ArrayList<Integer> numList) {
        int sayi=0;
        for(int i=1; i<numList.size()-1; i++){
            if(numList.get(i)<numList.get(i-1)&&numList.get(i)>numList.get(i+1)){
                sayi=numList.get(i);
            }
        }return sayi;
    }
}
 */