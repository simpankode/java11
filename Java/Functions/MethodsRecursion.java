package Functions;

public class MethodsRecursion {
    
    public static void main(String[] args) {
        
        int x = sum1(9);
        System.out.println(x); // 45 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9

        int y = sum2(5, 10);
        System.out.println(y);
    }

    public static int sum1(int k) {
        
        if(k > 0) {
            return k + sum1(k - 1);
        }else {
            return 0;
        }
    }

    public static int sum2(int start, int end) {
        
        if(end > start) {
            return end + sum2(start, end - 1);
        }else {
            return end;
        }
    }
}
