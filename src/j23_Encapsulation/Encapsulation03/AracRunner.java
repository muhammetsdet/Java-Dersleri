package j23_Encapsulation.Encapsulation03;

public class AracRunner {

    public static void main(String[] args) {
        Arac a1 = new Arac();
        System.out.println("a1 = " + a1);

        a1.setModel("Volvo s80");
        a1.setRenk("inci beyaz");
        a1.setMotorHacmi(2000);
        a1.setYil(2015);
        System.out.println("a1 = " + a1);

        Arac a2=new Arac("sarı Serçe","Kan kırmızı",1300,1983);
        System.out.println("a2.getModel() = " + a2.getModel());//
        System.out.println("a2.getRenk() = " + a2.getRenk());//
        System.out.println("a2.getMotorHacmi() = " + a2.getMotorHacmi());//
        System.out.println("a2.getYil() = " + a2.getYil());//

        Arac a3=new Arac("Honda civic","kırmız",160,202);
        System.out.println("a3.getModel() = " + a3.getModel());//
        System.out.println("a3.getRenk() = " + a3.getRenk());//
        System.out.println("a3.getMotorHacmi() = " + a3.getMotorHacmi());//
        System.out.println("a3.getYil() = " + a3.getYil());//
        int sigortayıl=a2.getYil();
    }

}
