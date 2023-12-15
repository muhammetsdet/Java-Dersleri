package j07_StringManipulation;

public class C11_equals_ignoreCase {
    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         *  equals() method’u verilen iki String’in içeriğinin birbirine eşit olup olmadığını kontrol eder.
         * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)’lerine de bakar.
         * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        String str1 = "Mert";
        String str2 = "mert";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));// false
        System.out.println("str2.equals(str1) = " + str2.equals(str1));// false
        System.out.println("str1.equals(\"Mert\") = " + str1.equals("Mert"));// true
        System.out.println("str2.equals('a') = " + str2.equals('a'));// false
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));//  true

        // equals() ile == farkı....
        String s1 = "clarusway";// s1 String pool(string havuzundan aynı referans:adres'e sahip variable)->ön cep(stack memory)
        String s2 = "clarusway";// s2 String pool(string havuzundan aynı referans:adres'e sahip variable)->ön cep(stack memory)
        String s3=new String("clarusway");// String data type unique adres(refdrans) sahip obj.-> cüzdan(heap memory)
        String s4=new String("clarusway");// String data type unique adres(refdrans) sahip obj.-> cüzdan(heap memory)

        System.out.println(s1 == s2);// true-> içerik ve adres aynı(aynı pooö havuzdan)
        System.out.println(s1.equals(s2));// true-> içerik aynı
        System.out.println(s3 == s4);// false->içerik aynı fakat new'den dolayı farklı obj dolayısyle farklı adres
        System.out.println(s3.equals(s4));// true->içwerk aynı

        String sa="Musa";
        String sb="";

        sb=sa+"";
        System.out.println("sb = " + sb);// Musa
        System.out.println("sa = " + sa);// Musa
        System.out.println(sa == sb);// false->
        System.out.println(sa.equals(sb));// true
 /*
 String s1 = “text”; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
 Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java’ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

 s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
 s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
 s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
 Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
 için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
 s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
         */

    }
}
