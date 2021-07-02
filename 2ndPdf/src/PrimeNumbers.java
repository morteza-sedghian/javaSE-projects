public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("using for:");
        for (int num1 = 0; num1 < 20; num1++) {
            if (isPrimeWithFor(num1))
                System.out.println(num1);
        }
        System.out.println("\nusing while:");
        for (int num2 = 0; num2 < 20; num2++) {
            if (isPrimeWithWhile(num2))
                System.out.println(num2);
        }
        System.out.println("\nusing do while:");
        for (int num3 = 0; num3 < 20; num3++) {
            if (isPrimeWithDoWhile(num3))
                System.out.println(num3);
        }
    }

    public static boolean isPrimeWithFor(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= (number/2); i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static boolean isPrimeWithWhile(int number) {
        if (number < 2)
            return false;
        int j =2;
        while (j <= (number/2)) {
            if (number % j == 0)
                return false;
            j++;
        }
        return true;
    }
    public static boolean isPrimeWithDoWhile(int number) {
        if (number < 2)
            return false;
        int j =2;
        do {
            if (number % j == 0)
                return false;
            j++;
        } while (j < (number/2));
        return true;
    }
    public static void printPrime(int number) {

    }
}
