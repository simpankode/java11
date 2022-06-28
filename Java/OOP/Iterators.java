package OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {
        
        ArrayList<String> Cars = new ArrayList<String>();
        
        //add items
        Cars.add("Pajero");
        Cars.add("Fortuner");
        Cars.add("Ferrari");
        Cars.add("Lamborghini");
        System.out.println(Cars);
        
        //get iterator
        Iterator<String> itr = Cars.iterator();

        System.out.println(itr.next());

        //loop
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //remove
        Cars.remove("Lamborghini");
        System.out.println(Cars);
    }
}
