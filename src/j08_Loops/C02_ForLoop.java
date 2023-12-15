package j08_Loops;
import java.util.Scanner;
public class C02_ForLoop {
    public static void main(String[] args) {
        // Task-> girlen sayıdan 100'e kadar 4'un katı olan tamsayıları yan yana print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println(" ele bisayı gir :");
        int sayi = input.nextInt();

        //for (int i = input.nextInt(); i <100 ; i++) {//sayi 1 fazla 2 fazla.... 100 tekrar
        // int i;//main scop -> main içersinde action

        if (sayi < 100) {
            for (int i = sayi; i < 100; i++) {//sayi, 1 fazla, 2 fazla.... 100'e tekrar tanımlandı->i for scop tanımlandıgı için for dısı call edilemez
                if (i % 4 == 0) {// tekrardan gelen her bir sayının 4 e tam bolunme sartı tanımlandı
                    System.out.print(i + " ");// tekrardan gelen ve sartı saglayan her sayının print actionu
                }
                System.out.println(i + ". selam");
            }

            System.out.println("agama for dışı ama if içi selam");

        } else System.out.println("100 den kucuk değer girmelisiniz.");

        System.out.println("agam code cincix dewamkeee :) ");
        // i = 1905;//main scop i variable call edilerek tama yapılmadı
    }
}
