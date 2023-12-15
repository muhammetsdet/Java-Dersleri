package j04_JavaOperators.j03_Comperation.Tasks;
import java.util.Scanner;
public class _j18_ComperationOperators {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Write number 1: ");
        double num1 = scn.nextDouble();
        System.out.println("Write number 2:");
        double num2 = scn.nextDouble();
        boolean isTrue = num1==num2;
        System.out.println(isTrue);

    }

}
