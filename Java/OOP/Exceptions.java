package OOP;

public class Exceptions {

    //cekAge
    static void cekAge(int age) {
        if(age <= 17) {
            throw new ArithmeticException("Umur kurang dari 17");
        }else{
            System.out.println("Umur lebih dari 17");
        }
    }
    
    public static void main(String[] args) {
        
        //try catch
        try {
            int[] num = {1,2,3};
            System.out.println(num[10]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        //finally
        try {
            int[] num = {1,2,3};
            System.out.println(num[10]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finally");
        }

        //cekAge
        try {
            cekAge(18);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
    }
}
