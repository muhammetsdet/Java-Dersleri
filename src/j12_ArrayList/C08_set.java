package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_set {
    public static void main(String[] args) {
        //set()-> listin istenen index'e istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir...

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("set öncesi ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        System.out.println("ulkelist.set(1,\"Motonya\") = " + ulkelist.set(1, "Motonya"));//
        System.out.println("set sonrası ulkelist = " + ulkelist);//[Alamanya, Motonya, Polkonya, Dingiltere, Amerigonya]
        System.out.println("ulkelist.set(9,\"sefil Haluk\") = " + ulkelist.set(9, "sefil Haluk"));//RTE->IndexOutOfBoundsException:olmayan index
        // ulkelist.set(3, "Fransa", 4, "Romanya");//CTE set() çoklu paramete derlemez
    }
}
