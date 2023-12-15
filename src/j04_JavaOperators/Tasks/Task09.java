package j04_JavaOperators.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many cows are there in the farm? ");
        int cows = scn.nextInt();
        System.out.println("How many sheeps are there in the farm? ");
        int sheeps = scn.nextInt();
        System.out.println("How many chickens are there in the farm? ");
        int chickens = scn.nextInt();
        System.out.println("Number of feet of cows: " + cows*4);
        System.out.println("Number of feet of sheeps: " + sheeps*4);
        System.out.println("Number of feet of chicken: " + chickens*2);

    }
}
