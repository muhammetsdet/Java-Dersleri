package j23_Encapsulation.Encapsulation01;

public class C01_Encapsulation { public static void main(String[] args) {
        /*
		 	1) Encapsulation kisaca "data hiding" demektir

		 	2) Basarili bir Encapsulation için :
		 		a)Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
		 		b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
		     	karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
		 		c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

		 	3) Encapsulation yapısı  tanımlanması için
		 		a)Access modifier'lari private tanımlanmalı
		 		b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
		 	    update edilebilmeli(setter)	.
		 	    c) uygun constructor tanımlanmalı.
		 	    d) toString() method tanımlanmalı


		 	4) Encapsulation'in faydalari
		 		a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
		 		b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
		 	     tum classlar'dan istenildiği kadar kullanabiliri.
		 		c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
		 	    hale getirebilir.
		 		d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
		 	    (setter() olusturma) yapabilir.
		 	    ahan da  TRICK : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
		 	     data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

		 	5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

		 */

    C02_Encapsulation obj1 = new C02_Encapsulation();//p'siz const. call ile obj1 create edildi

    obj1.ad = "Abdullah";
    obj1.soyad = "Gakgo";
    //  System.out.println("obj1.idVer() = " + obj1.idVer());// 1001
    obj1.ad = "javaCAN";//encapsule edilmeyen variable obj ile call edilip update edilir
    //  System.out.println("obj1.mailVer() = " + obj1.mailVer());// ebikGabık@cimayıl.com
    System.out.println("obj1.getId() = " + obj1.getId());// 1001
    System.out.println("obj1.getMail() = " + obj1.getMail());// ebikGabık@cimayıl.com
    obj1.setMail("falanFilan@gmail.com");
    System.out.println("obj1.getMail() = " + obj1.getMail());// falanFilan@gmail.com

}
}
