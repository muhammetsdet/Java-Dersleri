package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task03 {
    		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scn.nextInt();
        if(year>= 1000){
            System.out.println("Millennium");
        }else if(year>= 100){
            System.out.println("Century");
        }else if(year>=10){
            System.out.println("Decade");
        }

    }
}
