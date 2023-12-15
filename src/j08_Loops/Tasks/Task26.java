package j08_Loops.Tasks;

import java.util.Scanner;

public class Task26 {
    //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        System.out.println("Say any number...");
        int num = scn.nextInt();
        int sum = 0;
        for (int i = 0; i <=num ; i++) {
            sum+=i;

        }
        System.out.println(sum);
        System.out.println((num * (num + 1)) / 2);
    }
}
