package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write one side of a right triangle ");
        int oneSide = scn.nextInt();
        System.out.println("Write other side of a right triangle");
        int otherSide = scn.nextInt();
        int lenghth = (oneSide*oneSide) + (otherSide*otherSide);
        int hypotenuse = (int) Math.sqrt(lenghth);
        System.out.println("Hypotenuse length : " + hypotenuse );
    }
}
