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
        LinkedList<String > strList = new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Musa bey"));

        Scanner input=new Scanner(System.in);

        System.out.println("Agam kime bakmıstınız : ");
        String  aganınAdamı=input.next();
        System.out.println(strList.remove(aganınAdamı) ? "Agam eleman halledildi" : "Agam aradığınız kişiye ulaşılamadı");


    }

}
