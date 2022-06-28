package OOP;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Lambda {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(50);
        num.add(20);
        num.add(75);
        num.add(80);

        num.forEach((n) -> {
            System.out.println(n);
        });

        //Consumer
        Consumer<Integer> consumer = (n) -> {
            System.out.println(n);
        };
        num.forEach(consumer);

        //string function
        StringFunction example1 = (s) -> s + "!";
        StringFunction example2 = (s) -> s + "?";
        printFormatted("PrayogaEa", example1);
        printFormatted("PutriAjeng", example2);
    }

    // StringFunction
    public static void printFormatted(String str, StringFunction format) {
        System.out.println(format.run(str));
    }
}
