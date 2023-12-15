package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Chose first number ");
        int num1 = scn.nextInt();
        System.out.println("Chose second number");
        int num2 = scn.nextInt();
        System.out.println("Sum of numbers: " + num1+num2);
        System.out.println(" Subtraction of numbers: " + (num1-num2));
        System.out.println("Multiplication of numbers: " + num1*num2);
        System.out.println("Division of numbers: " + num1/num2);
    }
}
