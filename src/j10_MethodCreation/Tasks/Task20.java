package j10_MethodCreation.Tasks;
/*
  task->
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz
     [$1 $12 €34 €56 $45 €78]
      dolarToplami: 58
      euroToplami: 168
     */

public class Task20 {
    public static void main(String[] args) {

        withoutValue();
    }

    private static void withoutValue() {
        String para="$1 $12 €34 €56 $45 €78";
        String newDollar = para.split("$")[2];
        System.out.println(newDollar);


    }

}
