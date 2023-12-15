package j23_Encapsulation.Encapsulation02;

public class KisiRunner {
    public static void main(String[] args) {
        Kisi obj1 = new Kisi("Bahtiyar", "Kaya", "1qaz2wsx", -33);

        System.out.println("obj1.getAd() = " + obj1.getAd());// Bahtiyar
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());// Kaya
        System.out.println("obj1.getPassword() = " + obj1.getPassword());// 1qaz2wsx
        System.out.println("obj1.getYas() = " + obj1.getYas());// 33
        obj1.setAd("Aslan Bahtiyar");
        System.out.println("obj1.getAd() = " + obj1.getAd());// Aslan Bahtiyar

    }
}