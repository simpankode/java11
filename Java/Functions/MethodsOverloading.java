package Functions;

public class MethodsOverloading {
    
    public static void main(String[] args) {
        
        int num1 = additionInt(7, 5);
        System.out.println("Int: " + num1);

        double num2 = additionDouble(3.14, 2.5);
        System.out.println("Double: " + num2);
    }

    static int additionInt(int x, int y) {

        return x + y;
    }

    static double additionDouble(double i, double j) {

        return i + j;
    }
}
