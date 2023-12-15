package j11_Arrays.Tasks;
import java.util.Arrays;
        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

public class _05_Array_with_for_if {
    public static void main(String[] args) {
       int transaction=0;
       int numbers[]={5,6,8,12,14,19};
        for (int i = 0; i <numbers.length ; i++) {
          transaction= numbers[i] % 2 == 0 ? (transaction += numbers[i]) : (transaction -= numbers[i]);
        }
        System.out.println(transaction);
    }

    }

