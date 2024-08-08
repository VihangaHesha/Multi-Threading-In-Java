package lk.ijse.Threads;

class One implements Runnable{
    @Override
    public void run(){
        for (int i =0 ; i <= 8; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("One .");
        }
    }
}
class Two implements Runnable{
    @Override
    public void run(){
        for (int i = 0 ; i <=4 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Two ..");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        One one = new One();// we can do this part like this way too! -> Runnable one = new One();
        Two two = new Two();// we can do this part like this way too! -> Runnable two = new Two();
        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);

        threadOne.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadTwo.start();
    }
}