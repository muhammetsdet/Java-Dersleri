package j23_Encapsulation.Encapsulation01;

public class C02_Encapsulation {//pojo Class-> obj kalıphane
    /*
   Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
   Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
   veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
   kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
   basit bir data objesi olabilirler. POJO'lar, genellikle diğer objeler veya bileşenlerle
    işbirliği yapmak için kuimport java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Başlangıç bakiyesi
        double bakiye = 1000.0;

        while (true) {
            System.out.println("********* ATM Sistemine Hoş Geldiniz *********");
            System.out.println("Lütfen bir işlem seçin:");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    // Bakiye görüntüleme
                    System.out.println("Mevcut Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    // Para yatırma
                    System.out.print("Yatırmak istediğiniz tutarı girin: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    if (yatirilanMiktar > 0) {
                        bakiye += yatirilanMiktar;
                        System.out.println("Başarıyla " + yatirilanMiktar + " TL yatırdınız.");
                    } else {
                        System.out.println("Geçersiz bir tutar girdiniz!");
                    }
                    break;
                case 3:
                    // Para çekme
                    System.out.print("Çekmek istediğiniz tutarı girin: ");
                    double cekilenMiktar = scanner.nextDouble();
                    if (cekilenMiktar > 0 && cekilenMiktar <= bakiye) {
                        bakiye -= cekilenMiktar;
                        System.out.println("Başarıyla " + cekilenMiktar + " TL çektiniz.");
                    } else if (cekilenMiktar > bakiye) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        System.out.println("Geçersiz bir tutar girdiniz!");
                    }
                    break;
                case 4:
                    // Çıkış
                    System.out.println("ATM sisteminden çıkış yapılıyor. İyi günler!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız! Lütfen tekrar deneyin.");
            }

            System.out.println();
        }
    }
}
llanılırlar ve bu nedenle data aktarım objeleri (DTO) olarak da adlandırılabilirler.
    */
    //1. step->fields :private
    String ad = "Sebnem hanım";
    private int id = 1001;
    private String mail = "ebikGabık@cimayıl.com";
    String soyad = "Güzel";

    // 3. step->getter() setter()
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    // public int  idVer(){//private id variable return eden public
    //     return id;
    // }
    // public String  mailVer(){//private id variable return eden public
    //     return mail;
    // }

        // 2. step-> const.


    public C02_Encapsulation(String ad, int id, String mail, String soyad) {//full p'li zengin const
        this.ad = ad;
        this.id = id;
        this.mail = mail;
        this.soyad = soyad;
    }

    public C02_Encapsulation() {//default p'siz fakir const.
    }
    // 4. step->toString()

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                        ", id=" + id +
                        ", mail='" + mail + '\'' +
                        ", soyad='" + soyad + '\'' ;
    }
}
