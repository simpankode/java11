package OOP;

public class Inheritance {
    
    protected String name = "Fortuner";

    public void color() {
        System.out.println("White");
    }

}

class Car extends Inheritance {

    private String color = "White";

    public static void main(String[] args) {
        
        //call color() method from Inheritance class
        Car car = new Car();
        car.color();

        System.out.println("Name: " + car.name + "\nColor: " + car.color);
    }
}