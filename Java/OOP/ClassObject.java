package OOP;

//class
public class ClassObject {

    int i = 5;
    
    public static void main(String[] args) {
        
        //object
        ClassObject object = new ClassObject();
        System.out.println(object.i);

        //multiple object
        ClassObject object1 = new ClassObject();
        ClassObject object2 = new ClassObject();
        System.out.println(object1.i);
        System.out.println(object2.i);
    }
}