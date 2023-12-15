package j19_Constructor;

public class C05_Arac_Runner {//runner Class level
    public static void main(String[] args) {//main level
        C05_Arac a1=new C05_Arac("hacı volvo");
        System.out.println("a1 = " + a1);//a1 = model='hacı volvo', maxHiz=124
        a1.maxHiz=210;
        System.out.println("a1 = " + a1);// a1 = model='hacı volvo', maxHiz=210


    }//main sonu
}
