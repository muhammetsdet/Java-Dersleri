package j16_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
                   /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

         */
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD  create ediniz.
        double fiyat=100;// double data type primitive variable

        System.out.println("meth call öncesi fiyat :"+fiyat);//100

        System.out.println("fiyatArttir(fiyat) = " + fiyatArttir(fiyat));// meth call-> fiyatınızın artmiş hali : 124

        fiyatAzalt(fiyatArttir(fiyat));

        fiyatAzalt(fiyat);

        System.out.println("meth call sonrası fiyat :"+fiyat);//100

    }// main sonu

    private static double fiyatArttir(double fyt) {
        return fyt*=1.24;
        //System.out.println("fiyatınızın artmiş halşi : "+fyt);
    }
    private static void fiyatAzalt(double fyt) {
        fyt*=0.76;
        System.out.println("fiyatınızın artmiş halşi : "+fyt);
    }
}
