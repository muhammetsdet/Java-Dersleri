package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String myName= input.next();
        System.out.println("My name is : " + myName);


    }
}
