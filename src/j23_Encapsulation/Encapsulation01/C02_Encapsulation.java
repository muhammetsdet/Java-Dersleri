package j23_Encapsulation.Encapsulation01;

public class C02_Encapsulation {//pojo Class-> obj kalıphane
    /*
   Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
   Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
   veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
   kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
   basit bir data objesi olabilirler. POJO'lar, genellikle diğer objeler veya bileşenlerle
    işbirliği yapmak için kullanılırlar ve bu nedenle data aktarım objeleri (DTO) olarak da adlandırılabilirler.
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
