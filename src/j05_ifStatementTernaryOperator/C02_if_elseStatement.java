package j05_ifStatementTernaryOperator;
import java.util.Scanner;
public class C02_if_elseStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int age = scn.nextInt();
        if (age > 18) {
            System.out.println("The age is grater than 18");
        } else {
            System.out.println("The age is smaller than 18");
        }

    }
}