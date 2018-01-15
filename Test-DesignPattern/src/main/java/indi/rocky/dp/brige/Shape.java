package indi.rocky.dp.brige;

public abstract class Shape {
    protected CircleDrawAPI circleDrawAPI;

    protected Shape(CircleDrawAPI circleDrawAPI) {
        this.circleDrawAPI = circleDrawAPI;
    }

    public abstract void draw();

}
