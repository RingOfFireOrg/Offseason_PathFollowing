package frc.robot;

public class Point {

    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int setX(double x) {
        this.x = x;
        return x;
    }

    public int setY (double y) {
        this.y = y;
        return y;
    }
}