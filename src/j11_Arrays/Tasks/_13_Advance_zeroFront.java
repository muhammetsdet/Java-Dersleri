package j11_Arrays.Tasks;

import java.util.Arrays;

/*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */
public class _13_Advance_zeroFront {
    public static void main(String[] args) {
    int arr1 []={1,0,0,1,0};
    Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
