package Lambda.Tasks;

import Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C3_MultiArrays_StreamOrnekleri {
  static  String arr[][] = {
            {"Elma", "Muz"},
            {"Portakal", "Cilek", "Limon"},
            {"Havuc", "Erik"}
    };
  static  List<String[]> lists = new ArrayList<>(Arrays.asList(arr));
    // S1 : tum elemanlari list yapalım
    public static void main(String[] args) {
        System.out.println("\n**Task_S2***");
        // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdirali.
        listOfDoubleElements(arr);
        System.out.println("\n**Task_S3***");
        // S3: E ile baslayan elemanlari liste olarak yazdirali.
        printList(arr);
        System.out.println("\n**Task_S4***");
        //   S4 : k ile bitenlerin sonuna '*' ekleyelim.
        isLastCharK(arr);
    }
    private static void listOfDoubleElements(String[][] arr) {
        lists
                .stream()
                .flatMap(Arrays::stream)
                .filter(t -> t.startsWith("E"))
                .forEach(t -> System.out.println(t + t));
    }

    private static void printList(String[][] arr) {
        lists
                .stream()
                .flatMap(Arrays::stream)
                .filter(t -> t.startsWith("E"))
                .forEach(t -> System.out.print(t+" "));
    }
    private static void isLastCharK(String[][] arr) {
        lists
                .stream()
                .flatMap(Arrays::stream)
                .filter(t -> t.endsWith("k"))
                .forEach(t -> System.out.print(t + "* "));
    }

}


