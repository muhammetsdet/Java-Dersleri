package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1 = "Sennur";//ilk değer (initial)ataması Sennur value ile yapılmış str1 variable StringPool'da create edildi.
        String str2 = "Sennur";//str1. ve str2 aynı değer ile ilk atamaları yapıldıgı için  StringPool ortak reference sahip
        String str3 = new String("Sennur");//ilk değer (initial)ataması Sennur value ile yapılmış str3 obj(heap memroy -> uniqe ref) crete edildi
        String str4 = new String("Sennur");//ilk değer (initial)ataması Sennur value ile yapılmış str3 obj(heap memroy -> uniqe ref) crete edildi

        //String str5 = str1 ;// str1 ve str2 ref değerleri eşit ama str5 ref değeri farklı.
        String str5 = str3 ;// str1 ve str2 ref değerleri eşit ama str5 ref değeri farklı.
        System.out.println( str1 == str2);// T-> aynı havuz ref
        System.out.println( str3 == str5);// T-> aynı havuz ref
        System.out.println("str2==str3 = " + str2 == str3);// F-> farklı havuz ve obj ref
        System.out.println("str1.equals(str2) = " + str1.equals(str2));// T-> aynı variable value
        System.out.println("str3==str4 = " + str3 == str4);// F-> farklı obj ref
        System.out.println("str3.equals(str4) = " + str3.equals(str4));// T-> aynı obj value
        System.out.println("str1==str5 = " + str1 == str5);// F-> farklı havuz ref
        System.out.println("str1.equals(str5) = " + str1.equals(str5)); //T -> aynı variable value

    }
}
