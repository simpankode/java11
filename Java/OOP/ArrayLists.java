package OOP;

import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args) {
        
        ArrayList<String> Mobil = new ArrayList<String>();

        // add items to the arraylist
        Mobil.add("Toyota");
        Mobil.add("Mitsubishi");
        Mobil.add("Honda");
        Mobil.add("Suzuki");
        Mobil.add("Nissan");
        Mobil.add("Daihatsu");
        Mobil.add("Mazda");
        Mobil.add("Hyundai");

        System.out.println("Mobil : " + Mobil);

        // access items in the arraylist
        System.out.println("Mobil : " + Mobil.get(0));
        System.out.println("Mobil : " + Mobil.get(1));
        System.out.println("Mobil : " + Mobil.get(2));
        System.out.println("Mobil : " + Mobil.get(5));

        // change items in the arraylist
        System.out.println("Mobil : " + Mobil.set(1, "Nissan"));
        System.out.println("Mobil : " + Mobil);

        // remove items from the arraylist
        System.out.println("Mobil : " + Mobil.remove(2));
        System.out.println("Mobil : " + Mobil);

        // clear the arraylist
        Mobil.clear();
        System.out.println("Mobil : " + Mobil);

        // size of the arraylist
        System.out.println("Mobil : " + Mobil.size());
    }
}
