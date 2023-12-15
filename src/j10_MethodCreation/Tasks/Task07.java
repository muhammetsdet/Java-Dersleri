package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {
    //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("2. sayı giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("2. sayı giriniz : ");
        int sayi3 = input.nextInt();
        System.out.println(Math.min(sayi1, sayi2) < sayi3 ? Math.min(sayi1, sayi2) : sayi3);
    }
}
