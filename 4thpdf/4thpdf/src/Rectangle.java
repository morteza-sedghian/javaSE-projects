public class Rectangle {
    private int width, length;
    public void setWidth(int w) {
        width = w;
    }
    public void setLength(int l) {
        length = l;
    }
    public int calculateArea() {
        return width * length;
    }
    public int calculatePerimeter() {
        return (width + length) * 2;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(2);
        r1.setLength(5);

        System.out.println(r1.calculateArea());
        System.out.println(r1.calculatePerimeter());
    }
}