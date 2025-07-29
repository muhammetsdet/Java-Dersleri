package j20_StaticKeyword.Task01.Task01;

public class Rectangle {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
     int width ;
     int length;

    public int Cevre()
    {
        return (width+length)*2;
    }

    public int Alan()
    {
        return (width*length);
    }
}
