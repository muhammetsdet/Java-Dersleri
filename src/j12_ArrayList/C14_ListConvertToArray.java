package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray {
    public static void main(String[] args) {
        //list'i array'e cevirme ->toArray();

        //1. yontem -> toArray(new String[0]); toArray() parametre olarak String[0] olarak eklenir..
        ArrayList<String > ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        String ulkeArr[] = ulkelist.toArray(new String[0]);// ulkeŞist elemanları ulkeArr'a atandı
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        //2. yöntem -> tanımlanan Array'in data type Object(Hz Adem Class) olarak tanımlanır
        //Trick-> Object(Hz. Adem Class) java'da tanımlı tum Class'ların atası(parenti) olarak tanımlıdır
        //String Integer Double.. etc. Class'lar Object Class için child(evlat)oldugu için istenen durumlarda data type olarak kullanılır.

        Object ulkeArr1[]=ulkelist.toArray();
        System.out.println("Arrays.toString(ulkeArr1) = " + Arrays.toString(ulkeArr1));// [Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]

    }
}
