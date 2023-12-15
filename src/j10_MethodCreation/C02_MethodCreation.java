package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
       // Scanner scn = new Scanner(System.in);
       // int toplam=0;
       // for (int i = 0; i < 4; i++) {
       //     System.out.println(i + ". enter number");
       //     int num=scn.nextInt();
       //     toplam+=num;
        sum();
        }


   // public static void ortalamaAl(int ttl) {
   //     System.out.println("girilen sayıların toplamıları " + ttl / 3);
   // }

    private static int sum() {
        Scanner scn =new Scanner(System.in);
        int total=0;
        for (int i = 1; i < 4; i++) {
            System.out.println(i + ". enter number");
            int num = scn.nextInt();
            total += num;

        }
        System.out.println(total / 3);
        return total;
    }
}



