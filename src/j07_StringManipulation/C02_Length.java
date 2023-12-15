package j07_StringManipulation;

public class C02_Length {
    /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */
    public static void main(String[] args) {
        /*
        length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
        butun karakterleri(boşluk vs) sayıp adedini verir.
         */
        String str1 = "bahanesi olanın başarısı olmazzzz :( ";
        System.out.println("str1.length() = " + str1.length());// 37
        String str2 = " ";// tek bınalı arsa
        String str3 = "";// boş arsa-> hiçlik
        String str4 = null;// dutluk
        System.out.println("str2.length() = " + str2.length());//1
        System.out.println("str3.length() = " + str3.length());//0
        //  System.out.println("str4.length() = " + str4.length());// RTE -> para var ama ekmek yok
        // CTE -> para yok ....
       /*
       Trick-> null atanan String variable her hangi bir meth call etmez .
       nul-> case sensitive NULL !=null !=Null
       null-> dutluk: arsa değeri olmayan arazisadece hiçiliği gösteren pointer(işaretçi)
        */


        String str5;// tanımlanmış(decleration) ama atanmamış(non assaignment) boş variable kutu

        // System.out.println("str5 = " + str5);// CTE-> atanmamış variable meth call edilemez
        // str5.contains("a");


    }
}
