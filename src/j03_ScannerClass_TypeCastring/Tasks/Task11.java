package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a character : ");
        char ch =scn.next().charAt(0);
        System.out.println("Value of character is: "+ (int) ch);


    }
}
