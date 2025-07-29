package j32_Enum.enum04;

public enum Aylar {

    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int gunSayisi;

    Aylar(int gunSayisi) { //enum field'lara parametre tanımlandı
        this.gunSayisi = gunSayisi;//Bu olmaz ise yukarda int gunSayisi default değeri verir yukardaki MAYIS ile entegre çalışmaz.
    }
    void gunMiktarı(){
        System.out.println(gunSayisi);
    }
}
