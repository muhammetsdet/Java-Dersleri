package j31_Debugging;

public class C01_Debugger01 {

    /*

    Debug yapıyorsan kodu anlamdın demektir
    Debug yaparken kodu anlamıyorsan nasıl debug yapılır onu anlamadın demektir.
    Debug yaparken kodu anladığının dusunuyorsan aslında debuga ihtiyacın olmadığını anlamadın demektir.
    Debug etmek kodun mental bir modelinin eksikliğine işarettir.

    İki durumda debugger gerekli olabilir.
    *Mevcut kod devralındığında.
    *Yeni kod yazıldığında.
    her iki durumda da debugger çalıştırmaya dikkat edilmeli.
    Ama sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.

     */
static int ebikGabik=7; // class level static global variable tanımlandı.
    public static void main(String[] args) {
    method01();


    }

    private static void method01() {
        System.out.println("   **** method01 çalışıyor   ****     ");
int a=0; // local variable tanımlandı.
        ebikGabik++;
        for (int i=1 ; i<=10; i++) {
            System.out.print(i+ " ");
            a+=2*i;

        }

        System.out.println();
        
        System.out.println(" *** method02 call edilyor   ***");
method02();

        System.out.println(" *** method03 call edilyor   ***");
method03();

        System.out.println("   **** method01 bitti   ****     ");


    }

    private static void method02() {
        System.out.println("   **** method02 çalışıyor   ****     ");
ebikGabik+=5;
        for (int x=1 ; x<=7; x++) {
            System.out.print(x+ " ");
        }

        System.out.println();
        System.out.println("   **** method02 bitti   ****     ");
    }

    private static void method03() {
        System.out.println("   **** method03 çalışıyor   ****     ");
ebikGabik-=3;
        for (int y=1 ; y<=5; y++) {
            System.out.print(y+ " ");
        }

        System.out.println();
        System.out.println("   **** method03 bitti   ****     ");

    }

}
