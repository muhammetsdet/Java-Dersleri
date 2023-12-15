package j19_Constructor;

public class C05_Arac {//obj kalıphane

    //fields->obj-inst variable
    //Fields-> obj'nin uretilirken alacagı değer variables bir class'da bir den çok cons tanımlanabilir
    String model;
    int maxHiz;

    public C05_Arac() {//p'siz sefil const->Fakir muth.

        System.out.println("Agam bu yazıyı okuduysan p'siz const call edilmiştir...");
    }

    public C05_Arac(String model) {//1 p'li const
        this("haci murat", 124);// full p'li const call edildi.
        // this();//p'siz const call edilemedi->CTE
            /*
             1) Constructor icinden baska bir Constructor call  icin "this()" kullanılır.
                this() keyword mutlaka constructor body'nin ilk satirına yazılmalı
                Aksi takdirde CTE verir
            2) Bir Constructor icinden sadece bir tane Constructor call  yapılır.Cunku birden cok const. call edilirse
                birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */
        this.model = model;
        System.out.println("Agam bu yazıyı okuduysan 1 p'li const call edilmiştir...");
    }

    public C05_Arac(String model, int maxHiz) {//full p2li const->zengin muth.
        this();//const mutlaka body'nin ilk satırında olmalı yoksa CTE
        this.model = model;
        //  this("hacı VOLVO");//const mutlaka body2nin ilk satırında olmalı yoksa CTE
        this.maxHiz = maxHiz;
        System.out.println("Agam bu yazıyı okuduysan Full p'li const call edilmiştir...");
    }
    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", maxHiz=" + maxHiz ;
    }
}
