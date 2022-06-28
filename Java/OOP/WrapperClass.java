/**
 * Tidak Valid
 * ArrayList<int> Numbers = new ArrayList<int>();
 * 
 * Valid
 * ArrayList<Integer> Numbers = new ArrayList<Integer>();
 */

package OOP;

public class WrapperClass {
    
    public static void main(String[] args) {
        
        //crate wrapper object
        Integer num = 10;
        Double pi = 3.14;
        Character nama = 'A';

        System.out.println(num);
        System.out.println(pi);
        System.out.println(nama);

        System.out.println(num.intValue());
        System.out.println(pi.doubleValue());
        System.out.println(nama.charValue());
        
        Integer number = 100;
        String text = number.toString();
        System.out.println(text);
        System.out.println(text.length());
    }
}
