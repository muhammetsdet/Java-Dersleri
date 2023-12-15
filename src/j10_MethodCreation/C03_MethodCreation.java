package j10_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {//main level
        String can=" en hakiki javaCAN";
        String sebnem="javaNAZZZ";
        selamVer();//tanımlandıgı Class scope'a method name ile direct call edilir
        System.out.println("can = " + can);
        System.out.println("sebnem = " + sebnem);
        /*
        Farklı Class'lardan method call etmek ClassName.methodName ile ya da import ile yapılır
        static method-> gökteki güneş gibi .
        Aynı Class'da method doğrudan name'i ile call edilir
         */
        C03_MethodStore.gecmeNotu(88);//Class name ile meth call edildi-> komsu koy amelesei koy ismi ile cağrıldı
       // C03_MethodDepo.gecmeNotu(43);//import edildi-> komsu koy amelesei koy ismi ile cağrıldı
    }//main sonu
    public  static  void  selamVer(){// koyumun amelesi
        System.out.println("koyumun yagmurlarından javaTAR'lar bolcana selamkeee..");
    }

}
