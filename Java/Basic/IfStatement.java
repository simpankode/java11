package Basic;

/**
 * IfStatement
 */
public class IfStatement {

    public static void main(String[] args) {
        
        int time = 20;

        if(time < 12){
            System.out.println("Good Morning");
        }else if(time < 18){
            System.out.println("Good Afternoon");
        }else{
            System.out.println("Good Night");
        }

        /**
         * Operator Ternary
         */
        int times = 20;
        String day = (times < 12) ? "Good day" : "Good Evening";
        System.out.println(day);
    }
}
