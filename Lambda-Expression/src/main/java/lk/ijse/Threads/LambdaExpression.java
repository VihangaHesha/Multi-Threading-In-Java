package lk.ijse.Threads;

public class LambdaExpression {
    public static void main(String[] args) {

        Thread thread1 = new Thread( () ->{
            for (int i = 0 ; i <=4 ; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("One .");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0 ; i <= 4; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Two..");
            }
        });

        thread1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}