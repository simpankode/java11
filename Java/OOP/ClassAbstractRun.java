package OOP;

public class ClassAbstractRun {
    
    public static void main(String[] args) {
        
        ClassAbstractSub obj = new ClassAbstractSub();

        System.out.println("Name:" + obj.name);
        System.out.println("Age:" + obj.age);
        System.out.println("Year:" + obj.year);

        obj.abstractMethod();
    }
}