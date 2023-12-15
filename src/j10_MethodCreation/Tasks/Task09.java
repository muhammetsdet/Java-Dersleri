package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        Scanner input = new Scanner(System.in);
        System.out.println(" saat giriniz : ");
        double saat = input.nextDouble();
        // howManySeconds1(saat); // dynamic
        // howManySeconds1(3);
        //  howManySeconds1(2.5);
        //  howManySeconds1(1.8);
        //  howManySeconds1(13.4);// non-dynamic
        System.out.println(howManySeconds2(2.4567));// 8844.12
        System.out.println(howManySeconds3(6.22));// 22392.0
        double ahmtSaniyesi = howManySeconds2(3.14);
        // double mehmtSaniye=howManySeconds1(4.56);// void bir cıktı herhangi bir variable atanamaz

    }//main sonu

    private static void howManySeconds1(double i) {//p'li void meth
        System.out.println("girilen " + i + " saatin saniye karsılıgı " + (i * 3600));

    }

    private static double howManySeconds2(double i) {//p'li double return meth
        // System.out.println("girilen " + i + " saatin saniye karsılıgı " + (i * 3600));
        return i * 3600;
    }

    private static String howManySeconds3(double i) {//p'li  String return meth
        // System.out.println("girilen " + i + " saatin saniye karsılıgı " + (i * 3600));
        return "" + i * 3600;
    }

}
