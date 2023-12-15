package j10_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
    /*
         Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
         çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
         Bu yüzden Recursive(özyineleme) ile yapılan hesaplamalar daha yavaş ve verimsizdir.
         Peki Recursive(özyineleme) neden kullanıyoruz?
         Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
     */
    public static void main(String[] args) {
 /*     Faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir
        1!=1 0!=1 2!=2*1... 6!=6*5*4*3*2*1
        Task : girilen sayının faktöriyelini hesaplayan method create ediniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Agam ele bi sayi giresen : ");
        int sayi = input.nextInt();
        System.out.println(faktoriyelHesapla(sayi));

    }// main sonu

    private static int faktoriyelHesapla(int sayi) {
        if (sayi>=1){
            return sayi*faktoriyelHesapla(sayi-1);
        }else return 1;
    }


}
