package A_Porject.Proje4_Kitapci;

import java.util.HashMap;
import java.util.Map;

public class Kitap {

    private String name;
    private String yazar;
    private int fiyat;

    public Kitap() {
    }

    public Kitap(String name, String yazar, int fiyat) {
        this.name = name;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    public String getName() {
        return name;
    }

    public String getYazar() {
        return yazar;
    }

    public int getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", yazar='" + yazar + '\'' +
                ", fiyat='" + fiyat ;
    }

}
