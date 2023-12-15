package j27_Interface;



public class Sahin extends Tofas implements DisDonanim,IcDonanim,Lastik{
    @Override
    public void motor() {
        System.out.println("Agam 1.6 motor cok yakar az kaçar :( ");
    }

    @Override
    public void yakit() {
        System.out.println("Agam TÜPitak yoksa ocagına incir agacı\ntüplü ve öfkeli :( ");
    }


    @Override
    public void kapi() {
        System.out.println("agam 4 KAPI sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("Agam akordion KAPORTA gamzesiz olmaz :) ");
    }

    @Override
    public void koltuk() {
        System.out.println("Agam deri koltuk yazın pişik yapar aman içi saman olmasın :( ");
    }

    @Override
    public void klima() {
        System.out.println("Agam aç camı serinle KLİMA senin neyine");
    }

    @Override
    public void ebatLastik() {
        System.out.println("Agam LASTIK gibi sundurme\nasfalt agladı beee :)");
    }

    @Override
    public void jant() {
        System.out.println("Agam senin gibin JANTİ teker coooğğğ  şeker:)\nJANT yakar kızlar bakar :)");
    }
}
