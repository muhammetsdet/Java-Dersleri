package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_subList {
    public static void main(String[] args) {
        //sublist() -> listini istenen list parcasını(şu index'ten şu index'e parcasını) return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("subList sonrası ulkelist = " + ulkelist);// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        System.out.println("ulkelist.subList(1,4) = " + ulkelist.subList(1, 4));//[Güba, Polkonya, Dingiltere]-> 1.2.3. index
        System.out.println("subList sonrası ulkelist = " + ulkelist);// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        ArrayList<String> ebikGabık=new ArrayList<>(ulkelist.subList(2,ulkelist.size()));//2'den son elemana kadar
        System.out.println("ebikGabık = " + ebikGabık);//[Polkonya, Dingiltere, Amerigonya]


    }
}
