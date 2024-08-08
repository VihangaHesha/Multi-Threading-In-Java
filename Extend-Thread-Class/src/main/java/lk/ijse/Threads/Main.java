package lk.ijse.Threads;
class One extends Thread{
    public void run(){
        for (int i =0 ; i <= 4 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("One");
        }
    }
}
class Two extends Thread{
    public void run(){
        for (int i = 0 ; i <= 4 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Two");
        }
    }
}
public class Main {
    public static void main(String[] args)   {
        One one = new One();
        Two two = new Two();
        one.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        two.start();
    }
}