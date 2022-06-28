/**
 * ThreadsExtended - OOP/ThreadsExtends.java
 * RunnableImplements - OOP/RunnableImplements.java
 */

package OOP;

public class Threads  extends Thread {

    public static int amount = 0;
    
    public static void main(String[] args) {
        
        Thread thread = new Thread();
        thread.start();

        //isAlive
        while (thread.isAlive()) {
            
            System.out.println("Waiting...");
        }

        System.out.println("Threads:" + amount);
        amount++;
        System.out.println("Threads:" + amount);
    }

    public void run() {
        amount++;
    }
}