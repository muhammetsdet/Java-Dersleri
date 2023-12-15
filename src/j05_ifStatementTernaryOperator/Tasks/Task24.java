package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task24 {
    /*
*Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
*Taksimetre kilometre başına 2.20 TL tutmaktadır.
*Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How far from here");
        int distance =scn.nextInt();
        int openingFee = 10;
        int shortFee = 20;
        System.out.println(distance>4? openingFee + distance*2.20 : shortFee);
    }
}
