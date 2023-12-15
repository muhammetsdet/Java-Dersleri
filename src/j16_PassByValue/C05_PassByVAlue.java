package j16_PassByValue;

public class C05_PassByVAlue {
    public static void main(String[] args) {
          /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
       2 .değişklik  yapılan variable'lar atama tanımlanır.
         */
        double etiketFiyati=100;//Primitive main scope initial(ilk değer atama yapılmış)variable
        double indirimOrani=0.1;//Primitive main scope initial(ilk değer atama yapılmış)variable
        System.out.println("indirim öncesi etiketFiyati = " + etiketFiyati); // 100

        etiketFiyati=indir(etiketFiyati,indirimOrani);// atama yapıldı
        //  System.out.println("indir(etiketFiyati,indirimOrani) = " + indir(etiketFiyati, indirimOrani));

        System.out.println("indirim sonrası etiketFiyati = " + etiketFiyati); // 100

    }

    private static double indir(double fiyat, double oran) {
        return fiyat*=(1-oran);
    }
}
