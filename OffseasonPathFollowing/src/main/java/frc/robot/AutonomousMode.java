package frc.robot;

public class AutonomousMode {

    int autonomousSteps;
    AutoStep stepChain;
    public AutonomousMode (int autonomousSteps) {
        this.autonomousSteps = autonomousSteps;
        stepChain = new AutoStep[autonomousSteps];
    }
    public void writeStep () {
        
    }
}