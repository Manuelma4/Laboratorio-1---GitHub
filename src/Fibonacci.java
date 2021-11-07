public class Fibonacci {
    public static int function(int n){
        int i = 1, x = 0, y = 1, sum = 0;
        while (i <= n) {
            System.out.print(x + " ");
            sum = x + y;
            x = y;
            y = sum;
            i++;
        }
        return sum;
    }
}