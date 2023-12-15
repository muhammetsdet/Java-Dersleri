package j10_MethodCreation.Tasks;

import java.util.Scanner;

/* task-> girilen üç tamsaynın
 bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
 (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

 birinci kenarı giriniz: 3
 ikinci kenarı giriniz 4
 üçüncü kenarı giriniz: 5
  dik üçgendir
 birinci kenarı giriniz: 2
 ikinci kenarı giriniz 15
 üçüncü kenarı giriniz: 7
 dik üçgen değildir.*/
public class Task18RightTriangleExcellent {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println(control());
    }

    private static String control() {
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result = (int) (Math.max(a, b) < c ? a*a+ b*b: Math.pow(Math.min(a, b),2)+ c*c);

        String output=  result == Math.pow(a,2) || result == Math.pow(b,2) || result == Math.pow(c,2) ? "This is a right triangle" : "This is not a right triangle";
     return output;

    }
}
