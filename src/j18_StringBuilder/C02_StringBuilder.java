package j18_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder creat etme-> Decleration

        // 1. yol->
        StringBuilder sb1 = new StringBuilder();// default capacity 16 char olan bos sb tanımlandı
        System.out.println("sb1 = " + sb1);//  -> hiçlik
        System.out.println("sb1.length() = " + sb1.length());// 0
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16
        sb1.append("Abdullah Gakgo ");//sb1'e value eklendi
        System.out.println("sb1 = " + sb1);// Abdullah Gakgo
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16
        System.out.println("sb1.length() = " + sb1.length());// 15
        sb1.append(" cok zengin olasan                                           ");
        System.out.println("sb1.length() = " + sb1.length());// 34
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16*2+2=34
        // capacity asımında yeni capacity=eskiCapacity*2+2
        sb1.append("engin bana offer al");
        System.out.println("sb1.capacity() = " + sb1.capacity());// 34*2+2=70


        // 2. yol->

        StringBuilder sb2 = new StringBuilder("Sebnem Hanımdan  bamya ");// initialize (ilk değer) atanmış sb
        System.out.println("sb2 = " + sb2);// Sebnem Hanımdan  bamya
        System.out.println("sb2.length() = " + sb2.length());// 23
        System.out.println("sb2.capacity() = " + sb2.capacity());// 16+sb2.length(23)=39
        // initialize edilmiş sb capacity=16+ilkDeğer.Length
        //trintosize()-> capacity'deki length fazlası character siler

        sb2.trimToSize();
        System.out.println(" sb2.trimToSize() sonrası sb2 = " + sb2.capacity());// 23

        // 3. yol->
        StringBuilder sb3 = new StringBuilder(17);// 15 character capacity tanımlanmış boş sb
        System.out.println("sb3 = " + sb3);// -> hiçlik
        System.out.println("sb3.length() = " + sb3.length());// 0
        System.out.println("sb3.capacity() = " + sb3.capacity());// 17
        sb3.append("155'i ararun cincix code");
        System.out.println("sb3 = " + sb3);//
        System.out.println("sb3.length() = " + sb3.length());//24
        System.out.println("sb3.capacity() = " + sb3.capacity());// 17*2+2=36

        // Sb'deki istenen index character alma
        System.out.println("sb3.charAt(17) = " + sb3.charAt(17));// i
        //  System.out.println("sb3.charAt(99) = " + sb3.charAt(99));// RTE-> StringIndexOutOfBoundsException:olmayan index eleman

        // Sb'deki belirli aralık character alma
        System.out.println("sb3.subSequence(12,21) = " + sb3.subSequence(12, 21));//   cincix c->12.13...20. index char
        System.out.println("sb3.substring(11) = " + sb3.substring(11));// n cincix code-> 11,12,13...
        System.out.println("sb3.substring(12,21) = " + sb3.substring(12, 21));////   cincix c->12.13...20. index str

        // Sb'deki istenen index char silme
        System.out.println("sb3.deleteCharAt(23) = " + sb3.deleteCharAt(23));//155'i ararun cincix cod-> delete hali
        System.out.println("sb3 = " + sb3);// 155'i ararun cincix cod
        // Sb'deki istenen aralık index char silme
        System.out.println("sb3.delete(12,21) = " + sb3.delete(12, 21));//  155'i ararunod->silinmiş SB return eder
        // Sb'e istenen char ve Char2lar girdi yapma
        System.out.println("sb3.insert(3,sb2,7,11) = " + sb3.insert(3, sb2, 7, 11));//sb3'e 3. indexten itibaren sb2'nin 7,8,9,10 char ekle

        // Sb'deki istenen index char update (set)

        sb3.setCharAt(2, '$');
        System.out.println("sb3 = " + sb3);//15$Hanı'i ararunod

        // Sb'deki istenen index birden cok char set etmek
        System.out.println("sb3.replace(1,7,\"*\") = " + sb3.replace(1, 7, "*"));//1*'i ararunod

        // Sb obj String variable convert(cevirme)
        StringBuilder sb4 = new StringBuilder("mustafa bey köy meydanından selamkeee...");
        System.out.println("sb4 = " + sb4);// mustafa bey köy meydanından selamkeee...
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());// MUSTAFA BEY KÖY MEYDANINDAN SELAMKEEE...

        //String variable SB'e convert etme
        String sefilHaluk = "javaHAN";
        System.out.println("sefilHaluk = " + sefilHaluk);//javaHAN

        StringBuilder sennurJavaNaz = new StringBuilder(sefilHaluk);//String variable SB'e atandı
        System.out.println("sennurJavaNaz = " + sennurJavaNaz);//javaHAN

          /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
        print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
         */
        StringBuilder sb5 = new StringBuilder("bahanesi olanın basarısı olmaz");
        StringBuilder sb6 = new StringBuilder("bahanesi olanın basarısı olmaz");
        StringBuilder sb7 = new StringBuilder("bahanesi olanın Basarısı olmaz");
        String str = "bahanesi olanın basarısı olmaz";

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));// 0
        System.out.println("sb5.compareTo(sb7) = " + sb5.compareTo(sb7));// 32
        // System.out.println("sb5.compareTo(str) = " + sb5.compareTo(str));// CTEc -> elma armut kıyası olmaz
        System.out.println("sb5.compareTo(str) = " + sb5.compareTo(new StringBuilder(str)));// 0

        // SB eşitliği
        System.out.println("sb5.equals(sb6) = " + sb5.equals(sb6));// false
        System.out.println("sb5==sb6 = " + (sb5 == sb6));// false
        System.out.println("sb5.equals(str) = " + sb5.equals(str));// false
        System.out.println("sb5==str = " + sb5 == str);// false
        // trick-> Sb 'da equals() meth aynı == gibi return eder: hem ref. hem de value controlu yapar.

        // Sb character'leri index'e göre ters cevirme
        System.out.println("reverse öncesi sb5 = " + sb5);//bahanesi olanın basarısı olmaz

        System.out.println("reverse sonrası  sb5 = " + sb5.reverse());//zamlo ısırasab nınalo isenahab

    }
}
