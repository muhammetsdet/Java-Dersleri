package j11_Arrays.Tasks;

import java.util.Arrays;

/*
    int Array oluşturun ve elemanları : 12,2,5,15,8
    En büyük değeri yazdırınız.
 */
public class _07_array_max_value {
    public static void main(String[] args) {
        int num []= {12,2,5,15,8};
        Arrays.sort(num);
        System.out.println(num[num.length - 1]);
    }
}
