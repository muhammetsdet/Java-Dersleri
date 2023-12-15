package j11_Arrays;

public class C08_MdArrays {
    public static void main(String[] args) {
        //Task-> int arr[][]={
        //                {3,5},//0. kat
        //                {12,13,15},//1. kat
        //                {103,107,111,121},//2. kat
        //        };
        //        array elamanları toplamını print eden code create ediniz.

        int arr[][] = {
                {3, 5},//0. kat
                {12, 13, 15},//1. kat
                {103, 107, 111, 121},//2. kat
        };
        int toplam = 0;//array elamlarının toplanacagı boş kutu

        for (int kat = 0; kat <= 2; kat++) {//kat tekrarı->outer loop:outer array
            for (int daire = 0; daire < arr[kat].length; daire++) {// daire tekrarı->inner loop:inner array
                toplam += arr[kat][daire];
            }
        }
        System.out.println("array elamanları toplamı = " + toplam);

    }
}
