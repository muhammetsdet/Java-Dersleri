package j08_Loops.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num= scn.nextInt();
        int sum = 0;
        for (int i = 2; i <num ; i++) {
            if ((num%i)==0) {/* sayıyı neden sürekli bölümü sıfıra eşitse devam ettiriyoruz zaten  bir tanesine  bölünürse asal
                değildir ama birine bölünmüyorsa diğer "i"ye bölündüğünü kontrol etmek için artırarak gitmek gerekmez mi?*/
               sum++;
            }

        }
        System.out.println(sum == 0 ? "asal sayı"  :"asal değil" );


    }
}
