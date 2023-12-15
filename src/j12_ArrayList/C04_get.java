package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {

            //get()-> listte girilen index'deki elemanı return eder. olmayan index için RTE exc. fırlatır
            ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
            System.out.println("ulkelist.get(2) = " + ulkelist.get(2));// Polkonya
            System.out.println("ulkelist.get(8) = " + ulkelist.get(8));// RTE-> IndexOutOfBoundsException : olmayan index


    }
}
