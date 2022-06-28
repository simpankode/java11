package Basic;

/**
 * Math
 */
public class MathJava {

    public static void main(String[] args) {
        
        System.out.println(Math.max(5, 10)); //10
        System.out.println(Math.min(5, 10)); //5
        System.out.println(Math.sqrt(64));   //8.0
        System.out.println(Math.abs(-4.7));  //4.7
        System.out.println(Math.random());   //random
        
        //random
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
    }
}
