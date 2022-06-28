package OOP;

public class Encapsulation {
    
    //private String name;
    private String name;

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        

        Encapsulation obj = new Encapsulation();
        obj.setName("prayogaea");
        System.out.println("name: " + obj.getName());
    }
}
