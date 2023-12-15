package j05_ifStatementTernaryOperator.Tasks;
        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

import java.util.Scanner;

public class _06_ifElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write any number");
        int number = scan.nextInt();
        if (number == 0) {
            System.out.println("Im neutral");
        } else if (number > 0) {
            System.out.println("I m positive");

        } else if (number < 0) {
            System.out.println("I m negative");

        }
    }
}
