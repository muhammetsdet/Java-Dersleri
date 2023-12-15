package j11_Arrays.Tasks;

import java.util.Arrays;

/*
int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
En küçük (minimum) sayıyı yazdırınız.
 */
public class _08_array_min_value {
    public static void main(String[] args) {
        int numbers []={14 , 19 , 5 , 21};
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
    }
}
