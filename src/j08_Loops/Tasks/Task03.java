package j08_Loops.Tasks;

import java.util.Scanner;

public class Task03 {
    // task-> girilen sayının faktöriyelini print code create ediniz
    //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Which number do you want to find out its factorial value?");
        int fact = scn.nextInt();
        int multiplication = 1;
        System.out.print(fact + "!= ");
        for (int i = fact; i > 0; i--) {
            System.out.print(multiplication * i + "*");
        }

    }
}
