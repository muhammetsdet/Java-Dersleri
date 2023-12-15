package j08_Loops.Tasks;

public class Task11 {      /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */


    public static void main(String[] args) {
    int harf = 65;
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(harf + j )+ " ");
            }
            System.out.println(" ");
        }


    }
}
