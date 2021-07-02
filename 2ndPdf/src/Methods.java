public class Methods {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;

        double sum = add(x,y);
        System.out.println(sum);
        simple();
    }
    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }
    public static void simple() {
        System.out.println(";-)");
    }
}
