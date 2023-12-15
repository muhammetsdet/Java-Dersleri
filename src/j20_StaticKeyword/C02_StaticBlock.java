package j20_StaticKeyword;

public class C02_StaticBlock {//class level
    static String isim = "javvaNUR";//gns-> static(Class) variable
    /*
       1.static blok yapıları static variable'rı değer ataması update için kullanılır
       2.static blok Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */

    static {//ilk run edilecek static blok
        System.out.println("   ***   2. static Blok run edildi");
        System.out.println("2.blok update öncesi isim = " + isim); //

        isim = "javaTAR";
        System.out.println("2.blok update sonrası isim = " + isim); //
    }

    public static void main(String[] args) {//main level
        System.out.println("   ***   main meth. run başladı ");
        System.out.println("main meth. update öncesi isim = " + isim); //

        isim = "javaMAIN";

        System.out.println("main meth. update sonrası isim = " + isim); //
        System.out.println("   ***   main meth. run bitti ");
    }//main sonu

    static {//son run edilecek static blok
        System.out.println("   ***   1. static Blok run edildi");
        System.out.println("1.blok update öncesi isim = " + isim); //

        isim = "javaHAN";

        System.out.println("1.blok update sonrası isim = " + isim); //
    }
}
