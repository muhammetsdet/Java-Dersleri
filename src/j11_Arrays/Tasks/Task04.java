package j11_Arrays.Tasks;

import java.util.Scanner;

// task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortalamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Agam arr kaç elemanlı olacak giresen : ");
        int arrboyut = input.nextInt();
        //int arr[] = new int[input.nextInt()];// boyutu girilen boş arr tanımlandı
        int arr[] = new int[arrboyut];// boyutu girilen boş arr tanımlandı

        for (int i = 0; i < arr.length; i++) {// bos arr'e eleman atama tekrarı
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = input.nextInt();// tekrarddan gelen herbir arr elamanına atama yapıldı

        }
        int toplam = 0;//arr elemanların toplanacagı boş kutu tanımlandı
        for (int i = 0; i < arrboyut; i++) {
            toplam += arr[i];// tekrarddan gelen her bir arr elamanı bos toplam kutusuna eklenerek atandı
        }
        int count = 0;// ortlamadan buyuk arr eleman sayısı
        int ortalama = toplam / arrboyut;
        System.out.println("ortalama = " + ortalama);//
        for (int i = 0; i < arrboyut; i++) {
            if (arr[i] > ortalama) {//tekrardan gelen herbir arr elemanı ortlamadan buyuk olma sartı
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("arr ortalamadan buyuk eleman sayısı = " + count);
    }
}
