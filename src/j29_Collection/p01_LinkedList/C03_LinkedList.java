package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        System.out.println("ll1 ilk hali = " + ll1);// [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]

        // LinkedList remove()->
        System.out.println("ll1.remove() = " + ll1.remove());//balcanKebap
        System.out.println("ll1 remove() sonrası = " + ll1);//[Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        System.out.println("ll1.remove(\"cüger\") = " + ll1.remove("cüger"));//false
        System.out.println("ll1.remove(\"Cüger\") = " + ll1.remove("Cüger"));//true
        System.out.println("ll1 remove() sonrası = " + ll1);//[haşhaşKebap, guzuGerdan, incik, küşşşleme]
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());
        System.out.println("ll1 removeFrşst() sonrası = " + ll1);//[haşhaşKebap, guzuGerdan, incik, küşşşleme]
        System.out.println("ll1.removeLast() = " + ll1.removeLast());//

        System.out.println("ll1 removeLast() sonrası = " + ll1);//[haşhaşKebap, guzuGerdan, incik, küşşşleme]
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 adAll sonrası :  " + ll1);//[guzuGerdan, incik, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        System.out.println("ll2 = " + ll2);//
        ll1.removeAll(ll2);

        System.out.println("ll1 removeAll sonrası  = " + ll1);//[guzuGerdan, incik]
        System.out.println("ll2.element() = " + ll2.element());//trileçe->element() ilk elemanı return eder
        // LinkedList get() getFirst() getLast() ->
        System.out.println("ll2.get(3) = " + ll2.get(3));//suMuhallebi
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//trileçe
        System.out.println("ll2.getLast() = " + ll2.getLast());//ayva

        LinkedList<Integer> sayiList=new LinkedList<>(Arrays.asList(1,3,4,6,45,59,38));

        System.out.println("sayiList.remove(3) = " + sayiList.remove(3));// 6

        // remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
        // System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException
    }
}
