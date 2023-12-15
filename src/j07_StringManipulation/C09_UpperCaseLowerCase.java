package j07_StringManipulation;

public class C09_UpperCaseLowerCase {
    public static void main(String[] args) {
          /*
        toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
       toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
       ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
         */
        String str = "madem gelding dünyaya otor çalış JAVA'ya";
        System.out.println("str = " + str);//madem gelding dünyaya otor çalış JAVA'ya
        System.out.println("str.toUpperCase() = " + str.toUpperCase());//MADEM GELDİNG DÜNYAYA OTOR ÇALIŞ JAVA'YA
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//madem gelding dünyaya otor çalış java'ya

    }
}
