package j08_Loops;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Loop-> tekrarlayan sabit actiın'lar için tanımlana code komut blok'larıdır.

        // task-> 42 kere "maaşallah" prin eden code create ediniz.
        //  System.out.println("maaşallah");//1. maaşallah
        //  System.out.println("maaşallah");//1. maaşallah
        //  System.out.println("maaşallah");//1. maaşallah
        //  System.out.println("maaşallah");//1. maaşallah..... amele sinemaki code :(

        // baş. value_star     bitiş sart(ending con.)  value  değişim
        for (int i = 1; i < 42; i++) {//for body level -> i=1, 2, 3, ...41 e kadar tekrar tanımlandı
            System.out.println(i + ". maaşallah");//her tekrar(döngüde) alınacak action
            System.out.println("agaya selam");// for için action for kdar run olur
        }// for body sonu
        System.out.println("javaCAN'a selam");// for dısı action 1 kez run olur

        // task02-> 2 basamalı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.

        for (int i = 11; i < 100; i += 2) {//i=11,13,15...99 a kadar tekrar tanımlandı
            System.out.print(i + " ");
        }
        System.out.println("   ***   ");

        for (int i = 0; i < 100; i++) {//i=0,1,2,3..99
            if (i >= 10 && i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
          /*
          Code standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir (Fix) ve update kolay yapilabilmelidir
         */
    }
}
