package j11_Arrays.Tasks;

import java.util.Arrays;

/*
int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
 */
public class _09_array_second_max {
    public static void main(String[] args) {
        int numbers[]={15 , 25, 22, 18, 30};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
    }

}
