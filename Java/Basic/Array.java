package Basic;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        
        String[] cars = {"Fortuner", "Pajero", "Ferrari", "Lamborghini"};
        System.out.println(cars[2]);

        cars[0] = "Alphard";
        System.out.println(cars[0]);

        System.out.println(cars.length);

        int[] number = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(number[4]);
        System.out.println(number.length);
    }
}
