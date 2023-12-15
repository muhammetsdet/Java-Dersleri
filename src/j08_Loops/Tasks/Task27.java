package j08_Loops.Tasks;

public class Task27 {
                /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */

    public static void main(String[] args) {
        for (int i = 1 ; i <=3 ; i++) {
            System.out.println("IT: " + i + " ");
            for (int j = 1; j <=3 ; j++) {
                System.out.println(" QA: " + i + " ");
            }
            System.out.println("......");
        }



    }
}
