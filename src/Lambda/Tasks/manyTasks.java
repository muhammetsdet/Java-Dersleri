package Lambda.Tasks;

import Lambda.SeedMethods;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class manyTasks {
    /*String isimlerden olusan bir list olusturun
Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
Konsoldaki farklı öğeleri ters sırada yazdırın.
Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
     */
    public static void main(String[] args) {
        ArrayList<String> proverb = new ArrayList<>(List.of("Söz", "Uçar", "Yazi", "Calır", "Demis", "Atalarımız", "Söz"));
        System.out.println("***Task01***");
        // Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın ???.
        lengthOfList(proverb);
        System.out.println("***Task02***");
        // Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
        differents(proverb);
        System.out.println(" \n***Task03***");
        //Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
        lastCharSort(proverb);
        System.out.println("\n***Task04***");
        //Konsoldaki farklı öğeleri ters sırada yazdırın.
        sortOfReversed(proverb);
        System.out.println("\n***Task05***");
        //Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
        lessThan7(proverb);
    }

    private static void lengthOfList(List<String> proverb) {
        proverb
                .stream()
                .distinct()
                .sorted()
                .forEach(t -> System.out.println(t + " - " + t.length()));
    }

    private static void differents(ArrayList<String> proverb) {
        proverb
                .stream()
                .distinct()
                .sorted(Comparator.comparing(t->t.length()))
                .forEach(SeedMethods::stringPrint);
    }

    private static void lastCharSort(ArrayList<String> proverb) {
        proverb
                .stream()
                .distinct()
                .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                .forEach(SeedMethods::stringPrint);
    }
    private static void sortOfReversed(ArrayList<String> proverb) {
        proverb
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(SeedMethods::stringPrint);
    }
    private static void lessThan7(ArrayList<String> proverb) {
        proverb
                .stream()
                .filter(t->t.length()<7)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .map(t->t.toUpperCase())
                .forEach(SeedMethods::stringPrint);

    }

}
