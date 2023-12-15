package A_Porject.Proje01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje02_Bakkal {
    /* * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
            * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
            * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları teker teker alıp gunlukKazanclar ArrayList'e ekle.
            * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
            * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
            *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *            ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
            *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *            ortalama kazançtan aşağıysa o günleri return yap.*/

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static Scanner scan = new Scanner(System.in);
    static List<Double> gunlukKazanclar = new ArrayList<>();

    public static void main(String[] args) {
        List<String> ortalamaUstuGunler = new ArrayList<>();
        List<String> ortalamaAltiGunler = new ArrayList<>();
        int i=0;
        while (i<7){
            System.out.println(gunler.get(i)+" gunu kazancinizi giriniz");
            double kazanc= scan.nextDouble();
            gunlukKazanclar.add(kazanc);
            i++;
        }
        for (int j = 0; j < gunler.size(); j++) {
            System.out.println(gunler.get(j)+" gunu kazanciniz : "+gunlukKazanclar.get(j));
        }
        double ortalama=getOrtalamaKazanc();
        int ort= (int) (ortalama*100);
        ortalama= (double) ort /100;
        System.out.println("Ortalama kazanc: "+ortalama);
        ortalamaUstuGunler=getOrtalamaninUstundeKazancGünleri(ortalama,ortalamaUstuGunler);
        System.out.println("Ortalaama ustu gunler: "+ortalamaUstuGunler);
        ortalamaAltiGunler=getOrtalamaninAltindaKazancGünleri(ortalama,ortalamaAltiGunler);
        System.out.println("Ortalama alti gunler: "+ortalamaAltiGunler);

    }

    private static List<String> getOrtalamaninAltindaKazancGünleri(double ortalama, List<String> ortalamaAltiGunler) {
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(ortalama>gunlukKazanclar.get(i)){
                ortalamaAltiGunler.add(gunler.get(i));
            }
        }
        return ortalamaAltiGunler;
    }

    private static List<String> getOrtalamaninUstundeKazancGünleri(double ortalama, List<String> ortalamaUstuGunler) {
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(ortalama<gunlukKazanclar.get(i)){
                ortalamaUstuGunler.add(gunler.get(i));
            }
        }
        return ortalamaUstuGunler;
    }

    private static double getOrtalamaKazanc() {
        double toplam=0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplam+=gunlukKazanclar.get(i);
        }
        return toplam/7;
    }
}
