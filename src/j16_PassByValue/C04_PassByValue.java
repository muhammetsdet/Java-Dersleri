package j16_PassByValue;

public class C04_PassByValue {//Class level
    static  double etiketFiyati;//güneş variable->Class level static her gezegene(meth) erişimi olan initial(ilk değer ataması) yapılmamış variable
    static  double indirimOrani;//güneş variable->Class level static her gezegene(meth) erişimi olan initial(ilk değer ataması) yapılmamış variable
    public static void main(String[] args) {//main level

         /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
         */
        etiketFiyati=100;// güneş variable 100 value atandı
        indirimOrani=0.1;// güneş variable 0.1 value atandı
        System.out.println("indirim öncesi  etiketFiyati : "+etiketFiyati); //100.0

        indirim();//90.0

        System.out.println("indirim sonrası  etiketFiyati : "+etiketFiyati); //90.0

    }//main sonu

    private static void indirim() {

        etiketFiyati*=(1-indirimOrani);//güneş variable 0.9 ile çarpıldı:kalıcı makyaj yapıldı atama yapıldı:makyaja vesikalık değil kendisi otuyrdu
        System.out.println("indirilmiş etiketFiyati = " + etiketFiyati);
    }


}//Class sonu