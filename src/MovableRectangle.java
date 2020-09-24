public class MovableRectangle extends Rectangle implements Movable {
    public MovableRectangle(Point rightTop, Point leftBottom) {
        super(rightTop, leftBottom);
    }



    @Override
    public void move(int x, int y) {
        try{((MovablePoint) getRightTop()).move(x,y);
        ((MovablePoint) getLeftBottom()).move(x,y);}
        catch(Exception e){
            int lx =getLeftBottom().getX()+x ;
            int ly =getLeftBottom().getY()+y;
            int rx =getRightTop().getX() +x;
            int ry =getRightTop().getY()+y;

            setLeftBottom(new Point(lx,ly));
            setRightTop(new Point(rx,ry));

        }
    }
}
