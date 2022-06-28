package OOP;

abstract class ClassAbstract {

    public String name = "prayogaea";
    public int age = 21;

    //abstract method
    public abstract void abstractMethod();
}

//subclass
class ClassAbstractSub extends ClassAbstract {

    public int year = 2022;
    public void abstractMethod() {
        System.out.println("abstract method");
    }
}

