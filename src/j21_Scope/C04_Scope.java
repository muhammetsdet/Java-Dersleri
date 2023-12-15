package j21_Scope;

import j20_StaticKeyword.C03_StaticKeyWord;

public class C04_Scope {
    //Class level
    public static void main(String[] args) {//main level

        C01_InstanceVariable obj1=new C01_InstanceVariable();// istenilen Calss'dan cosnt. call edilerek obj create edilebilir.

        C03_StaticKeyWord obj2=new C03_StaticKeyWord();
        obj1.non_staticMethod();//oıbj ile non-static meth call
        System.out.println("obj1.developer = " + obj1.isim);//obj ile obj variable call
        C01_InstanceVariable.staticMethod();//ClassName ile static meyth call edildi


    }//main sonu
}
