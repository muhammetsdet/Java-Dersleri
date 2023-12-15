package j04_JavaOperators.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a three digit number: ");
        int num = scn.nextInt();
        int firstNumber = num%10;
        int secondNumber = (num%100)/10;
        int thirdNumber = num/100;
        System.out.println(" First number is: " + firstNumber);
        System.out.println(" Second number is: " + secondNumber);
        System.out.println(" Third number is: " + thirdNumber);
    }
}
