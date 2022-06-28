package OOP;

public class Modifiers {

    //static method
    static void staticMethod() {
        System.out.println("static method");
    }

    //public method
    public void publicMethod() {
        System.out.println("public method");
    }
    
    public static void main(String[] args) {
        
        //static method
        staticMethod();

        //public method
        Modifiers obj = new Modifiers();
        obj.publicMethod();
    }
}