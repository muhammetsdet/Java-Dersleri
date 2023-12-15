package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Your visa1 exam score");
        int visa1 = scn.nextInt();
        System.out.println("Your visa2 exam score");
        int visa2 = scn.nextInt();
        System.out.println("Your final exam score");
        int finals = scn.nextInt();
        double gecmeNotu = ((visa1+visa2)/2)*0.3 + finals*0.7;
        System.out.println("Geçme notu :" + gecmeNotu);
    }
}
