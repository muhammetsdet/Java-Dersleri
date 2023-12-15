package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class _29_Scanner8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you weigh?");
        byte weigh =input.nextByte();
        System.out.println("My kilos is : " + weigh + "kg");
    }
}
