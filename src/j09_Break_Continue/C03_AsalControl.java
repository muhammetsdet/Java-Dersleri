package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner input=new Scanner(System.in);
        System.out.println("agam sayı giresen : " );
        int sayi=input.nextInt();
        boolean asalMi=true;//abdullah bey bayragı yukarı

        for (int i = 2; i < sayi; i++) {//i=2,3.4...
            if (sayi%i==0){// sayının tekrardan gelen herhangi bir sayıya tam bolunme sartı
                asalMi=false;// bayrak asagı
                break;

            }
        }
        System.out.println(asalMi ? "girilen sayı ASAL :)" : "girilen sayı ASAL DEĞİL :(");

    }
}
