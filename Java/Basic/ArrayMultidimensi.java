package Basic;

/**
 * ArrayMultidimensi
 */
public class ArrayMultidimensi {

    public static void main(String[] args) {
        
        String[][] cars = {{"Alphard", "Fortuner"}, {"Pajero", "Ferrari", "Lamborghini"}};
        String toyotaSport = cars[0][1];
        System.out.println(toyotaSport);

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        int[][] number = {{1,2,3,4},{5,6,7,8,9,0}};
        int seven = number[1][2];
        System.out.println(seven);

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j]);
            }
        }
    }
}
