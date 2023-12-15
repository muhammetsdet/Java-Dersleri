package j07_StringManipulation;

public class C07_isEmpty {
    public static void main(String[] args) {
          /*
          String IsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
         */
        String str = "madem gelding dünyaya otor çalış JAVA'ya";
        System.out.println("str.length() = " + str.length());//40
        System.out.println("str.isEmpty() = " + str.isEmpty());// false

        String str1 = "";//hiçlik->boş arsa
        System.out.println("str1.length() = " + str1.length());//0
        System.out.println("str1.isEmpty() = " + str1.isEmpty());// true
        String str2 = " ";//space apat olan boşolmayan arsa
        System.out.println("str2.length() = " + str2.length());//1
        System.out.println("str2.isEmpty() = " + str2.isEmpty());//false

        String str3 = null;//dutluk-> arsa bile değil
        // System.out.println("str3.length() = " + str3.length());// RTE
        // System.out.println("str3.isEmpty() = " + str3.isEmpty()); // RTE
        // isBlank()-> hem "boş tanımlanan  String" için hem de "sadece space" içeren Stringler içn true diğerlerine false return eder
        System.out.println("str1.isBlank() = " + str1.isBlank());// true
        System.out.println("str2.isBlank() = " + str2.isBlank());//

        String str4="    x    ";
        System.out.println("str4.isBlank() = " + str4.isBlank());//false
        System.out.println("\"a\".isBlank() = " + "a".isBlank());//false

    }
}
