package j08_Loops.Tasks;
import java.util.Scanner;
public class Task19 {
    /* task -> İlk 10 doğal sayının toplamını print eden code create ediniz.
 */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <10 ; i++) {
            sum +=i;
        }
        System.out.println(sum);
        //System.out.println((9 * 10) / 2);
    }

}
