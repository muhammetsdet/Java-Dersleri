package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class _15_ifElseStatement {
    /*   String number oluşturulmuştur.
     Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
     Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
     Aksi halde (else) "no money" yazdırın.   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much is it");
        String number = scan.nextLine();
        if (number.contains("£")) {
            System.out.println("This is euro");
        } else if (number.contains("$")) {
            System.out.println("This is dollar");

        } else {
            System.out.println("no money");
        }
    }
}