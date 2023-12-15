package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Can you write your fullname? ");
        String fullName =scn.next();
        System.out.println("Can you write your age? ");
        int age =scn.nextInt();
        System.out.println("Can you write your weight? ");
        int weight =scn.nextInt();
        System.out.println("Can you write your height? ");
        int height =scn.nextInt();
        System.out.println("How many months will you train? ");
        int train = scn.nextInt();
        System.out.println("Your total payment is : " + train*20 + "$");

    }
}
