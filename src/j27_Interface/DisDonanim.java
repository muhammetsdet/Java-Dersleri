package j27_Interface;

public interface DisDonanim {
    
    void kapi();// public abstract meth.

    //public abstract void kaporta();// public abstract meth.
    void kaporta();// public abstract meth.

    //String  renk;// CTE -> final static String variable initial edilmek zorunda
    // public final static String  renk="Gırmızııı";//public static final initial variable
    String RENK = "Gırmızııı";//public static final initial variable

    public static void anten() {//concrete static meth -> interfaceName ile call
        System.out.println("Agam yine ANTIN KUNTIN işlerdesin :)\n çekemeyen ANTEN taksın");
    }

    public default String sisLamp() {//concrete default(non-static)meth -> obj ile call
        return "agam sisli havada CAN kurtarır :) ";
    }

    //public static void main(String[] args) {//intreface yapıda main meth create edilebilir ama BAD PRACTICE
    //    anten();//math call
    //    // DisDonanim obj = new DisDonanim();//interface'de constuructor tanımlı olm için obj ceraete e-di-le-mezzzz...
    //}
}
