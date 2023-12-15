package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your height");
        double height = input.nextDouble();
        System.out.println("How much do you weight?");
        double weight = input.nextDouble();
        height = height/100;

        double massBody = weight/(height*height);
        System.out.println("My mass index is : " +massBody);
        int massIndex = (int) massBody;
        System.out.println("My mass index is : " + massIndex);

    }
}
