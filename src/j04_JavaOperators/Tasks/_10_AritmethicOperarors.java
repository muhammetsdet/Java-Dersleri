package j04_JavaOperators.Tasks;

import java.util.Scanner;

public class _10_AritmethicOperarors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Can you write a number?");
        int num1 = scn.nextInt();
        System.out.println("Can you write second number?");
        int num2 = scn.nextInt();
        System.out.println("Can you write third number?");
        int num3 = scn.nextInt();
        System.out.println("Can you write fourth number?");
        int num4 = scn.nextInt();
        System.out.println("Multuplication of numbers: "+ (num1*num2*num3*num4));
    }
}
