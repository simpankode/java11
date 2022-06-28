package Basic;

/**
 * Operator
 */
public class Operator {

    public static void main(String[] args) {
        
        /**
         * Operator Aritmatika
         * 
         * Addition         [ + ]
         * Subtraction      [ - ]
         * Multiplication   [ * ]
         * Division         [ / ]
         * Modulus          [ % ]
         * Increment        [ ++ ]
         * Decrement        [ -- ]
         */
        

        /**
         * Operator Penugasan
         * 
         *  =   [x = 5] [x = 5]
         *  +=   [x += 5] [x += 5] 
         *  -=   [x -= 5] [x -= 5] 
         *  *=   [x *= 5] [x *= 5] 
         *  /=   [x /= 5] [x /= 5] 
         *  %=   [x %= 5] [x %= 5]
         */

        /**
         * Operator Perbandingan
         * 
         * ==   [x == y]
         * ===   [x === y]
         * !=   [x != y]
         *  >   [x > y]
         *  <   [x < y]
         * >=   [x >= y]
         * <=   [x <= y]
         */

        /**
         * Operator Logika
         * 
         * &&   [x > 5 && x < 10]
         * ||   [x > 5 || x < 10]
         * !   !(x < 5 && x < 10)
         */
        
        /**
         * Operator Ternary
         */
        int time = 20;
        String day = (time < 12) ? "Good day" : "Good Evening";
        System.out.println(day);
    }
}
