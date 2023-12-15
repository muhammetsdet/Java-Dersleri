package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task21 {
    /* Task->
a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num = scn.nextInt();
        System.out.println(num % 10 >= 5 ? (num / 10 + 1) * 10 : (num / 10) * 10);

    }
}
