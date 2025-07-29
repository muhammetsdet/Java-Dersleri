package j20_StaticKeyword.Task01.Task04;

import java.util.Scanner;

public class RunnerBisiklet {
    public static void main(String[] args) {
        Bisiklet bisiklet = Bisiklet.bisikletOlsutur();
        Scanner oku = new Scanner(System.in);
        int secim ;
        do {
            Bisiklet.menuYaz();
            secim = oku.nextInt();
            Bisiklet.islemYap(bisiklet, secim);
        } while (secim < 5);
    }
}