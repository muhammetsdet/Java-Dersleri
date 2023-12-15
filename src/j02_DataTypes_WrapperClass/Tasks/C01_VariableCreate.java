package j02_DataTypes_WrapperClass.Tasks;

public class C01_VariableCreate {
    /*Variable
  bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
  Variable icinde deger saklayan bir container'dir
  bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
 örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
 geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
 *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
 */
    public static void main(String[] args) {
        //int myAge= 29;
        //int mySalary=35000;
        //System.out.println(myAge);
        //System.out.println(mySalary);
        //System.out.println("myAge = " + myAge);
        //System.out.println("mySalary = " + mySalary);
        //System.out.println("myAge : " + myAge + " and " + "mySlary :" +mySalary);
        //int myHeight=173;
        //System.out.println(myHeight);
        int myAge=29, mySalary=35000, myHeight=173;
        System.out.println(myAge +"= My age "+ mySalary +"= My salary "+ myHeight + "= My height");
        int yas = 54;
        yas=35;
        System.out.println("myNewAge is :" + yas);
    }


}
