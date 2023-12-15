package j26_Abstract.Abstract02;

public class Runner {
    public static void main(String[] args) {
        Baklava havucDilimi=new Baklava();
        havucDilimi.madeIn();//TURKEY
        havucDilimi.taste();//good sugar sweet
        havucDilimi.name="dondurmalı kaymahhlı arkasından mırrraa";
        System.out.println("havucDilimi.name = " + havucDilimi.name);//dondurmalı kaymahhlı arkasından mırrraa

        System.out.println("   ***   ");
        SezarSalad s1=new SezarSalad();
        s1.name="gavur dağı";
        System.out.println("s1.name = " + s1.name);//gavur dağı
        s1.madeIn();//ITALY
        s1.taste();//sezarın hakkı SEZAR'A


    }
}
