package ATricks;

public class TricksImportantNowledge {
    public static void main(String[] args) {
        /*
        -->  Javada List veya Array'ın elemanları update edildiğinde kalıcı olarak değişir. List ve Array'ın kedinsi değişmez ancak elemanları kalıcı olarak değişir.
--> PassByValue bir programlama dilidir.
--> == aynı typleri çalışır yoksa compile time alır altı kızarır
-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
--> Fieldler objeye değer atamsı yapar consturctor
-->Clas ismiyle aynı ismi taşıyan kod bloğuna construcrtor denir.
--> Fieldlar değerini her zaman objeden alır.
-->instance obje veriablelarıdır ve class levelda olurlar ve nonstatictirler
--> This classta variable i işaretler.
-->Constructorlarda recursive olmaz
-->Static class variable hem class name(best practice) hem object(bad practice) ile erişilebilir.
-->Static olmayanlar ancak obje ile çağrılır.
-->Java yukarıdan aşapıya sağdan sola (derler) complier eder sağdan sola atama yapar.
-->Static blocklar constructor ve tüm methodlardan ve mainden önce çalışır.
-->Class kullanırsak class variable obje kullanırsak obje variable kullanılır.
-->Static blocklar static varible yani class variable update etmek için üretilir.
-->Değer ataması yapmadan bir obje tanımlayabiliriz ama bu durumda bu objeyi kullanamayız
-->javada kontrol mekanizması denildiğinde access modifier akla gelmeli
-->Clas  üyeleri variable method constructor'dır
-->Objeyi her zaman construstor üretir ama data tipi farklı olabilir.
Clarusway qa =new QaTester();
Data type          Construstor
-->Bir şey tanımlarken tipini vermek gerekir qa=new... olmaz string qa=... veya Claruswat qa=new... olmalı
-->Bir objenin constructor'ı değişmez ama data type değişebilir. Bu polimorfizmdir. List<String> list=new ArrayList<String>(); gibi list değişir ArrayList olabilir ama sağdaki ArrayList değişmez
-->Inheritanca'da variable getirirken data type'a bakar  ancak methodda constructor'a bakar ordan getirir.
-->Method header'da Merhod signature dan başlayarak parameter'a kadar bize aittir ancak oraya kadar zorunlu yazılması gerekir.
-->Parametrenin 1--Sayısı 2-- Sırası 3--Tipini değiştirebiliriz ve değiştirince havuzu değişir method overload olur. Java return type göre methodları ayırt edemez cte verir.
-->Aynı isim iki method iki farklı şekkilde üretilir 1-Overlodading 2-Overriding ile.
-->Java'da multiple inheritance youtur multi-level vardır.
--> Override edilen methodlarda header'a ve signiture dokunulmaz değişen aksiyondur. Override için inherite olması gerekir ancal oveload için inheritiance mecbur değildir.
-->Getir ve stter'da variable getirilir method gelmez.
-->Private methodlar override edilmez. Çünkü prive class'ı korur o yüzden başka yerden getirilmez. Özel bir şey miras olmaz
-->Override methodlarr access levellerini yükseltebbilir ama düşüremez.
-->Overloading'te signiture değişir overriding'te ise body değişir.
-->Overloading CTE(Static)  çalışır overriding RTE(Dynamic) çalışır.***
-->OOP deyince 4 ana başlık 1-Encapsilation 2-Inheritance 2-Polymorphism 4-Abstract
-->Final ovirride edilmez. Son olan bir şey değişemez.
-->Construtor call ederken recursive olmaz. CTE verir.
-->Aynı constructordan farklı data type üretmeye polymorphism denir.
-->Static variballar obje ile değil class ismi ile çağrılır best practice'dir.
-->typeler arasi geçiş methodla olur.
-->Error her zaman TRE de tespit edilir. Her zaman unchecked durumundadır. Handle edilmez. Kodla değil daha çok donanımla alakalıdır. Stop execition verir.
-->final variablelere ilk değer atamsı initialeze mutlaka yapılmalı yoksa CTE verir.
-->Finalize etmek için finalize() methodunu call edilir ve method'un ne zaman run edileceğine Java hash code ile arka planda kendisi belirler.
-->Finalize sadece garbage collctorda kullanılır.
-->Abtract class'lardaki constructor obje üretmek için değil polymosrphism'e data tanımlamak için objeyi daha güçlü kılmak içim kullanır.
-->Static class abstract olamaz
-->Abstract class'ta obje olmadığı için implmenet yoktur. İmplement'in tek amacı objeyi güçlendirmek ekstra özellik vermek içindir.
-->Interface constructor bulunduramaz.
-->Interface de methodlar aynı direk yazılır ama final variable'da nerden değerini aldığını belirtmek gerekir obje ile getirilemez.
-->Interface de methodla default keyword veya static keyword kullanılır. Concreate method'da default method obje ile static method method (Interface) name ile call edilir
-->Interface yapıda main method create edilir ancak bad practice'dir.
-->Aynı data type ve name variable interface name ile call adilir yoksa nerden değer aldığını bilemeyiz (Final variballar).
-->OOP 4 özellikle anlatılabilir 1-->Klas üyelerine erişimi sınırlayabiliriz (Ecxapsulation)
2-->Baska bir clası parent yapıp kendimize inherit edebiliriz (Inherit)
3-->Bir obje tanımlandığı kıyaslandığı clasa göre özellikler taşıyabilir.
4-->Child classlar parenttan aldıkları özellikleri kendine uyarlayabilirler.(Overriding)
-->For each kalıcı değişiklik yapmaz ama ıterator kalıcı değişiklik yapar
-->Fori de index var ancak for each te mevcut değil
-->Iterator sadece remove yapar listIterator de Crud vardır.
-->For each'te index yapıs yok fori de index yapısı var index yapısı for eachte olmadığı için ıterators'ü kullanıyoruz.
-->LİnkedList silmede ve eklemede hızlıdır çünkü direk sonu siler ve sona ekler ama diğer aksiyonlarda index olmadığı için yavaştır.
-->Constructor class olmak zorunda data teype değişebilir.
-->Sipecific data çalışmak her zaman aplicationı hızlandırır
--> remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException
-->Methodlar ve package'ler küçük harfle yazılır.
-->Köşeli parantez collctiondır ancak mepler süslü parantezle kullanılır. Maplar interface'dır implement edilmesi gerekli methodlar vardır.
-->İntelijden Github'a yeni bir doasya eklediğimizde seknonize etmiş oluruz. Her bir  sekronize et emrine versiyon deniyor.
sekronize edebilmem için ise önce gtihub'ta bir versiyon oluşturmalı sonra masa üstümden uzak masaüstündeki repomu sekron etmeli.
demekkki sekron benim projemi yedeklediğimin her bir adımı. önce verisyon oluşturup sonra sekron ederek uzak repoma göndermiş oluyorum.
masa üstümdeki oluşturduğumuz klasör kodlar vs uzak masa üstündeki reposteriyle sekronanizosyanı git sağlar.
1-Local repo oluşturma git init
2-Klasörümüzdeki tüm dosyaları localdaki repoya yükleme  ***git add. *** ile sağlanır.
3-Local repoda version oluşturma git commit -m "isim" ile sağlanır.
4-remote repoyu github'da oluşturma

-->1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
        olan bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
-->Lambda collectionla çalışır.
-->Terminal işlemlerinden sonra lambdanın methodları çaprılamıyor ancak ara işlemlerden sorna çaprılabilir.
-->Filter her zaman boolean olmalı(if özelliğine benziyor kolulla çalışıyor)
-->Lmabdada best practice method referance ile yazmak
-->Stream collectiondan gelen elemanları tek tek akışa alındığı ve yapmak istediğimiz işlemi lambdaya girmemizi sağlayan kısımdır.
-->reduce methodunun Optional diye collection dönüş değeri vardır. Yoksa elimize alıp işlem yapamayız. Fılter kısmından null değer gelebilir o yüzden int null olamayacağı için optional kullanırız.
-->Optional lambda ile javaya gelen bir özelliktir.
-->Verilerin depolandağı sanal serverlara data base denir.
-->CTE-> Lambda expression ve method. ref aynı pararmetrede tanımlanamaz.(System.out.println(sayiList.stream().filter(t -> t > 58 && SeedMethods::ciftMi).reduce(Integer::min)))
-->Lambda da sk'p methodu da stream döndüğü için ya list yada array yapıp döndürmek gerekiyor.
-->range methodunun dönüş değeri IntStream'dir.
-->hayalet method yada komut somut aksiyonu olmayan ama indexlemede ve kod akışında istediğimiz sırada gitmesi içim kullanılabilir.
-->initialize eilmemiz construction'ı kullanamazsınız çünkü değersiz yazdırmaz kullandırmaz. null pointer'a eşitlesek bile NullPointerException hatası verecektir.
-->Constructor objelere ilk değer atamamızı sağlayan kod bloklarıdır. Bazıları özel bir methoddur diye tanımlama yapıyor.
-->Contructor da clas ismi ile yanı olmalı ve return type olmamalıdır.
-->Her bir class obje oluşturulabilecek bir kalıptır.
-->Parametretiz constructor ile default constructor aynıdır tek farkı birini biz diğerini java arka planda oluşturmuştur.
-->Object olusturmadan instance variable'a ulasilamaz.
--> boolean --> default value false'dur.  String --> default value "null" dir.
-->"default"  "package private" sağlar
-->Class'lar için  sadece "public" ve "default" access modifier kullanilir.
 Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.
-->Default'ın value'su constructor'ı ve Access MOdifiers'ı mevcuttur.
-->TRICK : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
    data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.
-->Set'ler void get'ler return typle'lı oluyor.
-->Constructor obje üretir. Constructor'da ne void ne de return type vardır bu methodla ayıran en önemli özelliktir.
-->Constructor erişim belirleyici mutlaka public olması gerekir.
-->Fieldslar objeye değer atar
-->Farklı scopelar'a aynı isimde obje create edilebilir. İstenilen scope istenildiği kadar obje create edilebilir.
-->Obje değerini her zaman fieldslardan alır. Objeler heap memoride üretilir dolayısyla referansı vardır ve direk yazdırılırsa referans değerini alır
-->Sol taraf decleration sağ taraf assignment
-->Değer ataması yapılmayan valuesu oluşmayan bir objeyi veya variable'ı aksiyona sokayamayız RTE alırız.
-->Static method ya clas name ile yada import edilerek çağrılır. Obje ile çağrılırsa bad practice olur.
-->This class da variable'ı işaretler çünkü variable objeye değerini verir.
--> this() keyword mutlaka constructor body'nin ilk satirına yazılmalıAksi takdirde CTE verir
-->Static  block'lar constructor'lardan, tüm methodlardan ve main method'dan önce çalışır.
-->Bütüm objeleri etkilemesini istediğimiz bir sabit aksiyon için static block'la yaparız. Static bir okul ismi değişecekse static block'la bunu gerçekleştiririz.
-->Variabler 3'e ayrılır 1-Static 2-İnstanse(Objeye değer veren variable'dır) 3-Local Variable
-->Bir obje üretildiği clas'ın özelliklerini taşır

-->ASLOLAN BİR YERDEN BAŞLAMAKTIR GELİŞİM ARKASINDAN GELİR

-->Objenin pasif ozelliği instance variable classtan gelen class variabledır.  Aktif özelliği ise methodlardır.
-->Local variable default değer almaz. Tanımlanan local variable değer atanmadan kullanılırsa CTE hatası alır. int id;//initial edilmemiş(default) LOCAL VARİABLE
        // System.out.println("id = " + id);//initial edilmemiş variable local'inde action alamaz:CTE
--> // static int kg=99;//Class level haric main veya meth level'da static variable tanımlanamaz:CTE
-->obj(inst) variable obj olmadan doğrudan call edilemez:CTE
--> staticMethod();//static meth doğrudan call edildi
        // non_staticMethod();//non_static meth doğrudan call edilemez:CTE
        C01_InstanceVariable obj1 = new C01_InstanceVariable();//obj create edildi
        obj1.non_staticMethod();//non_static meth obj ile  call edildi
-->local variable obj ile call edilemez: CTE
        System.out.println("id = " + id);//local variable obj olamadan doğrudan call edilebilir
                                         ----->03.01.2024
-->Obje kukkanılacak yerde üretilir başka yerde kullanılamaz.
-->Access Modifier kontrol mekanizmasıdır. Private class'ı korur default package'ı korur
-->Claslar için sadece public ve default Access Modifier kullanılır, private veya protect kullanılmaz.
-->Protect ile hem kendi package hemde akraba olduğun package ile işleme girersin
-->Access Modifier yazılmazsa default ve default ise Access Modifier yazıılmaz.
-->Default package içerisi protect package içi ve akraba ilişkisi private class içerisi public hepsine erişim sağlar.
-->Farklı packageden public olmayan erişemez CTE alır sadece akraba ilişkisi olanın istisnası vardır.
-->Static ama Class name ile call edilemeyen private meth
-->farklı package'den class name ile static meth call edilemez
-->Karşılaştırma operatörleri case de kullanılmıyor.
-->Parametre olarak clas ismi ve obje ismi yazarak ayrıca obje oluşturmadan işlem yapılabilir ve kullanımı daha yaygındır. public (Clarusway qtester) { }
-->Static varsa obje oluşturamayız
-->nextInt() yönteminin hemen ardından nextLine() yöntemini kullanırsanız nextInt()
 yönteminin tamsayı belirteçlerini okuduğunu hatırlayın;
   bu nedenle, tamsayı girişinin o satırı için son yeni satır karakteri hala giriş arabelleğinde kuyruğa alınmıştır
ve sonraki nextLine() işlevi tamsayı satırının geri kalanını (boştur) okuyacaktır.
-->Private data ve static methods ile variables inherit edilemez.
-->Aksiyon her zaman child'a yapılır.
-->Objeyi constructor üretir
-->Objeyi her zaman constructor üretir ancak data type farklı olabilir. Clarusway obj=new Qatester(); örneğinde olduğu gibi
-->Bir objenin constructor'ı değişmez sabittir ancak data type değişebilir.
-->Recursive constructor call edilemez. CTE verir ama recursive method sadece sürekli döner hata vermez.
-->staticler importla yada class name ile gelir non-static ise obje ile gelir
-->Bir obje variable çağırırken önce data type'ına bakar sonra constructor'a bakar. Ancak method çağırırken önce constructor'a bakar.
-->Methodlar yalnızca alt sınıf (subclass) tarafından miras alınmışlarsa override işlemi uygulanabilir. Ezmek için miras almalısın.
-->Override methodların access levellerini yükseltebilir ama düşüremez. (public>protected>default>private)
-->Static ve Final olarak tanımlı metotları override edilemez.
-->Override ve Overload'da method isimleri aynıdır.
-->Objelerin farklı bir obje gibi davranabilmesine polymorphism denir.


                                                     MANUAL TESTING
-->Network bir apı çeşididir. internete bağlı Apı'lar networktür. Bütün netwoekler apı'dır ancak bütün apı'lar network değildir.
-->Interface testler otomasyona dökülmez.
-->Parantez her zaman parametre havuzudur.
-->e.printStackTrace(): tüm hata mesajını verir
-->parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
--> public static void main(String[] args) throws IOException {//main meth signature level exception(throws) zorunlu tanımlandı
        FileInputStream fis=new FileInputStream("src/j25_Exceptions/ebikGabik");
        //fis-> path(yolu:kaynagı) tanımlana file erişim saglayan obj create edildi
        // FileNotFoundException -> erişilmesi gereken filepath (dosya kaynagı) yanlışsa isitisnası:adres yanlışsa

        int k;
        while ((k=fis.read())!=-1){//fis obj ile read() meth erişilen dosyadaki her bir char ascii değeri -1 olayana kadar tekrar tanımlandı
            System.out.print((char)k);//k int  ascii olan file değeri char ici casting-> type dönüşümü
        }


        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
-->Final varibe'a değer atanamaz değiştirilemez
-->Abstract classlardan bir obje üretilmez
-->Abstract methodlar sadece abstract class'da tanımlanabilir.
-->Abstrac Class'da bulunan metot final olarak tanımlanabilir.
-->Static metotlar abstract olamaz.
-->Abstract methods cannot have a body
-->Constreate class içinde Abstract Method bulundurulamaz
-->Abstract method private, final veya static tanımlanamaz.
-->Obje yoksa implement yoktur
-->Interface bir class değildir. Class'lardan obje üretilir dolayısıyla Interface interface'dir.
-->Abstract methodlarda her methodu override etmek zorunda değildir çünkü concreate method'da olabilir.
-->Interface'e to do list denilebilir. Zorunluluk yani yapılacaklar.
-->Interface aracılığıyla proframda çoklu katılım uygulayabilriz.
-->Bir class birden fazla class'a extend edilemez ama birden fazla interface'e implement edilebilir.
-->Interface variable'ları mutlaka public,static ve final tanımlanmalı. Private veya protected tanımlanan variable'lar CTE verir.
-->Interface variable'ları mutlaka initialize eidlmeli aksi taktirde CTE verir.
-->Bir class birden fazla Interface'e implement edilebilir. Örnek olarak => public class QaTester implements Clarusway, Bootcamp, ItEgirim{ }
-->Final variable büyük harflidir.
-->Default ile obje ile çağrılır static ise class name ile interface name ile çağrılır.
-->Static olan bir şey obje ile gelmez interface ile gelir.
-->Iterator <string> list1 = course.iterator(); sol taraf data type declare edilir sağ taraf asignment yani tanımlama yapılır.
-->Iterators ta hasNext() varmı demek next() varsa getir romeve() getirdiğini sil demek.
-->ListIterator iterator interface'in childi'dır daha fazla method barındırdığı için daha esnek ve kullanışlıdır.
-->Method hazır kullanabileceğimiz aksiyon demektir.
-->İnterface'dne obje yapılmaz
-->Data type objName = new Constructor(); Constructor kesinlikle class olmak zorunda ancak Data type interface de olabilir.
-->Maplar'de interface'dir.
-->Collectionda eklerken ve silerken hızlıdır çünkü direk sona veya başa ekler siler ancak set ederken tek tek gittiği için yavaştır.
-->LinkedList ile Array list arasında çok bir fark yoktur sadece application hızını artırır.
-->Interface objeleri kuvvetlendirir.
-->Set direk kullanılmaz çünkü interface'dir.
-->Arraylar obje gibi tutulduuğu için heap memorty referance verir south almak için string yapılmalı.
-->Queue interface'indeki offer() methodunun ada() methodundan farkı eper array ile 10 adet belirtilen sonra 11. ilac eklenmek istendğinde
add hata verir ancak offer true false verir işleme devam eder. poll() ile remove() methodların farkı da aynıdır.
-->Sıra aksiyonlarda aksiyonun devam etmesi için hata vermemesi için peekFirst() olabilir ancak getFirst() runtimeexception verir.
-->Map interface'dir collection değildir.
-->Collectionlar köşeli parantez map'lar curly brace'dir.
-->double yazdığığımız bir sayısı float'ta göstermek istersekl float m =2.3f; yazarsak çıktısının alırız.
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
