package A_Porject.Proje3_SansliKullanici;

import java.util.Scanner;

public class AppMenu {
    public  void giris() {
        System.out.println("Lütfen işleminizi seçiniz :\n" +
                "1-Kullanıcı Kayit Al\n" +
                "2-Sansli Kişi Bul\n" +
                "3-Listele\n" +
                "0-Çıkış");

        System.out.println("Seçimizi giriniz : ");
      KayitZamani obje =new KayitZamani();
try{
switch (new Scanner(System.in).nextInt()) {
    case 0:
        cikisSansli();
        break;
        case 1:
obje.kayitAl();
giris();
break;
    case 2:
        obje.sanslıkullaiciBul(KayitZamani.kullanicilar);
        giris();
        break;
    case 3:
        obje.listele(KayitZamani.kullanicilar);
        giris();
        break;
    default:
        System.out.println("Hatalı giriş yaptınız");
        giris();
}}catch(Exception e){
    System.out.println("Hatalı giriş");
    giris();
}

    }

    private void cikisSansli() {
        System.out.println("Çıkış yapıyorsunuz. Yine Bekleriz");
    }
}
