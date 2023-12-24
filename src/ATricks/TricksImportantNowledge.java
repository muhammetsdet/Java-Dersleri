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
2-->Baska bir clası parent yapıp kendimize inherit edebiliriz (INherit)
3-->Bir obje tanımlandığı kıyaslandığı clasa göre özellikler taşıyabilri
4-->Child classlar parenttan aldıkları özellikleri kendine uyarlayabilirler.
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
-->
-->
-->
-->
-->

         */





    }

}
