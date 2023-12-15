package j04_JavaOperators.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the hours: ");
        int hours =scn.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes =scn.nextInt();
        System.out.println("Seconds of time: " + ((hours*3600) + (minutes*60)));
    }
}
