public class RecursiveFibonacciNumber {
    static int a = 0, b= 1, sum = a+b;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        recFibo(a, b);
    }
    public static void recFibo(int a, int b) {
        if (a + b < 1000) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
            recFibo(a,b);
        }
    }
}
