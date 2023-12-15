package j19_Constructor;

public class C02_Arac {
    //fields... ins. variable->obj variable
    String marka;
    String model;
    int km;
    int motorHacim;
    boolean vitesAuto;
    boolean ikiciEl;
    int yil;

    public C02_Arac(String marka, String model, int km, int motorHacim, boolean vitesAuto, boolean ikiciEl, int yil) {//full p'li telescopic const
        this.marka = marka;
        this.model = model;
        this.km = km;
        this.motorHacim = motorHacim;
        this.vitesAuto = vitesAuto;
        this.ikiciEl = ikiciEl;
        this.yil = yil;
    }

    public C02_Arac() {// p'siz sefil basit adi iğrenc const
    }

    @Override
    public String toString() {// obj girlen field'larını String'e cevirir
        return
                "marka='" + marka + '\'' +
                        ", model='" + model + '\'' +
                        ", km=" + km +
                        ", motorHacim=" + motorHacim +
                        ", vitesAuto=" + vitesAuto +
                        ", yil=" + yil;
    }

    public static void main(String[] args) {//main level
            /*
        Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciEl,yıl olan
         3 obj  create ederek fields print eden code create ediniz.
         */

        C02_Arac a1 = new C02_Arac();//p'siz default cons call ile a1 obj create edildi.
        a1.marka = "Volvo";
        a1.model = "xc90";
        a1.yil = 2015;
        a1.ikiciEl = true;
        a1.km = 150000;
        a1.motorHacim = 2400;
        a1.vitesAuto = true;
        //                  volvo             xc90            2015            true                 2400                true            150000
        System.out.println(a1.marka + " " + a1.model + " " + a1.yil + " " + a1.ikiciEl + " " + a1.motorHacim + " " + a1.vitesAuto + " " + a1.km);

        C02_Arac a2 = new C02_Arac("BMW", "7.40", 333000, 4000, true, false, 2020);


        System.out.println(a2.marka + " " + a2.model + " " + a2.yil + " " + a2.ikiciEl + " " + a2.motorHacim + " " + a2.vitesAuto + " " + a2.km);
        System.out.println("a2 = " + a2);//  j19_Constructor.C02_Arac@2096442d
        System.out.println("a1 = " + a1);//  j19_Constructor.C02_Arac@2096442d


    }//main sonu

}
