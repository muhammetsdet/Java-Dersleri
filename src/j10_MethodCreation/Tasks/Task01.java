package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
    public static void main(String[] args) {
        System.out.println(equal());
    }
    public static boolean equal(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Write first number ");
        int num1 = scn.nextInt();
        System.out.println("Write second number ");
        int num2 = scn.nextInt();
        return num1==num2;
    }
}
