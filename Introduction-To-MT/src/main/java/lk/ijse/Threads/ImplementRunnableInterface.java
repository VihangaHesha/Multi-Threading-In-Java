package lk.ijse.Threads;

class MyThreadR implements Runnable{
    @Override
    public void run (){
        System.out.println("This is Runnable interface!");
    }
}
public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyThreadR myThreadR = new MyThreadR();
        Thread thread = new Thread(myThreadR);
        thread.start();
    }
}
