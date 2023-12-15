package j04_JavaOperators.Tasks;
import java.util.Scanner;
public class _01_AritmethicOperarors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Can you write a number?");
        int num1 = scn.nextInt();
        System.out.println("Can you write second number?");
        int num2 = scn.nextInt();
        System.out.println("Sum of numbers: "+ (num1+num2));
    }
}
