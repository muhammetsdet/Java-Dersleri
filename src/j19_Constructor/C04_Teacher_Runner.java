package j19_Constructor;

public class C04_Teacher_Runner {//lokomotif-> motor olan runner  Class

    public static void main(String[] args) {
        C04_Teacher t1 = new C04_Teacher("Musa", "yalcın", "Qa", 123, 5, 33000, false);
        System.out.println("t1 = " + t1);//t1 = ad='MUSA', soyad='YALCIN', brans='Qa', id=123, tecrube=5, maas=39600.0, emekli=false


        t1.emekli = true;
        System.out.println("t1 = " + t1);//t1 = ad='MUSA', soyad='YALCIN', brans='Qa', id=123, tecrube=5, maas=39600.0, emekli=true
        t1.tebrik();// obj non-static meth call edildi
        //t1.maasHesapla();// static meth obj ile değil meth name ile ya da improt ile call edilir

        //maasHesapla();//static meth imprt ile call edildi
        C04_Teacher.maasHesapla();//static meth Class name ile call edildi
        C04_Teacher t2 = new C04_Teacher("Haluk", "bilgin", "Dev", 111, 12, 77000, false);
        System.out.println("t2 = " + t2);//
    }
}
