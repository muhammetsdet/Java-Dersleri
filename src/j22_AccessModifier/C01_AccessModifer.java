package j22_AccessModifier;

public class C01_AccessModifer {
    //Class level

    /*
     1)public
     2)protected
     3)default
     4)private
             1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
                Diğer class'lardan "private" class member'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
               "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
              için : a)Child class erişebilir. 	b)Child class degil ise erişilemez.

             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

     */
    private int privateYas = 33;
    int defaultYas = 21;// AcMo yazılmazsa default->default ise AcMo yazılmaz
    protected int protectedYas = 40;

    public int publicYas = 49;

    private C01_AccessModifer() {//private p'siz const.
        System.out.println("Agam'a private const. selamkeee :)");
    }

    public C01_AccessModifer(int ilkYas, int sonYas) {//public p'li const.
        System.out.println("Agam'a public const. selamkeee :)");

    }

    private static void privateMethod() {
        System.out.println("Agam'a private METH. selamkeee :)");


    }

    static void defaultMethod() {
        System.out.println("Agam'a protected METH. selamkeee :)");


    }

    // C01_AccessModifer obj1 = new C01_AccessModifer();//private const. kendi Class'ından call edilip obj create edilebilr.
}
