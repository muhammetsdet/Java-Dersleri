package j27_Interface.Tasks.Task01;

public class Dikdortgen implements Sekil{

    @Override
    public int cevre(int... kenar) {
        if(kenar.length==1){//varargs'a girilen int parametre 1 tane ise kare cevre hesapla
            return (kenar[0]*4);
        }else {//varargs'a girilen int parametre 2 tane ise dikdortgen cevre hesapla
            return ((kenar[0]+kenar[1])*2);
        }
    }

    @Override
    public int alan(int... kenar) {
        if(kenar.length==1){//varargs'a girilen int parametre 1 tane ise kare alan hesapla
            return (kenar[0]*kenar[0]);
        }else {//varargs'a girilen int parametre 2 tane ise dikdortgen alan hesapla
            return (kenar[0]*kenar[1]);
        }
    }
}
