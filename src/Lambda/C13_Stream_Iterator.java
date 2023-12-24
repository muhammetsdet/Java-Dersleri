package Lambda;

import java.util.stream.IntStream;

public class C13_Stream_Iterator {

        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla
        // startInclusive'den (dahil) endExclusive'e (hariç) kadar sıralı bir IntStream return eder.

        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil)
        // endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
        public static void main(String[] args) {
            System.out.println("TASK01--> amele topla : " + ameleTopla(10)); // 55
            System.out.println("   ***   ");
            System.out.println("TASK01--> cincix topla : " + cincixTopla(10)); // 55
            System.out.println("   ***   ");
            System.out.println("TASK02--> : " + ciftTopla(10));
            System.out.println("   ***   ");
            System.out.println("TASK03--> : "+ilkXCiftTopla(10));
            System.out.println("   ***   ");
            System.out.println("TASK04--> : ");
            ilkXCiftPrint(10);
            System.out.println("   ***   ");
            System.out.println("TASK05--> : "+ilkXTekTopla(10));
            System.out.println("   ***   ");
            System.out.println("TASK06--> : ");
            printIstenenIlkXKuvveti(10,3);
            System.out.println("   ***   ");
            System.out.println("TASK07--> : "+factoriyel(10));

        }

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.
        private static int ameleTopla(int x) {
            int toplam=0;
            for (int j = 1; j <=x; j++) {
                toplam+=j;
            }
            return toplam;
        }

        private static int cincixTopla(int x) {
            return IntStream
                    //.range(1,x)
                    .rangeClosed(1,x)
                    .sum();
        }

        //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir code create ediniz
        public static int ciftTopla(int x){
            return IntStream
                    .rangeClosed(1,x)
                    .filter(SeedMethods::ciftMi)
                    .sum();
        }

        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
        public static int ilkXCiftTopla(int x){
            return IntStream //int akis alindi
                    .iterate(2,t->t+2) //2'den baslayip surekli 2 arttiran tekrar tanimlandi
                    .limit(x) //akisdaki ilk x eleman alindi
                    .sum(); //akisdaki ilk x eleman toplandi
        }

        //TASK 04 --> Ilk x pozitif cift tam sayiyi print eden code  create ediniz.
        public static void ilkXCiftPrint(int x){
            IntStream //int akis alindi
                    .iterate(2,t->t+2) //2'den baslayip surekli 2 arttiran tekrar tanimlandi
                    .limit(x) //akisdaki ilk x eleman alindi
                    .forEach(SeedMethods::intPrint); //akisdaki ilk x eleman toplandi
        }

        //TASK 05 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
        public static int ilkXTekTopla(int x){
            return IntStream //int akis alindi
                    .iterate(1,t->t+2) //2'den baslayip surekli 2 arttiran tekrar tanimlandi
                    .limit(x) //akisdaki ilk x eleman alindi
                    .sum(); //akisdaki ilk x eleman toplandi
        }

        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.
        public static void printIstenenIlkXKuvveti(int x,int istenenSayi){
            IntStream //int akis alindi
                    .iterate(istenenSayi,t->t*istenenSayi) //istenen sayi'den baslayip surekli istenen sayinin kuvvetinin tekrari tanimlandi
                    .limit(x) //akisdaki ilk x eleman alindi
                    .forEach(SeedMethods::intPrint); //akisdaki ilk x eleman toplandi
        }

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
        public static int factoriyel(int x){
            return IntStream
                    .rangeClosed(1,x)
                    .reduce(1,(a,b)->a*b);
        }

}
