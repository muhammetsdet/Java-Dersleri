package j05_ifStatementTernaryOperator.Tasks;
/*  33 değerinde bir int oluşturun.
        Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
        Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
        Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
        Aksi halde (else) "Reminder is 0" yazdırınız.  */
public class _08_ifElseStatement {
    public static void main(String[] args) {
        int num = 33;
        if(num%4 == 3){
            System.out.println("Remainder is 3");
        } else if (num%4 == 2) {
            System.out.println("Remainder is 2");
        }else if (num%4 == 1){
            System.out.println("Remainder is 1");
        }else {
            System.out.println("Reminder is 0");

        }
    }
}
