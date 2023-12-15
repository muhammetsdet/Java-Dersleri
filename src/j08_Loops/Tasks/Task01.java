package j08_Loops.Tasks;

import java.util.Scanner;

public class Task01 {/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gadın anam ele  bi sayı gir : ");
        int sayi = input.nextInt();


        if (sayi < 100) {
            for (int i = 1; i <=sayi ; i++) {//1 den girilen sayıya kadar loop tanımlandı
                if (i%15==0) {//loop'dan gelen her bir sayının hem 3 hem de 5 e bolunme sartı tanımlandı
                    System.out.println(i+" için javaCAN");
                } else if (i%5==0) {//loop'dan gelen her bir sayının  5 e bolunme sartı tanımlandı
                    System.out.println(i+" için CAN");
                } else if (i%3==0) {///loop'dan gelen her bir sayının  3 e bolunme sartı tanımlandı
                    System.out.println(i+" için java");
                }
            }
        } else System.out.println("hanı 100 den kucuk girecektim balam :(");


    }
}
