package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task29PowerOfThree {
            /*
            powerOfThree isminde bir method oluşturun.
                Parametre olarak int
                Return tipi boolean
                Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
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
       powerOf3();
    }

    private static void powerOf3() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num = scn.nextInt();
        boolean isPowerOf3 =false;
        for (int i = 0; i <num ; i++) {
            if (Math.pow(3,i)== num){
                isPowerOf3 =true;
            }
        }
        System.out.println(isPowerOf3 ? num + " is power of 3." : " is not power of 3.");
    }

}

