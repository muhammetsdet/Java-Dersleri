package j08_Loops.WhileLoops.WhileLoops_Tasks;

/*
    task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
     */
public class Task04 {
    public static void main(String[] args) {
        int num = 1000;
        int sum = 1;
        while (num > 100) {
            if (num % 12 == 0) {
                System.out.print(sum + ".= ");
                sum++;
                System.out.print(num + " ");
            }
            num--;
        }
        System.out.println(num + " ");
    }
//Sonda aldığım 99 sayısı nerden geldi?

}

