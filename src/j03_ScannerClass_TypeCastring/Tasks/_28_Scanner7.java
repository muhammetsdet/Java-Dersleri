package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class _28_Scanner7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have any acount of banks");
        boolean haveBanks =input.nextBoolean();
        System.out.println(haveBanks);
    }
}
