package j08_Loops.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num = scn.nextInt();
        boolean isPowerOf3 =false;
        for (int i = 0; i <num ; i++) {
            if (Math.pow(3,i)== num){
                isPowerOf3 =true;
            }
            }
        System.out.println(isPowerOf3 ? num + " is a power of 3." : " is not a power of 3.");
    }

    }

