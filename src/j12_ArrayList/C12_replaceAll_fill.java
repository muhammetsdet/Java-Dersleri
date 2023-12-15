package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C12_replaceAll_fill {
    public static void main(String[] args) {
        //replaceAll();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya", "Güba"));
        System.out.println("replaceAll oncesi ulkelist = " + ulkelist); //[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya, Güba]
        System.out.println("Collections.replaceAll(ulkelist,\"Güba\",\"pataGONYA\") = " + Collections.replaceAll(ulkelist, "Güba", "pataGONYA"));//  true
        System.out.println("replaceAll sonrası ulkelist = " + ulkelist); // [Alamanya, pataGONYA, Polkonya, Dingiltere, Amerigonya, pataGONYA]

        //fill()-> list'tin tum elemanlarını istenen değere update eder...

        Collections.fill(ulkelist, "sebnemISTAN"); // ulkeList tum elemanlar sebnemISTAN ile update edildi
        System.out.println("sebnemISTAN fill sonrası ulkelist = " + ulkelist);//[sebnemISTAN, sebnemISTAN, sebnemISTAN, sebnemISTAN, sebnemISTAN, sebnemISTAN]

    }
}
