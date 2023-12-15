package j08_Loops.Tasks;

import java.util.Scanner;

public class Task07 {
    /*
    Task ->
    girilen boyuttta bir kare için
     Ekran Çıktısı
        Bir sayı giriniz: 7
        1 0 0 0 0 0 0
        0 1 0 0 0 0 0
        0 0 1 0 0 0 0
        0 0 0 1 0 0 0
        0 0 0 0 1 0 0
        0 0 0 0 0 1 0
        0 0 0 0 0 0 1


        Bir sayi giriniz: 5
        1 0 0 0 0
        0 1 0 0 0
        0 0 1 0 0
        0 0 0 1 0
        0 0 0 0 1

        şekli print eden code create ediniz
     */
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int num =scn.nextInt();
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(i == j ? " 1 " : " 0 ");
            }
            System.out.println();
        }


    }
}
