package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size {
    public static void main(String[] args) {
        //size()-> listin eleman sayısını return eder.(arr->length)
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.size() = " + ulkelist.size());// 5
        ArrayList<String> sehirlist = new ArrayList<>();
        System.out.println("sehirlist.size() = " + sehirlist.size());// 0
    }
}
