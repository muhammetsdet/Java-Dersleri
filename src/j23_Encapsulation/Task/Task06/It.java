package j23_Encapsulation.Task.Task06;

import java.util.ArrayList;
import java.util.Scanner;

/*
  1- fieldları ad, soyad, yas olan bir It pojo class'ı create ediniz.
     2- fieldları okulAd, maxOgrenciSayisi,
        ArrayList cinsinden Öğrencileri olan bir Clarusway pojo class create ediniz,
     3- main metodunun olduğu OkulMain isimli bir class create ediniz.
     4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
        ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
 */
public class It {
    private String ad;
    private String soyad;
    private int yas;

    public It(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public It() {
    }

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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                        ", soyad='" + soyad + '\'' +
                        ", yas=" + yas ;
    }
}
