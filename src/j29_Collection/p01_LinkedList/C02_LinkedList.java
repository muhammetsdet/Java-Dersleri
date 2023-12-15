package j29_Collection.p01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {

    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();//data type Hz.Adem Object grand parent Class -> ne olursan ol gelClass
        // ahan da Trick köşesinde böğün -> BAD PRACTICE--> app.  çoooğ yavaşlatır
        ll.add(1905);
        ll.add("javaGS");
        ll.add('$');
        ll.add(true);
        System.out.println("ll = " + ll);//[1905, javaGS, $, true]

    }
}
