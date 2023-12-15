package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_Contains {
    public static void main(String[] args) {
        //contains()-> list'te istenen elamnın varlığını control eder true/false return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.contains(\"kolonya\") = " + ulkelist.contains("kolonya"));//false
        System.out.println("ulkelist.contains(\"Alamanya\") = " + ulkelist.contains("Alamanya"));//true
    }
}
