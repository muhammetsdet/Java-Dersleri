package j21_Scope;

public class C03_LocalVariable {
    //Class level

    public static void main(String[] args) {//main level
        int yas = 33;//main localde create edilen primtive variable
        System.out.println("yas local variable call = " + yas);//local variable doğrudan call edildi

        for (int i = 0; i < 9; i++) {//loop level
            System.out.println(yas + " " + i);//main scope variable loop scope call edildi
            i += 3;//loop variable call edilerek action aldı
        }//loop sonu
        // i+=7;//loop variable scoğe dısına call edilemez:CTE

        yas = 49;//main scope variable call edilerek atama yapıldı


    }//main sonu

    // yas=50;//main scope variable scope dısına  call edilemez:CTE
    // ahan da TRİCK -> her variable kendi scope'unda tanımlanır call edilir ve ölür(scope dısına çıkamaz)
}
