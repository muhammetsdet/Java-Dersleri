package j08_Loops.Tasks;

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Gadın anam ele  biseyler giresen : ");
        String metin = input.next();// selam javaCAN'lar

        System.out.println("hangi harfi saydırmak isitirsen :");
        char harf = input.next().charAt(0);// a

        int harfSayisi = 0;// metin ile karşılaştırlan harfin sayısı için boş bir kutu tanımlandı


        for (int i = 0; i < metin.length(); i++) {//metindeki karakter saysı kadar lopp tanımlandı

            if (metin.charAt(i) == harf) {//lopp'dan gelen her bşir metin karakterinin harfe eşitlik kontrolu tanımlandı
                harfSayisi++;
            }
        }

        System.out.println("girilen metin :" + metin + " de istenen harf : " + harf + harfSayisi + " tanedir");
    }
}
