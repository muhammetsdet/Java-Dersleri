package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Fahrenheit of weather is: ");
        float fahrenheit = scn.nextFloat();
        System.out.println("Degrees of weather is: " + (fahrenheit-32)/1.8 );


    }
}
