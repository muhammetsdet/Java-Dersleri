package j11_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_Arrays_copyOf {
    public static void main(String[] args) {
        // Arrays.copyOf(arr,int);-> girilen arr'yin istenen elelman sayısı kadar ilk elemanı kopyalar
        int arr[] = {2, 5, 13, 65, 49, 38, 33, 58, 27};
        int yeniArr[] = Arrays.copyOf(arr, 6);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));// [2, 5, 13, 65, 49, 38, 33, 58, 27]
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));// [2, 5, 13, 65, 49, 38]
        // arr'in son 3 elamanını store(depolayan) arrayi print eden code create ediniz...
        int yeniArr2[] = Arrays.copyOfRange(arr, arr.length - 3, arr.length);
        System.out.println("Arrays.toString(yeniArr2) = " + Arrays.toString(yeniArr2));// [33, 58, 27]

        // Array'i belirli bir eleman ile set-update (fill(value)) etme

        System.out.println("arr fill(10) öncesi :  " + Arrays.toString(arr));// [2, 5, 13, 65, 49, 38, 33, 58, 27]
        Arrays.fill(arr, 10);//arr'in tum elamanları 10 ile update edildi
        System.out.println("arr fill(10) sonrası :  " + Arrays.toString(arr));//  [10, 10, 10, 10, 10, 10, 10, 10, 10]
        // task-> arr 3 ile 7 index arası(4-5-6) elamanları 35 ile update eden code create ediniz...

        Arrays.fill(arr, 4, 7, 35);// 4.5.6. index 35 ile update oldu
        System.out.println("arr fill 3-7 arası  35 sonrası " + Arrays.toString(arr));//[10, 10, 10, 10, 35, 35, 35, 10, 10]

    }
}
