import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        long area = width*length;
        System.out.println(area);
        scanner.close();
    }
}
