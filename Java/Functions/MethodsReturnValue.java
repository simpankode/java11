package Functions;

public class MethodsReturnValue {
    
    public static void main(String[] args) {
        
        System.out.println(addition(2));

        System.out.println(subtraction(7, 2));
    }

    static int addition(int x) {

        return 5 + x;
    }

    static int subtraction(int i, int j) {

        return i - j;
    }
}
