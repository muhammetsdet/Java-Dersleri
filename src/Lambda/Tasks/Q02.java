package Lambda.Tasks;

import Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q02 {
  /*  2) Bir class oluşturun, 'Q02' olarak adlandırın
        3) 5 elemanlı bir tamsayı listesi oluşturun
        4) Elemanlari doğal sıraya koyun
        5)Konsoldaki son 3 elemanın karelerinin toplamını bulun.
        6) Konsoldaki toplamı yazdırın
        7) 'Fonksiyonel Programlama' kullanın
        */
  public static void main(String[] args) {
      List<Integer> listOfNumbers = new ArrayList<>(List.of(33,9,-2,-5,25));
      operatingWithNumbers(listOfNumbers);
  }

    private static void operatingWithNumbers(List<Integer> listOfNumbers) {
        System.out.println(listOfNumbers.stream().sorted().skip(2).map(SeedMethods::kareAl).reduce(0,Integer::sum));

    }
/*
2.Yol-->
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(2, 6, 3, 8, 5));

        son3elemaninKarelerininTplm(sayiList);
    }

    private static void son3elemaninKarelerininTplm(List<Integer> sayiList) {
        System.out.println(sayiList.stream()
                .sorted()
                .skip(sayiList.size() - 3)
                .map(SeedMethods::kareAl)
                .reduce(0, (a, b) -> a + b));
    }
}
3.Yol-->
    public static void main(String[] args) {

        List<Integer> sayilist = new ArrayList<>(Arrays.asList(33,42,35,50,63));
        System.out.println(sayilist.stream().sorted().skip(2).map(t -> (int)Math.pow(t, 2)).reduce(Integer::sum));

    }
}
 */

}
