package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_Nested_TennaryOperatory {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        System.out.println(num1>0&& num1<10 ? "Rakam" : (num1<0 ?  "Negatif Sayi" : " Pozitif sayı"));
    }

}
