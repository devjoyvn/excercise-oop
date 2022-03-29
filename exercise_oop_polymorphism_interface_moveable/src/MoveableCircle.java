public class MoveableCircle implements Moveable{

    private MoveablePoint center;
    private double radius;

    public MoveableCircle(MoveablePoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.setX(this.center.getX() + this.center.getxSpeed());
    }

    @Override
    public void moveDown() {
        this.center.setX(this.center.getX() - this.center.getxSpeed());
    }

    @Override
    public void moveLeft() {
        this.center.setY(this.center.getY() - this.center.getySpeed());
    }

    @Override
    public void moveRight() {
        this.center.setY(this.center.getY() + this.center.getySpeed());
    }

    @Override
    public String toString() {
        return "Center: " + "(" + this.center.getX() + ", "+  this.center.getY() + ")";
    }
}
