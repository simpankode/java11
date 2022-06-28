package Basic;

/**
 * ArrayLoop
 */
public class ArrayLoop {

    public static void main(String[] args) {
        
        String[] cars = {"Fortuner", "Pajero", "Ferrari", "Lamborghini"};

        /**
         * For
         */
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        /**
         * Foreach
         */
        for (String j : cars) {
            System.out.println(j);
        }
    }
}
