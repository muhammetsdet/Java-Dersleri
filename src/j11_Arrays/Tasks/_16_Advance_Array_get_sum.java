package j11_Arrays.Tasks;

import java.util.Arrays;

/*
Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
$ işaretlerini kaldırın ve sayıları toplayın.
Sayıların toplamını yazdırın.
 */
public class _16_Advance_Array_get_sum {
    public static void main(String[] args) {
      String money= "$12 $23 $10 $2 $5 $2";
      String newMoney[]=money.split(" ");
        int sum =0;
        for (int i = 0; i <newMoney.length ; i++) {
         sum+= Integer.parseInt(newMoney[i].replace("$",""));
        }
        System.out.println(sum);
    }
}
