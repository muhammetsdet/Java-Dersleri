package j26_Abstract.Abstract01;

public abstract class Lastik extends Honda{
    // abs Honda Class'dan extend child abs. Class
    // abs Class'larda parent - child ise meth. implement zorunluluğu yoktur.

    public abstract void lastikEbat();// abs meth-> implement zorunlu
    public  void kisLastik(){//concrete meth->math call edilebilir
        System.out.println("Agam karlı havada ihmal etme pis cezası var canını yakarlar :( ");
    }

}
