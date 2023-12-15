package j04_JavaOperators.Tasks;

import java.util.Scanner;

public class _09_AritmethicOperarors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Can you write a number?");
        double num1 = scn.nextDouble();
        System.out.println("Can you write second number?");
        double num2 = scn.nextDouble();
        System.out.println("Can you write third number?");
        double num3 = scn.nextDouble();
        System.out.println("Can you write fourth number?");
        double num4 = scn.nextDouble();
        System.out.println("Multiplication of numbers:  " + (num1*num2*num3*num4));
    }
}
