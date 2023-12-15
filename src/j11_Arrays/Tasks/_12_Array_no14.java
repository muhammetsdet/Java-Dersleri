package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

/*
int array oluşturun (intArr)
Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true

bir array oluşturun ve elemanları : 1,2,3,4
Sonuç false olmalı
NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
 */
public class _12_Array_no14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Say something...");
        String str1 = scan.nextLine();
        String[] arr1 = str1.split(" ");
        int[] intArr = new int[arr1.length];
        int count = 0;

        for (int i = 0; i < intArr.length; i++) {
            int i1 = Integer.parseInt(arr1[i]);
            intArr[count] = i1;
            count++;
        }

        System.out.println(Arrays.toString(arr1).contains("1") && Arrays.toString(arr1).contains("4") ? "False" : "True");

    }
    }

