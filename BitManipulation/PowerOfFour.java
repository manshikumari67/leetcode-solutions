public class PowerOfFour {
    boolean isPowerOfTwo(long n) {
          return ((n& (n-1))==0);
    }
    boolean isSquare(long n){
        long root=(long)(Math.sqrt(n));
        return (root*root==n);
    }
    int isPowerOfFour(long n){
        return (isPowerOfTwo(n) && isSquare(n))?1:0;
    }
}
