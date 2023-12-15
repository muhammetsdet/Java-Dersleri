package j08_Loops.Tasks;

public class Task22 {
    /* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
    99-98-97-96....
    100 ve 0 dahil değildir.*/
    public static void main(String[] args) {

        for (int i = 99; i > 0; i-=2) {
            System.out.print(i + " ");
        }
    }
}
