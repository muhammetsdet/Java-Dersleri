package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TennaryOperator {
    public static void main(String[] args) {
        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş hele bi sayı girive gari...");
        int sayi = input.nextInt();
        System.out.println(sayi < 10 && sayi > -10 ? "Agıdeş senin sayı TEK BASAMAK" : "Agıdeş senin sayı EN AZ 2 BASAMAK");
    }

}
