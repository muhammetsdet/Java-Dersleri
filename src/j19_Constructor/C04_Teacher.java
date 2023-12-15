package j19_Constructor;

public class C04_Teacher {
    // obj create edilen kalıphane Class
    //Fields
    String ad;
    String name;
    String soyad;
    String brans;
    int id;
    int tecrube;
    double maas;
    boolean emekli;

    public C04_Teacher(String ad, String soyad, String brans, int id, int tecrube, double maas, boolean emekli) {
        name = ad.toUpperCase();
        //  name = ad.toUpperCase();
        this.soyad = soyad.toUpperCase();
        this.brans = brans;
        this.id = Math.abs(id);
        this.tecrube = tecrube;
        this.maas = maas * 1.2;
        this.emekli = emekli;
    }

    public C04_Teacher() {
    }

    /*
        Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
        this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
         Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
          Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.
         */
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", ad='" + ad + '\'' +
                        ", soyad='" + soyad + '\'' +
                        ", brans='" + brans + '\'' +
                        ", id=" + id +
                        ", tecrube=" + tecrube +
                        ", maas=" + maas +
                        ", emekli=" + emekli;
    }

    public static void maasHesapla() {// sctatic meth
        System.out.println("maasınız hayırlı olsun");
    }

    public void tebrik() {//non-static meth
        System.out.println("yeni işiniz hayırlı olsun ");
    }
}
