package Challange01.InterviewQuestion;

import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write first number for base");
        int num1=input.nextInt();
        System.out.println("Write second number for top");
        int num2=input.nextInt();
        System.out.println(Math.round(Math.pow(num1, num2)));


    }
}
