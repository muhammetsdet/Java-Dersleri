package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How far is our destination?");
        int destination = scn.nextInt();
        System.out.println("How fast will we go?");
        int speed = scn.nextInt();
        System.out.println("Our arrival time is " + destination/speed);
}
}