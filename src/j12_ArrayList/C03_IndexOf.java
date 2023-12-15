package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_IndexOf {
    public static void main(String[] args) {
        //indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan eleman için -1 return eder.

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.indexOf(\"alamanya\") = " + ulkelist.indexOf("alamanya"));//-1->case sensitive -> olamayan eleman
        System.out.println("ulkelist.indexOf(\"Alamanya\") = " + ulkelist.indexOf("Alamanya"));//0
        System.out.println("ulkelist.indexOf(\"Patogonya\") = " + ulkelist.indexOf("Patogonya"));//-1 ->olmayan eleman

        ulkelist.add("Polkonya");
        System.out.println("ulkelist = " + ulkelist);// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya, Polkonya]
        System.out.println("ulkelist.indexOf(\"Polkonya\") = " + ulkelist.indexOf("Polkonya"));//2-> tekrarlı elemanlarda soldan sağa işk bulunan  eleman index return eder
        System.out.println("ulkelist.lastIndexOf(\"Polkonya\") = " + ulkelist.lastIndexOf("Polkonya"));//5
        System.out.println("ulkelist.lastIndexOf(\"kolonya\") = " + ulkelist.lastIndexOf("kolonya"));//-1

    }
}
