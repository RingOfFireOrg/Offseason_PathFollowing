package frc.robot;

public class moveToPoint {

    double goalX, goalY, goalAngle;

    public moveToPoint(double goalX, double goalY, double goalAngle) {
        this.goalX = goalX;
        this.goalY = goalY;
        this.goalAngle = goalAngle;
    }

    public moveToPoint(double goalX, double goalY) {
        this.goalX = goalX;
        this.goalY = goalY;
        this.goalAngle = null;
    }

    



}