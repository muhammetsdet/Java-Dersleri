package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the price without KDV : ");
        double price = scn.nextDouble();
        if (price < 1000 && price > 0) {
            double kdv = price + (price * 0.18);
            System.out.println("Price is : " + kdv);
        } else if (price >= 1000) {
            double kdv1 = price + (price * 8 / 100);
            System.out.println("Price is: " + kdv1);


        }
    }
}