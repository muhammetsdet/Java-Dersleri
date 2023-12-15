package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class _18_ifElseStatement {
    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
      Bu numarayı yazdırınız.
      Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

      Örn: 10-11-12 > 10  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write tree number");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        if (i1 < i2 && i2 < i3) {
            System.out.println(i1);
        } else if (i2 < i1 && i1 < i3) {
            System.out.println(i2);
        } else {
            System.out.println(i3);
        }
    }
}