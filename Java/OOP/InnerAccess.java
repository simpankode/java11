package OOP;

class OuterClass {

    int x = 10;

    class InnerClass {
        
        public int innerMethod() {
            return x;
        }
    }
}

public class InnerAccess {
    
    public static void main(String[] args) {
        
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.innerMethod()); //10
    }
}
