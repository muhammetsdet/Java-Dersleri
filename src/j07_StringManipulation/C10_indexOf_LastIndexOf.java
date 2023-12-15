package j07_StringManipulation;
import  java.util.Scanner;
public class C10_indexOf_LastIndexOf {
    public class C10_indexOf_lastIndexOf {
        public static void main(String[] args) {
               /* indexOf()->aranan yolcunun koltuk numarasını verir
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */


            String str = "madem geldin dünyaya otur çalış JAVA'ya :)";
            System.out.println("str.indexOf(':') = " + str.indexOf(':'));// : karakterin str'deki index'i->40
            System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));//a 'nin ilk görünüm index'i ->1
            // birden çok bulunan char veya String için soldan ilk bulunan char veya String index'i return eder
            System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));//32
            System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));//-1
            // ahan da trick-> indexOf("Java"); olmayan char veya String için CTE veya RTE değil -1 return eder
            System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));//17

            /* lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
            System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));// sondan ilk görünen a'nın index'i->38
            System.out.println("str.lastIndexOf(\"x\") = " + str.lastIndexOf("x"));// olmayab char veya str -1
            System.out.println("str.lastIndexOf(')') = " + str.lastIndexOf(')'));//41
         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
         */
            Scanner input = new Scanner(System.in);
            System.out.println("canını yiyim ele bir şeyler ciziktiresen : ");
            String biseyler = input.nextLine();

            // if (biseyler.indexOf("java")==-1) {// hiç tane java bulundurma sartı
            if (!biseyler.contains("java")) {// hiç tane java bulundurma sartı
                System.out.println("girilen ifadede hic java bulunmaz");

            } else if (biseyler.indexOf("java") == biseyler.lastIndexOf("java")) {// 1 tane java bulundurma sartı
                System.out.println("girilen ifadede sadece 1 tane java bulunur");

            } else {//birden çok java bulundurma sartı
                System.out.println("girilen ifadede enaz 2 tane java bulunur");

            }


        }
    }
}
