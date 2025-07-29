package j32_Enum.enum01;

public class Runner {

    public static void main(String[] args) {

        //Task--> Verilen yılın ayını numarasına göre kaç gün çektiğini print eden kod yazınız.

        //int ay=3;

        Aylar ay = Aylar.MART; // Aylar enum data type ay veriable tanımlanıp Aylar enumdan Mart field call edilerek atandı.
        System.out.println(ay);//Mart
        System.out.println(ay.name());//Mart
        System.out.println(ay.ordinal());//2


        switch (ay){
            case OCAK:
                     System.out.println("Ocak 31 gündür...");
                break;

            case SUBAT:
                    System.out.println("Şubat 28 gündür...");
                break;

                case MART:
                    System.out.println("Mart 31 gündür...");
                break;

                case NISAN:
                    System.out.println("Nisan 30 gündür...");
                break;

                case MAYIS:
                    System.out.println("Mayıs 31 gündür...");
                break;

                case HAZIRAN:
                    System.out.println("Haziran 31 gündür...");
                break;

                case TEMMUZ:
                    System.out.println("Temmuz 31 gündür...");
                break;

                case AGUSTOS:
                    System.out.println("Ağustos 31 gündür...");
                break;

        }
        System.out.println("Agam code cincix devamkeee...");
    }
}
