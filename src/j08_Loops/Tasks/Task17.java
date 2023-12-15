package j08_Loops.Tasks;

public class Task17 {

        /*
        task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

         */

    public static void main(String[] args) {

        for (int i = 1; i <100 ; i++) {
            if ((i%20==0)) {
                System.out.print(i + " ");
            }

        }

    }
}
