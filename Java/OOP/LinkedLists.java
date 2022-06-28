package OOP;

import java.util.LinkedList;

public class LinkedLists {
    
    public static void main(String[] args) {
        
        LinkedList<String> Fruits = new LinkedList<String>();
        
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Cherry");
        Fruits.add("Grape");
        Fruits.add("Lemon");

        System.out.println("Fruits: " + Fruits);

        //addfirst
        Fruits.addFirst("Orange");
        System.out.println("Fruits: " + Fruits);

        //addlast
        Fruits.addLast("Mango");
        System.out.println("Fruits: " + Fruits);

        //removefirst
        Fruits.removeFirst();
        System.out.println("Fruits: " + Fruits);

        //removelast
        Fruits.removeLast();
        System.out.println("Fruits: " + Fruits);

        //getfirst
        
        System.out.println("Fruits: " + Fruits.getFirst());

        //getlast
        System.out.println("Fruits: " + Fruits.getLast());
    }
}
