package indi.rocky.dp.brige;

public class Shape_Cricle extends Shape {

    private int radius;

    public Shape_Cricle(int raduis, CircleDrawAPI circleDrawAPI) {
        super(circleDrawAPI);
        this.radius = raduis;
    }

    @Override
    public void draw() {
        circleDrawAPI.drawCircle(radius);
    }
}
