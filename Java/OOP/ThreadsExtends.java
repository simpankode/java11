package OOP;

public class ThreadsExtends extends Thread {
    
    public static void main(String[] args) {
        
        ThreadsExtends thread = new ThreadsExtends();
        thread.start();
        System.out.println("Extend outside");
    }
    public void run() {
        System.out.println("Extend running");
    }
}
