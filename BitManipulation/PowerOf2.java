public class PowerOf2 {
    public static boolean isPowerOf2(int n){
        return (n & (n-1)) == 0;
    }
}
