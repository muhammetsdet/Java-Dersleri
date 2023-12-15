package j04_JavaOperators.j03_Comperation.Tasks;
import java.util.Scanner;
public class _j17_ComperationOperators {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a number: ");
        int a = scn.nextInt();
        System.out.println("Write second number: ");
        int b = scn.nextInt();
        boolean x = a==b;
        System.out.println(x);
    }
}
