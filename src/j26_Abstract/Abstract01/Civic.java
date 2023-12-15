package j26_Abstract.Abstract01;

public  class Civic extends Lastik{// concrete  child Class
    /*
    extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
    java CTE verdi
    çözüm:
    a) Unımplemented (uyarlanmamış) method implement edilmeli
    b)parent Honda class'dan abstarct keyword kaldırılmalı
    c)concrete olan child Civic class abstract tanımlanmalı
  */


    //concrete child Class abs. meth tanımlanır mı? nayır nolamazzzz
    //public  abstract void absMeth();
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli

    @Override
    public void motor() {
        System.out.println("Agam 1.6 eco motor neyine yetmir");
    }

    @Override
    void koltuk() {
        System.out.println("Agam koltukda ucuza kacıp kumaş  cakmışşsın :( ");
    }

    @Override
    void kapi() {
        System.out.println("Agam elinde kalmasın yavas kapat ");
    }

    @Override
    public void lastikEbat() {
        System.out.println("Agam 18' lastik kafi ");
    }

    //Polymorphisim -> obj cok biçimlilik(farklı data type tanımlanması)
    //Civic c1 = new Civic();//Civic concrete child Class data type obj
    //Honda c2 = new Civic();//Honda abs parent Class data type obj
}
