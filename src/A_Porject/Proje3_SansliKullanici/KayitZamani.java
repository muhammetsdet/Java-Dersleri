package A_Porject.Proje3_SansliKullanici;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KayitZamani {
        static ArrayList<Kullanici> kullanicilar = new ArrayList<>();


        public ArrayList<Kullanici> kayitAl() {
                System.out.println("İsminizi giriniz");
                Kullanici obj=new Kullanici(new Scanner(System.in).nextLine(), LocalDateTime.now());
                kullanicilar.add(obj);
               return kullanicilar;
        }

        public void sanslıkullaiciBul(ArrayList<Kullanici> kullanicilar) {
for (Kullanici each:kullanicilar){
        if(each.kayitZamani.getSecond()<=10){
                System.out.println(each.name + " Şanslı kullanıcı şeçildiniz tebrikler" + each.kayitZamani);
        }else{
                System.out.println(each.name + " MALESEF " + each.kayitZamani);
        }
}

        }

        public void listele(ArrayList<Kullanici> kullanicilar) {
                for (Kullanici each : kullanicilar) {
                        System.out.println(each);
                }
                //System.out.println(kullanicilar); Liste halinde verecek yukardaki tek tek verecek
        }
}
