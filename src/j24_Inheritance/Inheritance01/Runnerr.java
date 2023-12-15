package j24_Inheritance.Inheritance01;

public class Runnerr {
      /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir
*/
      public static void main(String[] args) {
          Animal h1 =new Animal();
          h1.hareket();
          h1.beslenme();
          h1.icme();

          Paluk b1 =new Paluk();
          b1.izgaraTava();
          b1.hareket();
          b1.beslenme();
          b1.icme();

          Memeli m1=new Memeli();
          m1.sutBeslen();
          m1.dogum();
          m1.hareket();

          Koyun g1=new Koyun();
          g1.semir();
          g1.hareket();
          g1.icme();
          g1.sutBeslen();


      }


}
