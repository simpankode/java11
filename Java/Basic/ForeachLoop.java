package Basic;

/**
 * ForeachLoop
 */
public class ForeachLoop {

    public static void main(String[] args) {
        
        int counter[] = {0,1,2,3,4,5,6,7,8,9};
        for (int num : counter) {
            
            System.out.println("Counter -> " + num);
        }

        String[] names = {"Prayoga", "Eka", "Ardiansyah"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
