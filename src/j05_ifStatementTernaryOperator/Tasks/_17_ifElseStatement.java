package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class _17_ifElseStatement {
    /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
   Bu en yüksek numarayı yazdırın.

   Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
   Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write tree number");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        if (i1 < i2 && i2 > i3) {
            System.out.println(i2);
        } else if (i3 > i1 && i3 > i2) {
            System.out.println(i3);

        } else {
            System.out.println(i1);
        }
    }
}