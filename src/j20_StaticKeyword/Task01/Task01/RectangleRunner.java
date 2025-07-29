package j20_StaticKeyword.Task01.Task01;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length = 5;
        dikdortgen.width = 4;

        System.out.println("Cevre="+ dikdortgen.Cevre());
        System.out.println("Alan="+ dikdortgen.Alan());
    }
}
