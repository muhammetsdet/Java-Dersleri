package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Can you write  number of a ?");
        int a = scn.nextInt();
        System.out.println("Can you write  number of b ?");
        int b = scn.nextInt();
        System.out.println("Can you write  number of c ?");
        int c = scn.nextInt();
        int math = ((a*a)-(b*b))/(c*3);
        System.out.println("Mathematic Play is " + math);

    }
}
