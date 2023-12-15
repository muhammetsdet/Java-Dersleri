package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner input = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = input.nextInt();
        if (sayi < 0) {
            System.out.println("sayı NEGATİF");
        } else if (sayi > 0) {
            System.out.println("sayı POZİTİF");
        } else {
            System.out.println("sayı NOTR");

        }


    }
}
