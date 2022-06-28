package OOP;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayManipulations {
    
    public static void main(String[] args) {
        
        ArrayList<String> Motor = new ArrayList<String>();

        Motor.add("Honda");
        Motor.add("Yamaha");
        Motor.add("Suzuki");
        Motor.add("Kawasaki");

        System.out.println("Motor : " + Motor);

        //forloop
        for (int i = 0; i < Motor.size(); i++) {
            System.out.println(Motor.get(i));
        }

        //foreachloop
        for (String j : Motor) {
            System.out.println(j);
        }

        //sort an arraylist
        Collections.sort(Motor);

        for (String j : Motor) {
            System.out.println(j);
        }

        /**
         * ---------------------------------
         *  Other Types of Array
         * ---------------------------------
         */

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(40);
        num.add(20);
        num.add(30);

        for (Integer in : num) {
            System.out.println(in);
        }

        //sort an arraylist 
        Collections.sort(num);

        for (Integer in : num) {
            System.out.println(in);
        }
    }
}
