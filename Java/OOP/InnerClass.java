package OOP;

import OOP.OutNerClass.InNerClass;

//inner class
class OutClass {
    
    int x = 10;

    class InClass {
        int y = 5;
    }
}

//static inner class
class OutNerClass {

    int x = 7;

    static class InNerClass {
        int y = 5;
    }
}

public class InnerClass {
    
    public static void main(String[] args) {
        
        //inner class
        OutClass out = new OutClass();
        OutClass.InClass in = out.new InClass();
        System.out.println(in.y + out.x); //15

        //static inner class
        //static kelas dalam tidak memiliki akses ke anggota kelas luar.
        OutNerClass OutNer = new OutNerClass();
        InNerClass InNer = new InNerClass();
        System.out.println(InNer.y + OutNer.x); //12

    }
}
