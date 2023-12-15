package j11_Arrays.Tasks;

import java.util.Arrays;
/*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
      Array in elemanlarının toplamını yazdır.
      Cevap 220 olmalı.
 */
public class _03_Create_array3_int {
    public static void main(String[] args) {
        int[] num={25,30,30,35,100};
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }

}
