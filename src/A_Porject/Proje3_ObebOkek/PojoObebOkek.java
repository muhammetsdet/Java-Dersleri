package A_Porject.Proje3_ObebOkek;

public class PojoObebOkek {
    private int s1;
    private int s2;

    public PojoObebOkek() {
    }

    public PojoObebOkek(int s1, int s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return
                "s1=" + s1 +
                ", s2=" + s2 ;
    }
}
