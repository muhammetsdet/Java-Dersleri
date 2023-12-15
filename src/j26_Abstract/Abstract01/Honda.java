package j26_Abstract.Abstract01;

public abstract class Honda {// abs. g.parent class

    public abstract void motor();// abs meth->body'siz implement zorunlu meth

    void sunroof() {//concrete meth->body'li call edilebilir
        System.out.println("Agam keyfini bilirsen sunroofu açarsan böğrüne maaşallah yazdırısın ");
    }

    abstract void koltuk();// abs meth->body'siz implement zorunlu meth
    abstract void kapi();// abs meth->body'siz implement zorunlu meth

    // abs. class'da concrete variable tanımlanır mı? -> evet
    String isim = "Seckin";
    // abs. class'da abs variable tanımlanır mı? -> nayır nolamazzz
    // abstract String str="javvaNUR";
    // final void finalMethod();// final body'siz meth tanımlanamaz
    // final abstract void finalMethod();// final abs meth tanımlanamaz
    // private abstract  void privateMeth();// abs. meth acces modifier kısıtlanamaz
    // static  void gunesMetg();//static  concrete meth body'siz olamaz
    // static abstract void gunesMetg();// abs. meth static olamaz
   // Honda h1 = new Honda();//abs Class obj uretemez->melek dogurmaz


}