package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

/*
  Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
  ilk ve son elementlerini kapsayan yeni array'e return edin.

 Oluşturacağınız int array'i =   ([1, 2, 3, 4])

 Sonuç bu şekilde olmalıdır. [1, 4]
   */
public class _20_Arrayboth_Ends {
    public static void main(String[] args) {
        int numbers[] = {3, 7, 2, 5, 4, 9};
        int newNum[] = new int[2];
        newNum[0] = numbers[0];
        newNum[1] = numbers[numbers.length - 1];
        System.out.println(Arrays.toString(newNum));
    }

}
