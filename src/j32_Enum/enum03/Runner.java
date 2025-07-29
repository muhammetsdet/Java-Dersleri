package j32_Enum.enum03;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    /*
    1- Bir kitap class'ı create ediniz, fields : name ve kategori (Enums)
    2- Kitap kategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
    3- 3 kitap tanımlayınız bir Arraylist e atınız.
    4- bir kategoriye göre listeleyiniz
     */

    public static void main(String[] args) {

        Kitap ktb1 = new Kitap();

        ktb1.name="Leyla mecnunun nesi oluyor";
       // ktb1.kategori="roman";
        ktb1.tur=Kategori.ROMAN;
        Kitap ktb2 = new Kitap();

        ktb2.name="Agaya benden küşleme";
        //ktb2.kategori="rooman";
        ktb2.tur=Kategori.ROMAN;
        Kitap ktb3 = new Kitap();

        ktb3.name="HalUk'ca ebik gabık";
        //ktb3.kategori="Roman";
        ktb3.tur=Kategori.ROMAN;
        ArrayList<Kitap> kutuphane=new ArrayList<>(Arrays.asList(ktb1,ktb2,ktb3)); // kitap obj atanmış Kitap data type list tanımlandı.

//        for (Kitap k:kutuphane) {
//            if (k.kategori.equalsIgnoreCase("roman")){
//                System.out.println(k.name + " ");
//            }
//            }


        for (Kitap k:kutuphane) {
           if (k.tur==Kategori.ROMAN){
               System.out.println(k.name + " ");
           }
           }
            
        }


    }


