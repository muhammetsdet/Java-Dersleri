package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class _24_Scanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite vegetable");
        String vegatable = input.next();
        System.out.println("My favorite vegatable is :" + vegatable);
    }
}
