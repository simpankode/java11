package OOP;

public class Constructors {

    int x;
    
    //constructors
    public Constructors() {

        x = 5;
    }

    //constructors parameters
    public Constructors(int y) {

       x = y;
    }

    //contoh
    String name;
    int age;

    public Constructors(String nama, int umur) {

        name = nama;
        age = umur;
    }

    public static void main(String[] args) {
        
        //constructors
        Constructors number = new Constructors();
        System.out.println(number.x); //5

        //constructors parameters
        Constructors numberParameter = new Constructors(5);
        System.out.println(numberParameter.x); //5

        //contoh
        Constructors myProfile = new Constructors("prayogaea", 21);
        System.out.println("Nama: " + myProfile.name + "\nUmur: " + myProfile.age);
    }
}
