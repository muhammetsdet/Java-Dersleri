package j32_Enum.enum02;

public class Runner {

    public static void main(String[] args) {

        User kl1= new User();
        kl1.name="vedat bey";
//        kl1.role=0; //Sıfır genel bir değerdir karıştırabiliriz o yüzden özel bir değer girilmeli
//        kl1.status=2;

            kl1.yetki=Role.ADMIN;
            kl1.durum=Status.ACTIVE;

            User kl2= new User();
        kl2.name="Abdi bey";
//        kl1.role=0; //Sıfır genel bir değerdir karıştırabiliriz o yüzden özel bir değer girilmeli
//        kl1.status=2;

            kl2.yetki=Role.ADMIN;
            kl2.durum=Status.INNACTIVE;

if (kl2.yetki==Role.ADMIN){

    System.out.println("Agam mühür sende sil de silelim...");

}else{
    System.out.println("Tee ellam ya sefil customer silmeye gelmiş.");
}


    if (kl1.yetki==Role.ADMIN){

        System.out.println("Agam mühür sende sil de silelim...");

    }else{
        System.out.println("Tee ellam ya sefil customer silmeye gelmiş.");
    }

}

}
