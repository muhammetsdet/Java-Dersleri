package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
          /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress"(next) olmak uzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme(add) ve silmede(remove) daha avantıjlıdır.
        5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
         */
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        // LinkedList print ->
        System.out.println("ll1 = " + ll1);// [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        // LinkedList add()->
        ll1.add("tireTandır");
        System.out.println("ll1 add sonrası = " + ll1);// [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, tireTandır]

        ll1.addFirst("bitlisBuryan");
        System.out.println("ll1 addFirst sonrası = " + ll1);//[bitlisBuryan, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, tireTandır]

        ll1.addLast("beytiii");
        System.out.println("ll1 addLast sonrası = " + ll1);//[bitlisBuryan, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, tireTandır, beytiii]

        ll1.add(3, "pideliPaça");
        System.out.println("ll1 add(index,str) sonrası  = " + ll1);//[bitlisBuryan, balcanKebap, Cüger, pidePaça, haşhaşKebap, guzuGerdan, incik, küşşşleme, tireTandır, beytiii]

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 addAll sonrası= " + ll1);//
        ll2.addAll(1, ll2);
        System.out.println("ll2 addAll sonrası = " + ll2);
        // ll2.addAll("kabahhh");// CTE->meth prametre coll. olmalı


    }
}