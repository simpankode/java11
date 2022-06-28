package Basic;

/**
 * BreakContinue
 */
public class BreakContinue {

    public static void main(String[] args) {
        
        /**
         * For Break/Countinue
         */
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println("Counter -> " + i);
        }

        for (int j = 0; j < 10; j++) {
            if(j == 5){
                continue;
            }
            System.out.println("Counter -> " + j);
        }

        /**
         * While Break/Countinue
         */

        int a = 0;

        while(a < 10){
            if(a == 5){
                break;
            }
            System.out.println("Counter -> " + a);
            a++;
        }

        int b = 0;
        
        while(b < 10){
            if(b == 5){
                b++;
                continue;
            }
            System.out.println("Counter -> " + b);
            b++;
        }
    }
}
