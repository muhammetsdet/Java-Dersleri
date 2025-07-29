package j23_Encapsulation.Task.Task06;

import java.util.ArrayList;
import java.util.Scanner;

import static j23_Encapsulation.Task.Task06.Clarusway.list;

public class SchoolMain {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Clarusway c1=new Clarusway();
        System.out.println("okul adi giriniz");
        c1.setOkulAd(scan.nextLine());
        System.out.println("max ogrenci sayisini giriniz");
        c1.setMaxOgrenciSayisi(scan.nextInt());

        for (int i = 0; i < c1.getMaxOgrenciSayisi(); i++) {
            It ogrenci1=new It();
            System.out.println(i+1+". ogrenci adi : ");
            ogrenci1.setAd(scan.next());
            System.out.println(i+1+". ogrenci soyadi : ");
            ogrenci1.setSoyad(scan.next());
            while (true){
                try{System.out.println(i+1+". ogrenci yasi : ");
                    ogrenci1.setYas(scan.nextInt());
                    if(ogrenci1.getYas()>15){
                        throw new IllegalArgumentException();
                    }else{break;}}
                catch (IllegalArgumentException e) {
                    System.out.println("15 yasindan buyuk ogrenciler kayit edilemez tekrar deneyiniz");}
            }
            list.add(ogrenci1);
        }
        System.out.println(list);
    }
    }


