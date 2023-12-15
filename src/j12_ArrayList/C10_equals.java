package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_equals {
    public static void main(String[] args) {
        //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder

        ArrayList<String> ulkelist1 = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ArrayList<String> ulkelist2 = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist2.equals(ulkelist1) = " + ulkelist2.equals(ulkelist1));// true
        System.out.println("ulkelist1.equals(ulkelist2) = " + ulkelist1.equals(ulkelist2));// true
        ulkelist2.set(1,"Küba");
        System.out.println("ulkelist1.equals(ulkelist2) = " + ulkelist1.equals(ulkelist2));// false

    }
}
