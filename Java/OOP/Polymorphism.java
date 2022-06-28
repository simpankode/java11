package OOP;

class Fruits {
    public void color() {
        System.out.println("Fruits Color"); 
    }
}

class Apple extends Fruits {
    public void color() {
        System.out.println("Apple Green");
    }
}

class Cherry extends Fruits {
    public void color() {
        System.out.println("Cherry Red");
    }
}

public class Polymorphism {
    
    public static void main(String[] args) {
        
        Fruits fruit = new Fruits(); //Fruits is the parent class
        fruit.color();
        
        Fruits apple = new Apple(); //Apple is the child class
        apple.color();
        
        Fruits cherry = new Cherry(); //Cherry is the child class
        cherry.color();
    }
}
