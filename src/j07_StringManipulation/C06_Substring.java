package j07_StringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
           /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */
        String str = "madem gelding dünyaya otor çalış JAVA'ya";
        System.out.println("str.substring(10) = " + str.substring(10));//10. index dahil tum str->ing dünyaya otor çalış JAVA'ya

        // str'nin son 10 karakterini print ediniz
        System.out.println("str.substring(str.length()-10) = " + str.substring(str.length() - 10));//ış JAVA'ya

        // str'nin ilk 10 karakterini print ediniz
        System.out.println("str.substring(0,9) = " + str.substring(0, 10));// 0.1.2...9->madem geld
        // str'nin ilk  karakterini print ediniz
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));//0 index:ilk karakter->m
        // str'nin son  karakterini print ediniz
        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));// a

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. -> kale:elak
        Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz :");
        String kelime = input.next();
        System.out.println("kelime = " + kelime);
        System.out.println(kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                (kelime.substring(0, 1)));


    }
}