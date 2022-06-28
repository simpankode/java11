package OOP;

public class ClassAtributes {
    
    //attribute
    int x = 10;

    public static void main(String[] args) {
        
        ClassAtributes attribute = new ClassAtributes();
        System.out.println(attribute.x);

        //modify attribute
        attribute.x = 20;
        System.out.println(attribute.x);
    }
}
