package j08_Loops.Tasks;

public class Task20 {
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.


    public static void main(String[] args) {
        int column = 5;
        for (int i = 1; i <= 5; i++) {
            int currentNum = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum += column - j;
            }
            System.out.println();
        }


    }
}
