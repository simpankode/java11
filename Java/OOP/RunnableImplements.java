package OOP;

public class RunnableImplements implements Runnable {
    
    public static void main(String[] args) {
        RunnableImplements object = new RunnableImplements();
        Thread thread = new Thread(object);
        thread.start();
        System.out.println("Runnable outside");
    }

    public void run() {
        System.out.println("Runnable running");
    }
}
