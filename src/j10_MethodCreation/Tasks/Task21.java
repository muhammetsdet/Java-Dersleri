package j10_MethodCreation.Tasks;
/*
task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
*/

import java.util.Scanner;

public class Task21 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        digitOfNumber();
    }
    private static int digitOfNumber() {
        System.out.println("Say any number...");
        int num= input.nextInt();
        String newNum= Integer.toString(num);
        int digitOfNum= newNum.length();
        System.out.println("The number you entered is " + digitOfNum + " digit.");

        return num;
    }

}
