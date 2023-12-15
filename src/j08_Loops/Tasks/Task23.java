package j08_Loops.Tasks;

import java.util.Scanner;

public class Task23 {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Say a number...");
        int num = scn.nextInt();
        int sum = 0;
        for (int i = 0; i <=num ; i++) {
            sum+=i*i;
        }
        System.out.println(sum);

    }
}
