package j08_Loops.Tasks;

public class Task13 {
    /*
    A
    B B
    C C C
    D D D D
    E E E E E
    F F F F F F
    şekli print eden code create ediniz..

    */
    public static void main(String[] args) {
        int letter = 65;
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <= i; j++) {
                    System.out.print((char)(letter +i )+ " ");

            }
            System.out.println(" ");
        }



    }
}
