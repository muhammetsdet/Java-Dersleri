package A_Porject.Proje4_Kitapci;

import java.util.Scanner;

public class TryCatch {
    static  Scanner scan = new Scanner(System.in);
public static int intGiris(){
    int giris =0;
    boolean flag1=true;
    boolean flag2=false;
    do {
        giris =0;
        try{
if (flag2){
    scan.nextLine();
}
flag2=true;
giris=scan.nextInt();
scan.nextLine();
flag1=false;
flag2=true;
        }catch(Exception e){
            System.out.println("Lütfen gecerli bir değer giriniz");
        }
    }while(flag1);
    return giris;
}
    public static String stringGiris(){
        String giris ="";
        boolean flag1=true;
        do {
            giris ="";
            try{
                giris=scan.nextLine();
                flag1=false;
            }catch(Exception e){
                System.out.println("Lütfen gecerli bir değer giriniz");
            }
        }while(flag1);
        return giris;
    }

}
