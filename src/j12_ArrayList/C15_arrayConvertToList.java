package j12_ArrayList;


import java.util.Arrays;
import java.util.List;

public class C15_arrayConvertToList {
    public static void main(String[] args) {
        //King of Trick -> Array'dan liste cevirme yapıldıgında list kaynagı array oldugu için list array gibi davranır:
        //eleman akleme ve silme yapılamaz-> add() remove() method çalışmaz RTE verir.
        String ulkeArr[]={"Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"};
        List<String> ulkeList= Arrays.asList(ulkeArr);//ulkeArr elelmanları ulkeList'e atandı
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));//
        System.out.println("ulkeList = " + ulkeList);//
        //System.out.println("ulkeList.add(\"sefilCAN haluk\") = " + ulkeList.add("sefilCAN haluk"));//RTE->UnsupportedOperationException
        System.out.println("ulkeList.remove(\"Güba\") = " + ulkeList.remove("Güba"));////RTE->UnsupportedOperationException

        /* Trick -> Cografya kader diyelim
        List data type Array ise list array gibi davranır yani add() ve remove() meth RTE verir.
        Array bound sabit oldugu için add ve remove yapılamaz
         */

    }
}
