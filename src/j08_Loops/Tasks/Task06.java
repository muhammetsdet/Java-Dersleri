package j08_Loops.Tasks;

public class Task06 {     // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.
    public static void main(String[] args) {
        for (int carpn = 1; carpn <= 10; carpn++) {
            for (int carpn2 = 1; carpn2 <=10; carpn2++) {
                System.out.println(carpn + "*"+  carpn2 + carpn*carpn2 );

            }
            System.out.println("***");
        }

    }
}
