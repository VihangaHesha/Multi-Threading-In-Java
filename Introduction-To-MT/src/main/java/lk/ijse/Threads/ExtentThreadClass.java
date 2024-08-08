package lk.ijse.Threads;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running!");
    }
}

public class ExtentThreadClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("This is main thread");
    }
}