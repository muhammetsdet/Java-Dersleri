package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   Array List genel Tanimi:

          ArrayList<Type> arrayListName  =new ArrayList<Type>();
               List<Type> arrayListName = new ArrayList<>();

           1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
              - ArrayList<int> hatali bir tanimlamadir. Type Wrapper Class gibi object türünden olmalidir


          2.  - Arrayler degistirilemez sabit bir .length;'de tanimlanir.
              - ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.
          3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

  List declarations(tanımlama) :
  Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
   eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


  key word: List<Wrapper Class> name=

  List'e assaign etme(atama) :
  List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
  List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
  List<wrapper Class> name = new ArrayList<>() *****doğru
  List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
  ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

  List'e ilk değer atama (initialize):....
  1.yol : asList();
  ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
  2.yol : Listof();
  ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

  ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
  Array'ler Arrays.toString(arrayAdi); ile print edilir.

  Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

*/
public class C01_ArrayList {
    public static void main(String[] args) {
        int age = 34;//tek primitive data saklayan variable
        int ageArr[] = new int[5];//5 int primitive data saklayan array variable
        int ageArr1[][] = new int[4][7];//  4*7=28 int primitive data saklayan array variable
        ArrayList<Integer> ageList = new ArrayList<>();//istenilidği kadar data saklayan bos list
        // < > : generic , diamond operator

        //List tanımlama ve değer atama
        ArrayList<Integer> sayiList = new ArrayList<>();//integer data tutan boş bir list tanımlandıwhiw
        // 1. yol -> add(); meth
        System.out.println("sayiList.add(17) = " + sayiList.add(17));//true
        sayiList.add(43);
        sayiList.add(19);
        sayiList.add(33);
        sayiList.add(35);
        sayiList.add(34);
        sayiList.add(10);
        sayiList.add(10);
        sayiList.add(10);// aynı eleman birden çok liste eklenebilir dublicate izin verir
        System.out.println("sayiList = " + sayiList);// [17, 43, 19, 33, 35, 34, 10, 10, 10]
        //2. yol -> Arrays.asList(); meth:Çuval
        ArrayList<String> yemahhList = new ArrayList<>(Arrays.asList("küşleme", "kuzu gerdan", "antep acılı", "beef spagetti", "urfa ciger", "gediz göveç"));
        System.out.println("yemahhList = " + yemahhList);//[küşleme, kuzu gerdan, antep acılı, beef spagetti, urfa ciger, gediz göveç]

        //3. yol -> List.of(); meth:Çuval

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "isveç", "Hollanda", "ingiltere", "Amerigonya"));
        System.out.println("ulkeList = " + ulkeList);//[Alamanya, isveç, Hollanda, ingiltere, Amerigonya]
        ArrayList<Integer> rakamList = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        };

        System.out.println("rakamList = " + rakamList);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // list print etme..
        // sout(listName);

    }
}

