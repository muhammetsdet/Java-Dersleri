package j26_Abstract.Abstract02;

public abstract class Food {
    // grand-parent abs. Class
    public abstract void madeIn();// abs meth
    public abstract void taste();// abs meth

    String name;

   @Override
   public String toString() {
       return
               "name='" + name ;
   }
}
