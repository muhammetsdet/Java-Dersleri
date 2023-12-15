package j19_Constructor;

public class Insan {
    // fields-> obj variable
    String isim = "ademoglu";
    int yas;
    String babaAdi = "Hz Adem";
    char cinsiyet = 'e';

    // ahan da trick-> Class'da p'li const create edilince dafult const. ezilir...
    // istemirsa manual olarak p'siz default const. create edilebilir
    public Insan(String name, int age) {// 2 p'li const
        this.isim = name;

    }


    public Insan(String name, int age, String babaAdi, char cins) {//full parametirized telescopic const
        this.isim = name;
        this.yas = age;
        this.babaAdi = babaAdi;
        this.cinsiyet = cins;
    }


    public Insan(String isim, String babaAdi) {// 2 p'li const
        this.isim = isim;
        this.babaAdi = babaAdi;
    }

    public Insan() {//p'siz default const.gecekondu mutahit
    }

    

    public static void main(String[] args) {//main level

        Insan insn1 = new Insan("haluk", 49);//2 p'li const call edildi
        Insan insn2 = new Insan("Feride", 33, "Menderes", 'K');// full p2li const call edildi
        Insan insn3 = new Insan("Bahtiyar", "Ahmet");// 2 p'li conts call edildi
        Insan insn4 = new Insan();// p'siz default const call edildi
        System.out.println(insn4.isim + " " + insn4.babaAdi + " " + insn4.yas + " " + insn4.cinsiyet);//
        System.out.println(insn1.isim + " " + insn1.babaAdi + " " + insn1.yas + " " + insn1.cinsiyet);//
        System.out.println(insn2.isim + " " + insn2.babaAdi + " " + insn2.yas + " " + insn2.cinsiyet);//
        System.out.println(insn1.isim + " " + insn2.babaAdi + " " + insn3.yas + " " + insn4.cinsiyet);//
        System.out.println("insn2 = " + insn2);//j19_Constructor.Insan@1936f0f5->ref
    }//main sonu

}
