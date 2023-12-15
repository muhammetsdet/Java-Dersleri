package j07_StringManipulation;

public class C13_ValueOf_parse {/*
 Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
 Stringlerle matematiksel islemler yapabilmemizi saglar.

valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
 valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
 */

    // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
    public static void main(String[] args) {
        String b1 = "10000";
        String b2 = "12000";
      int newb1 =  Integer.valueOf(b1);
      int newb2 =  Integer.valueOf(b2);
        System.out.println(newb2 + newb1);
        Integer tc = 1723095;//Integer yazsak tc. koysak olmuyor neden?
        String strTc = String.valueOf(tc);//Integer yazsak tc. koysak olmuyor neden?

  /*
Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
   output: strA+strB=31.54
     */

        String strA="$13.99";
        String strB="$17.55";
       Double yeniA = Double.valueOf(strA.substring(1));
       Double yeniB = Double.valueOf(strB.substring(1));
        System.out.println(yeniA + yeniB);

       Double yeniAA = Double.valueOf(strA.replaceAll("\\D", ""));

        Double yeniBB = Double.valueOf(strB.replaceAll("\\D", ""));
        System.out.println((yeniAA + yeniBB)/100);
        Double yeniAa = Double.parseDouble(strA.replaceAll("\\D", ""));
        Double yeniBb = Double.parseDouble(strB.replaceAll("\\D", ""));
        System.out.println(yeniAa + yeniBb);

    }
}
