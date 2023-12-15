package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_isEmpty_Clear {
    public static void main(String[] args) {
        //isEmpty()-> listin boş olmasını kontrol eder true/false return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.isEmpty() = " + ulkelist.isEmpty());//false
        System.out.println("ulkelist = " + ulkelist);// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        //clear()-> listin tum elemanlarını silip boşaltır...
        ulkelist.clear();
        System.out.println("ulkelist.size() clear sonrası  = " + ulkelist.size());// 0
        System.out.println("ulkelist clear sonrası = " + ulkelist);// []
        System.out.println("ulkelist.isEmpty() clear sonrası = " + ulkelist.isEmpty());// true
    }

}
