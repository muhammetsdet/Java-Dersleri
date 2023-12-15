package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */
public class _05_arraylist5 {
    public static void main(String[] args) {
       List<String> cities=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println(rotateList((ArrayList<String>) cities));
       //System.out.println(rotateList(cities));
        //Neden sadece rotateList(cities); böyle kabul etmiyor hata veriyor illa rotateList((ArrayList<String>) cities) bu şekilde yazmamı istiyor???
    }

    private static String rotateList(ArrayList<String> cities) {
        Collections.reverse(cities);
        return String.valueOf(cities);
    }

}
