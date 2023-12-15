package j04_JavaOperators.Tasks;

public class _j14_SwapInterviewQuestion {
    public static void main(String[] args) {
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan
	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20
         */
        int sayi1 = 20;
        int sayi2 = 34;

       // a cözüm
        // System.out.println("   *** a çözüm   ***   ");
        // System.out.println("Swap öncesi sayı1 -> " + sayi1 + " sayı2 -> " + sayi2);//Swap öncesi sayı1 -> 20 sayı2 -> 34
        // int bosKutu = sayi2;//sayı2 değeri bosKutuya atandı
        // sayi2 = sayi1;//sayı1 değeri sayı2'ye atandı -> sayı2=20
        // sayi1 = bosKutu;// bosKutudaki sayı2'nin ilk değer(34)  sayı1'e atandı
        // System.out.println("Swap sonrası sayı1 -> " + sayi1 + " sayı2 -> " + sayi2);//Swap öncesi sayı1 -> 34 sayı2 -> 20
        // b cözüm
        System.out.println("   *** b çözüm   ***   ");
        System.out.println("Swap öncesi sayı1 -> " + sayi1 + " sayı2 -> " + sayi2);//Swap öncesi sayı1 -> 20 sayı2 -> 34

        //sayi1 = sayi1 + sayi2;//sayı1=54
        sayi1 += sayi2;//sayı1=54
        sayi2 = sayi1 - sayi2;// sayı2=20-> sayı1(54)-sayı2(34)
        sayi1 = sayi1 - sayi2;// sayı=34 -> sayı1(54)-sayı2(20)

        System.out.println("Swap sonrası sayı1 -> " + sayi1 + " sayı2 -> " + sayi2);//Swap öncesi sayı1 -> 34 sayı2 -> 20


    }
}
