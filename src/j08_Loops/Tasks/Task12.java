package j08_Loops.Tasks;

import java.util.Scanner;

public class Task12 {
            /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        int toplam = 0;// loopdaki actiondaki toplama depolayacak boş kutu tanımlandı

        for (int i = 1; i <= 5; i++) {//istene 5 tekrar tanımlandı
   System.out.println("agam ele " + i + ". sayıyı giresen : ");
            int sayi = input.nextInt();
            //   if (sayi<=10 ||sayi>=20){
            //       toplam+=sayi;
            //   }
            toplam = (sayi <= 10 || sayi >= 20) ? toplam += sayi : toplam;

        }
        System.out.println("girilen sayıların toplamı : " + toplam);

    }
}
