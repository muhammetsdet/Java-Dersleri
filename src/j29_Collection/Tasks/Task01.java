package j29_Collection.Tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
     /*
        Task->
        Node değerleri "Murat","javaCAN","javaTAR","Musa bey" olan bir linkedList create ediniz.
        Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create ediniz.

         */
LinkedList<String> list= new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Musa bey"));

Scanner scn = new Scanner(System.in);
        System.out.println("Write a name");
        String name = scn.nextLine();
        System.out.println(list.remove(name) ? "Agam eleman halledildi" : "Agam aradığınız kişiye ulaşılamadı"); //cincix kod buna derler
//        if (list.contains(name)){
//            list.remove(name);
//            System.out.println("Agam eleman halledildi");
//
//        }else{
//            System.out.println("Agam aradığınız kişiye ulaşılamadı");
//        }
//        System.out.println(list);
        System.out.println(list);
    }

}
