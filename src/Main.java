public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(3,3), new Point(6,6));
        System.out.println(rectangle);
        MovableRectangle rectangle1 = new MovableRectangle(new Point(3,3), new Point(6,6));
        rectangle1.move(3,3);
        System.out.println(rectangle1);
    }
}
