package j24_Inheritance.Inherirance02;

public class Hayvancik {//Grand-parent (super) Class -> dede Class
    int a;//default int type inst. variable
    int m=3;//initial int type inst. variable

    public Hayvancik() {//p'siz default const
        System.out.println("Agam ahan da HAYVANCIK p'siz const call edildi :) ");
    }

    public Hayvancik(int x) {//1 p'li const.
        System.out.println("Agam ahan da HAYVANCIK p'li const call edildi :) ");
    }

    public  void mA(){
        System.out.println("mA -> HAYVANCIK Class meth. call edildi :) ");

    }
    public  void mM(){
        System.out.println("mM -> HAYVANCIK Class meth. call edildi :) ");

    }

}
