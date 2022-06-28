package OOP;

public class ClassMethods {

    static void myMethods() {
        System.out.println("Hello, Methods");
    }

    //static methods
    static void myStaticMethod(String s) {

        System.out.println(s + " Methods");
    }

    //non static methods
    public void myPublicMethod(String p) {
        
        System.out.println(p + " Methods");
    }

    public static void main(String[] args) {
        
        myMethods();

        //static
        myStaticMethod("Static");

        //non static
        ClassMethods publicMethod = new ClassMethods();
        publicMethod.myPublicMethod("Public");
    }
}
