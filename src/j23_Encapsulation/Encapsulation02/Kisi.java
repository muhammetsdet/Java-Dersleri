package j23_Encapsulation.Encapsulation02;

//pojo Class

public class Kisi {//pojo Class
    /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */
    // 1. step->fields
    private String ad;
    private String soyad;
    private String password;
    private int yas;

    // 2. step-> const


    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        //this.yas = yas;
        //  this.yas = Math.abs(yas);
        setYas(yas);//meth call
    }
    // 3. step->getter-setter

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

    //  public void setPassword(String password) {
    //      this.password = password;
    //  }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);

    }
    // 4. step-> toString

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + yas +
                '}';
    }
}