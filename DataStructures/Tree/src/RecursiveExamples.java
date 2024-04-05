public class RecursiveExamples {
    public static void main(String[] args) {
        int x = 5;
        // 5! => 5 * 4 * 3 * 2 * 1 => 5 * 4! => 5 * 4 * 3!
        // n! => n * (n-1 ) * (n-2)... .... 1 => n * (n-1)!
        int result = 1;
        for(int i= x; i > 0; i --){
            result = result * i;

        }

        System.out.println(result);

        System.out.println(fact(5));
    }

    public static int fact(int n){
        if( n==1) {
            return 1;
        }
        return n * fact(n-1);
    }

    public static long power(int base, int n){
        if( n == 0){
            return 1;
        }
        return base * power(base, n-1);
    }
    // if you call 3 to power of 3 .... it calls 3 * (3

    //https://stackoverflow.com/questions/19590242/finding-max-value-in-an-array-using-recursion
    public static int findMax(int[] a) {
        return findMax(a, 0);
    }
    private static int findMax(int[] a, int i) {
        return i < a.length
                ? Math.max(a[i], findMax(a, i + 1))
                : Integer.MIN_VALUE;
    }

    public static long fibo(long n){
        //fibo(7) = 0, 1, 1, 2, 3, 5, 8 =>
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
