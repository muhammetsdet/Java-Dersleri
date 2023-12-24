package Lambda.Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task04 {
    /*  3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir list oluşturun
        4) "J" ile baslayan öğeleri almayın
        5) Farklı öğeleri seçin
        6) Karakter sayısına göre doğal sıraya koyun
        7) Tüm öğeleri büyük harfe dönüştürün
        8) Konsoldaki öğeleri yazdırın


        */
    public static void main(String[] args) {
       List<String> people = new ArrayList<>(List.of("Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson"));
        withoutCharJ(people);
    }

    private static void withoutCharJ(List<String> people) {
        System.out.println(people
                .stream()
                .filter(t -> !t.startsWith("J"))
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }
}
