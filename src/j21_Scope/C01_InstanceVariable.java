package j21_Scope;

public class C01_InstanceVariable {
    //Class level
    static String kurs = "Clarusway";// initial edilmiş Class (güneş)variable
    static String prLanguage;// initial edilmemiş(default) Class (güneş)variable

    int yas = 49;// initial edilmiş object variable
    int tecrube;// initial edilmemiş(default) object variable:0
    String isim;// initial edilmemiş(default) object variable:null
    boolean developer;// initial edilmemiş(default) object variable:false
    double boy;// initial edilmemiş(default) object variable:0.0
    char unvan;// initial edilmemiş(default) object variable:' '

    public static void main(String[] args) {//main level
 /*												INSTANCE VARIABLE

     1) Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
         olusturulan variable'lara non-Static Class level "instance variable" denir.
     2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
     3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
         Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
         Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
             "yas" variable'i initialize edildi, digerleri initialize edilmedi.
     4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                 byte, short, int, long icin default value 0'dir.
                 float, double --> default value 0.0'dir.
                 char --> default value ' ''dir.
                 boolean --> default value false'dur.
                 String --> default value "null" dir.

 */

        // static int kg=99;//Class level haric main veya meth level'da static variable tanımlanamaz:CTE

        int kg = 100;//initial edilmiş LOCAL VARİABLE
        int id;//initial edilmemiş(default) LOCAL VARİABLE
        // System.out.println("id = " + id);//initial edilmemiş variable local'inde action alamaz:CTE
        id = 1001;//local variable value atandı
        System.out.println("id scope içinde doğrudan call edildi = " + id);// value atanan local variable call edilerek  action aldı
        // System.out.println("yas = " + yas);//obj(inst) variable obj olmadan doğrudan call edilemez:CTE
        prLanguage = "Java";//Class(static) variable doğruadan call edilerek value ataması yapıldı.
        System.out.println("prLanguage static variable dobj olmadan doğrudan call " + prLanguage);
        staticMethod();//static meth doğrudan call edildi
        // non_staticMethod();//non_static meth doğrudan call edilemez:CTE
        C01_InstanceVariable obj1 = new C01_InstanceVariable();//obj create edildi
        obj1.non_staticMethod();//non_static meth obj ile  call edildi
        System.out.println("obj1.boy = " + obj1.boy);//obj ile inst. variable call edildi
        System.out.println("obj1.kurs = " + obj1.kurs);//bad practice->obj ile static variable call edilemez
        // obj1.id // local variable obj ile call edilemez: CTE
        System.out.println("id = " + id);//local variable obj olamadan doğrudan call edilebilir
    }//main sonu

    public static void staticMethod() {//static method->uzaylı
        System.out.println("Agama static methoddan selamkeee :)");
    }

    public void non_staticMethod() {//non static method->sefil dunyalı
        System.out.println("Agama static non_staticMethod selamkeee :)");
    }
}
