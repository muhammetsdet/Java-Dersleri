package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_TennaryOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        System.out.println(num1%2 == 0 ?  num1 / 2 : "agıdeşş tekin yarısı tam olmaz");
    }
}
