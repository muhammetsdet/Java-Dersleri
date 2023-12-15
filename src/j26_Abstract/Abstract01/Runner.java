package j26_Abstract.Abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic c1=new Civic();
        c1.motor();//Agam 1.6 eco motor neyine yetmir
        c1.kapi();//Agam elinde kalmasın yavas kapat
        c1.koltuk();//Agam koltukda ucuza kacıp kumaş  cakmışşsın :(
        c1.sunroof();//Agam keyfini bilirsen sunroofu açarsan böğrüne maaşallah yazdırısın
        c1.lastikEbat();//Agam 18' lastik kafi
        c1.isim="typeR";
        System.out.println("c1.isim = " + c1.isim);//c1.isim = typeR


        Accord a1= new Accord();
        a1.motor();//Agam 2.0 turbo motor cok yakar cabuk kaçar Hız felakettir :(
        System.out.println("a1.isim = " + a1.isim);//a1.isim = Seckin
        a1.koltuk();//Agam deri koltuk ter yapar pişik olmayasın
        a1.kapi();//Ağam gevurun malı mı yavaş kapatasan
        a1.sunroof();//Agam cuğara yakınca sunroof açmayı unutma

        Crv v1=new Crv();
        System.out.println(v1.isim = "4x4");
        //System.out.println("v1.isim = " + v1.isim);//v1.isim = 4x4
        v1.motor();//Agam 2.4 supr turbo motor arazi bekler seni 4x4
        v1.kapi();//Agam kapılar da kale gibin :)
        v1.koltuk();//Agam deri koltuk arazide daha temiz
        v1.sunroof();//Agam sunroof olmadan lux olmaz :(


    }
}
