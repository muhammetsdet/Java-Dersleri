package j14_Varargs;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */
        //   int sayiArr[] = {2,24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println(toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));// 468
    }//main sonu

    private static int toplaCarp(int carpilacakSayi, int... toplancakSayilar) {
        int toplam = 0;
        for (int avuc : toplancakSayilar) {
            toplam += avuc;
        }
        return carpilacakSayi * toplam;
    }
}
