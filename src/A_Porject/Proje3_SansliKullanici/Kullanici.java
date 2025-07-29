package A_Porject.Proje3_SansliKullanici;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Kullanici {
    String name;
    LocalDateTime kayitZamani;

    public Kullanici() {
    }

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani ;
    }
}
