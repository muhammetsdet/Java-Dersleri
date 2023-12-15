package j14_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
           /*
        VARARGS :diva...  :)
        var----variety: cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....
​
        }
​
	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez
​
           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...
  */

        int sayi1 = 15;
        int sayi2 = 32;
        int sayi3 = 59;
        int sayi4 = 38;

        // task01-> verilen 2 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  task01   ***   ");
        topla(sayi1, sayi3);// 74
        topla(sayi2, sayi4);// 70
        topla(99, sayi3);// 158


        // task02-> verilen 3 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  task02   ***   ");
        topla(sayi1, sayi3, 135);// 209
        topla(571, sayi4, 1);// 610
        topla(1905, 24, sayi2);// 1961

        // task03-> verilen 5 int variable toplamını print eden METHOD create ediniz.
        System.out.println("   ***  task03   ***   ");
        topla(3, 6, sayi1, 34, sayi4);// 96
        topla(2, 3);// varargs olmayan meth call
        topla(2, 6, 7, sayi1, 89, 99, 123, 45, 76, 5, 78);// 545

// task04-> .verilen String variable'rın  en fazal karakter bulunduranı  print eden METHOD create ediniz..
        System.out.println("   ***  task04   ***   ");

        enUzuuuuunString("javaZADE", "javvvvvaNUR", "javaGUL");//javvvvvaNUR
        enUzuuuuunString("haluk", "sebnemmm", "cagatayyy","ali","abdullah bey");// abdullah bey


    }// main sonu

    private static void enUzuuuuunString(String... str) {// diva-> varargs method
        String uzuuunStr = "";//boş string kutu tanımlandı
        for (String s:str ) {
            if (s.length() >uzuuunStr.length()) {//tekrardan gelen herbir s elemanı boş str'den uzun olma sartı
                uzuuunStr=s;// tekrardan gelen herbir s elamanı boş stringe atandı
            }
        }
        System.out.println("en uzun str : "+uzuuunStr);

    }

    private static void topla(int... i) {// diva -> cok p'li varargs meth.
        int toplam = 0;
        for (int avuc : i) {
            toplam += avuc;
        }
        System.out.println("girilen sayıların toplamı  : " + toplam);
    }

    private static void topla(int num1, int num2, int num3) {// 3 p'li void meth.
        System.out.println("sayıların toplamı : " + (num1 + num2 + num3));

    }

    private static void topla(int num1, int num2) {// 2 p'li void meth.
        System.out.println("sayıların toplamı : " + (num1 + num2));
    }

    }

