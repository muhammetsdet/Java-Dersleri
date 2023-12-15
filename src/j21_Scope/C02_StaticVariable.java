package j21_Scope;

public class C02_StaticVariable {//Class level
    static String firmaIsim = "Clarusway";//initial edilmiş static(Class) variable.
    static int firmaId;//initial edilmemiş(default) static(Class) variable.
    static boolean firmaIt;//initial edilmemiş(default) static(Class) variable.

    public static void main(String[] args) {//main level
            /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi bir objeye ait bir variable'in son degerini
         bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

     */
        System.out.println("firmaIt = " + firmaIt);//static variable doğrudan call -> false
        firmaIt = true;//static variable call edilerek value atandı
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);//ClassName ile static variable call edildi

        staticMethod();//static meth doğrudan call
        // non_staticMethod();//non_static meth doğrudan call edilemez:CTE


    }//main sonu

    public static void staticMethod() {//static method->uzaylı
        System.out.println("Agama static methoddan selamkeee :)");
        firmaId = 1001;//static variable static scope'a doğrudan call edildi
        C02_StaticVariable obj = new C02_StaticVariable();
        obj.non_staticMethod();//obj ile non_static meth static scope'a call edildi
    }

    public void non_staticMethod() {//non static method->sefil dunyalı
        firmaIsim = "QA tester";//static variable non-static scope'a doğrudan call edildi->Sebnem h : gunes her yere nufuz eder
        System.out.println("Agama static non_staticMethod selamkeee :)");
        staticMethod();//staticMethod non_static scope'a doğrudan call edildi

    }

}
