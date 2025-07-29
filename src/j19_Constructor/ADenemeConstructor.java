package j19_Constructor;

import j24_Inheritance.Task01.A;

public class ADenemeConstructor {
    String model;
    String renk;
    int yil;

    public ADenemeConstructor() {
        this.model="Bmw";
    }

    public ADenemeConstructor(String model,  int yil) {
        this.model = model;
        this.renk = renk;
        this.yil = yil;
    }
    public void yasKontrol(String renk){
        if(this.renk==null){
            this.renk="Red";
        }
    }

    public static void main(String[] args) {
        ADenemeConstructor c1=new ADenemeConstructor();
        ADenemeConstructor c2=new ADenemeConstructor("Volvo",2015);
        c2.yasKontrol(c2.renk);
        System.out.println(c2.model + " " + c1.renk + " " + c1.model + " " + c2.renk);

    }
}
