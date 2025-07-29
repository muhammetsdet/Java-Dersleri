package ATricks;

public class GenelTricks {
    public class Atrick {
        public static void main(String[] args) {
        /*

-->double yazdığığımız bir sayısı float'ta göstermek istersekl float m =2.3f; yazarsak çıktısını alırız.
-->Class ismi mutlaka büyük harfle başlamalı, eğer class name birden fazla kelimeden oluşuyorsa
sonraki kelimelerin ilk harfleri de büyük yazılmalı. (CamelCase)
-->Method ismi mutlaka küçük harfle başlar, eğer method name
birden fazla kelimeden oluşursa sonraki kelimelerin ilk harfleri büyük yazılır. (camelCase) myFirstMethod
-->Java dilinde isimlendirmeler için bazı standartlar oluşturulmuştur.
Class: Sınıf için upper camel case kullanılır.
Örnek: HelloWorld
Methodlar: Methodlar için lower camel case kullanılır.
Örnek: helloWorld
Veriables: Değişkenler için lower camel case kullanılır.
Örnek: helloWorld
Sabitler: Sabitler için screaming snake case kullanılır.
Örnek: HELLO_WORLD
-->JAVA variable isimleri case sensitive (Büyük küçük harfe duyarlıdır)
 “money”, “Money” veya “MONEY” birbirinden farklı derlenir.
-->Variable bellekte (memory) ayrılmış olan alanın (Reserved Area) adıdır.
 Variable içinde değer saklayan bir kutudur. (Container).
-->float sayıların sonunda “ f ” konulmalıdır, yoksa JAVA sayıyı double olarak derler
-->Wrapper Class’lar primitive(ilkel) veri türleri olan int, float, short, long vs. gibi
türleri birer nesne (object) olarak kullanarak method uygulama imkanı
sağlar.
-->Auto Widening (Otomatik Genişletme)
Dar veri tipinden daha geniş bir veri tipine atama yapıldığında JAVA Type Casting otomatik olarak yapar.
byte age = 33;
short yas = age; à 33
int kuru = yas; à 33
float omur = kuru; à 33.0
double hayat = omur; à 33.0
byte-->short-->int-->long-->float-->double

Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                         byte < short < int < long < float < double
           Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
           Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.

-->Narrowing Casting bazen veri kaybına sebep olur, bazen de veriyi kendi sınırları içinde kalan başka bir veriye
dönüştürebilir.
-->
-->& işareti kullanıldığında Java matematiksel değerlerin hepsini kontrol eder buda zaman kaybına neden olur
ancak && işareti kullanılırsa Java ilk bulduğu yanlışta hata atar. 40>50 && 50=50 && 70>33
-->öncersinden tanımlana bir variable tekrara tanımlanamaz... CTE
-->Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'yde depolanır. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" çalışır.


        PRIMITIVE DATA TYPE - NON-PRIMITIVE  DATA TYPE  FARKLARI...
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk kullanılır.
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
-->Bir variable'a değer ataması yapılırken data type ugun değer atanmalı aksi takdirde CTE alınır
-->Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
--> char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
-->Javada String güçlğü bir Class'dır.Bir + işlemi için String varsa işlem önceleğine göre
        (mürekkep) concatenation(birleştirme) yapar.
-->cahr int ile ascci değer  toplama String ile  concat edilir.
-->Java primitive lere method'lar ekleyerek yeni bir
                 yapi olusturdu, bu yapiya "Wrapper Class"
                  Primitive         Wrapper
                    byte     ==>    Byte
                    short    ==>    Short
                    ** int   ==>    Integer
                    long     ==>    Long
                    float    ==>    Float
                    double   ==>    Double
                    boolean  ==>    Boolean
                    ** char  ==>    Character
                    non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
-->Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
    Scanner Class'i Java nin util kutuphanesindedir.
-->Math.abs(a)
         Girilen degerin mutlak degerini verir.

        Math.max(a, b)
        Girilen iki degerden buyuk olani verir.

        Math.min(a, b)
        Girilen iki degerden kucuk olani verir.

        Math.round(a)
        Girilen degerin en yakin tamsayiya yuvarlar.

        Math.sqrt(a)
        Girilen degerin karekokunu verir.

        Math.pow(a, b)
        Girilen a ve b degerini a uzeri b olarak verir.

        Math.ceil(a) 3.1 => 4
        Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

        Math.floor(a) 3.7 => 3
        Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
--> int abdYas=30;
        System.out.println("abdYas+5 = " +( abdYas + 5));//35-> = atama yapılmadıgı için abdYas değerei hala 30 ama 5 fazla print edildi
        System.out.println("abdYas = " + abdYas);// 30
        System.out.println("abdYas+=11 = " + (abdYas += 11));// 41-> abdYas 11 eklenerek atama yapıldı
        System.out.println("abdYas = " + abdYas);// 41
-->s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
    s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve
     String constant pool üzerinde aynı adresi gösterirler.
     Böylece ekrana TRUE yazdırır.

        String s1 = "Musa Bey";
        String s2 = "Musa Bey";
        String s3 = "Musa Beye";
        System.out.println(s2 == s1);// true
           String s3=new String("Musa Bey");
           System.out.println(s2 == s3);//false
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->
-->

         */

        }
        }
    }

