package j07_StringManipulation;

public class C08_Trim {
    public static void main(String[] args) {

           /*
  trim()-> İstediğimiz String’in başında veya sonunda varolan boşluk (space)’leri temizler.

         */
        String  str="  agama colcana selamkeee     :)    ";
        System.out.println("str = " + str);//   agama colcana selamkeee     :)
        System.out.println("str.length() = " + str.length());// 36
        System.out.println("str.trim() = " + str.trim());//agama colcana selamkeee     :)
        System.out.println("str.trim().length() = " + str.trim().length());// 30
        System.out.println("str = " + str); //    agama colcana selamkeee     :)    -> str meth atama yapılmadıgı içim kalıcı değişklik yapmaz


    }
}
