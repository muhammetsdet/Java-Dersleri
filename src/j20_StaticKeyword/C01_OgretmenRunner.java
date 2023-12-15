package j20_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen t1 = new C01_Ogretmen("Feride", 11);
        System.out.println("t1.isim = " + t1.isim);//obj ile inst. variable call edildi->  Feride
        System.out.println("t1.tecrube = " + t1.tecrube);//obj ile inst. variable call edildi->11
        t1.evliliktebrikET();//obj ile non-static meth call edildi->Agam bi yastıkta gocayasınız
        t1.maasHesapla();//obj ile static meth call edilddi->bad practice->Agam mayışın helali hoş olsun tıksırıncaya kadar afiyet olsun
        C01_Ogretmen.maasHesapla();//ClassName ile static meth call edildi -> best practice->Agam mayışın helali hoş olsun tıksırıncaya kadar afiyet olsun

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);// ClassName ile static(Class) variable call edildi->Cambridge
        C01_Ogretmen.okul = "Kabatas";// ClassName ile static variable update edildi

        System.out.println("t1.okul = " + t1.okul);//obj ile static variable call edildi->Kabataş


        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);// ClassName ile static(Class) variable call edildi->Cambridge

        C01_Ogretmen t2 = new C01_Ogretmen("Sennur", 9);

        System.out.println("t2.isim = " + t2.isim);//
        System.out.println("t2.tecrube = " + t2.tecrube);

        System.out.println("t2.okul = " + t2.okul);//obj ile static variable call edildi->Kabataş

    }
}
