package j20_StaticKeyword.Task01.Task01;

public class Rectangle {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
     int width ;
     int length;


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getPerimeter() {
        return 2*(width+length);
    }
    public int getArea() {
        return width*length;
    }

}
