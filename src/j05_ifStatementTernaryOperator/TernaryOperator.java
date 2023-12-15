package j05_ifStatementTernaryOperator;

import java.util.Scanner;
//k02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
//.out.println("   ***  task02   ***   ");

//  System.out.println("   ***  if blok   ***   ");


//  System.out.println("   ***  ternary operator   ***   ");
public class TernaryOperator {
    public static void main(String[] args) {

               /*
       Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
       Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
       Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur.
        */
        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
        System.out.println("   *** task01   ***   ");
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş hele bi sayı girive gari...");
        int sayi = input.nextInt();

        System.out.println("   ***  if blok   ***   ");

        if (sayi % 2 == 0) {// 2 ye tam bolunme kontrolu->çift kontrolu
            System.out.println("Agıdeş senin sayi CİFT gari");
        } else {// 2 ye tam boluneme -< tek kontrolu
            System.out.println("Agıdeş senin sayi TEK gari");
        }


        System.out.println("   ***  ternary operator   ***   ");
        // condition(şart)  ? (if-ise) sart True için ACTION-> if body : (else-değilse) sart False için ACTION -> else body;
        //  String sonuc = sayi % 2 == 0 ? "Agıdeş senin sayi CİFT gari" : "Agıdeş senin sayi TEK gari";

        System.out.println(sayi % 2 == 0 ? "Agıdeş senin sayi CİFT gari" : "Agıdeş senin sayi TEK gari");//
        //  int yas=48;
        //  System.out.println(yas);// 48
        //  System.out.println(48);//48

        /*
        ahan da trick köşesinde böğünn : ternary operator action sonucu true veya false  agöre verecği output(çıktı) eğer
        data type uygun bir variable(container->kutu) a atnamzsa CTE verir.
        Çözüm olarak teranry çıktısı ya bir variable atanmalaı yada sout gibi doğrudan bir action'da kullanılmalı
         */

        // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
        System.out.println("   ***  task02   ***   ");

        System.out.println("   ***  if blok   ***   ");

        if (sayi > 0) {
            System.out.println("Agıdeş senin sayı POZITIF :)");
        } else {
            System.out.println("Agıdeş senin sayı NEGATIF :)");
        }

        System.out.println("   ***  ternary operator   ***   ");

        System.out.println(sayi > 0 ? "Agıdeş senin sayı POZITIF :)" : "Agıdeş senin sayı NEGATIF");

        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.
        System.out.println("   ***  task03   ***   ");
        System.out.print("Agıdeş 2. sayıyı da girive gari : ");
        int sayi2=input.nextInt();

        // int bykSayı = sayi > sayi2 ? sayi : sayi2;
        // System.out.println("bykSayı = " + bykSayı);
        System.out.println(sayi < sayi2 ? sayi2 : sayi);


        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        System.out.println("   ***  task04   ***   ");
        Object   sonuc= sayi2*sayi<0 ? sayi2+sayi:"agam DEWAMKEEE";
        System.out.println("sonuc = " + sonuc);
        /*
        ahan da TRICK -> ternary çıktısı farklı data type(int boolean String char...) tanımlanmışsa
        tum data type kapsayan Hz.Adem class(Parent)-> Object olarak atanır.
         */

    }

}
