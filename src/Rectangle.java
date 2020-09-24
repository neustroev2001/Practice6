public class Rectangle {
    private Point rightTop;
    private Point leftBottom;

    public Rectangle(Point rightTop, Point leftBottom) {
        this.rightTop = rightTop;
        this.leftBottom = leftBottom;
    }

    public Point getRightTop() {
        return rightTop;
    }


    public Point getLeftBottom() {
        return leftBottom;
    }

    public void setRightTop(Point rightTop) {
        this.rightTop = rightTop;
    }

    public void setLeftBottom(Point leftBottom) {
        this.leftBottom = leftBottom;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rightTop=" + rightTop +
                ", leftBottom=" + leftBottom +
                '}';
    }
}
