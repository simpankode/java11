package OOP;

//interface
interface Vegetable {

    public void colorRed();
    public void colorGreen();
}

class Tomato implements Vegetable {

    public void colorRed() {
        
        System.out.println("Tomato color Red");
    }

    public void colorGreen() {

        System.out.println("Tomato color Green");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        
        Tomato myTomato = new Tomato();
        myTomato.colorRed();
        myTomato.colorGreen();
    }
}
