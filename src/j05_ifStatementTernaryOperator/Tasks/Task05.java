package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num = scn.nextInt();
        if (num <= 999 && num >= 100) {
            System.out.println("tree digit");
        } else if (num <= 99 && num >= 10) {
            System.out.println("two digit");
        } else {
            System.out.println("not in both");
        }
    }
}