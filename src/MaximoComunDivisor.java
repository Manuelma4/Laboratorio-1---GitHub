public class MaximoComunDivisor {
    public static int MCD(int x, int y){
        if (y == 0) return x;
        return MCD(y, x % y);
    }
}
