package j04_JavaOperators.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a three digit number: ");
        int num = scn.nextInt();
        int firstNumber = num%10;
        int thirdNumber = num/100;
        System.out.println("Sum of first and third numbers = " + (firstNumber+thirdNumber));
    }
}
