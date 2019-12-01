package frc.robot;

public class AutoStep {

    private AutoStepTypes stepType;

    private double[] stepParameters;

    private int maxStepParameters = 5;

    //since the step type is not known by the constructor or the class as a whole, there is a constructor for every combination of possible parameters of a given step
    public AutoStep (AutoStepTypes stepType) {
        this.stepType = stepType;
        stepParameters = new double[maxStepParameters];
        for (int i = 0; i < maxStepParameters ; i ++) {
            stepParameters[i] = 3459;
        }
    }

    public AutoStep (AutoStepTypes stepType, double stepParameter0) {
        this.stepType = stepType;
        stepParameters = new double[maxStepParameters];
        stepParameters[0] = stepParameter0;
        for (int i = 1; i < maxStepParameters ; i ++) {
            stepParameters[i] = 3459;
        }
    }

    public AutoStep (AutoStepTypes stepType, double stepParameter0, double stepParameter1) {
        this.stepType = stepType;
        stepParameters = new double[maxStepParameters];
        stepParameters[0] = stepParameter0;
        stepParameters[1] = stepParameter1;
        for (int i = 2; i < maxStepParameters ; i ++) {
            stepParameters[i] = 3459;
        }
    }

    public AutoStep (AutoStepTypes stepType, double stepParameter0, double stepParameter1, double stepParameter2) {
        this.stepType = stepType;
        stepParameters[] = new double[maxStepParameters];
        stepParameters[0] = stepParameter0;
        stepParameters[1] = stepParameter1;
        stepParameters[2] = stepParameter2;
        for (int i = 3; i < maxStepParameters ; i++) {
            stepParameters[i] = 3459;
        }
    }

    public AutoStep (AutoStepTypes stepType, double stepParameter0, double stepParameter1, double stepParameter2, double stepParameter3) {
        this.stepType = stepType;
        stepParameters[] = new double[maxStepParameters];
        stepParameters[0] = stepParameter0;
        stepParameters[1] = stepParameter1;
        stepParameters[2] = stepParameter2;
        stepParameters[3] = stepParameter3;
        for ( int i = 4 ; i<maxStepParameters ; i ++) {
            stepParameters[i] = 3459;
        }
    }

    public AutoStep (AutoStepTypes stepType, double stepParameter0, double stepParameter1, double stepParameter2, double stepParameter3, double stepParameter4) {
        this.stepType = stepType;
        stepParameters[] = new double[maxStepParameters];
        stepParameters[0] = stepParameter0;
        stepParameters[1] = stepParameter1;
        stepParameters[2] = stepParameter2;
        stepParameters[3] = stepParameter3; 
        stepParameters[4] = stepParameter4;
        for (int i = 5 ; i < maxStepParameters ; i ++) {
            stepParameters[i] = 3459;
        }
    }

    public AutoStepTypes getStepType () {
        return stepType;
    }

    //will return true if the step is complete
    public boolean executeStep() {
        boolean stepCompleted = false;
        switch stepType {
            case AutoStepTypes.ORIENT_ROBOT:
            stepCompleted = orientRobot(stepParameters[0]);
            case AutoStepTypes.DRIVE_ROBOT:
            stepCompleted = driveRobot(stepParameters[0], stepParameters[1], stepParameters[2]);
            case AutoStepTypes.SET_ARM_ANGLE:
            stepCompleted = setArmAngle(stepParameters[0]);
        }
    }

    //the methods for a given type of step which can be performed are below
    //each step must also be filled into the switch above, as well as added to the enum AutoStepTypes
    //each method must close itself with a logic statement which will be true if this step should be considered complete
    public boolean orientRobot(int direction) {
        return false;
    }

    public boolean driveRobot(int goalX, int goalY) {
        return false;
    }

    public boolean setArmAngle(int armAngle) {
        return false;
    }
}

//the possible types of steps which the robot can perform as part of an auto run which are currently in the system
public enum AutoStepTypes {
    ORIENT_ROBOT,
    DRIVE_ROBOT,
    SET_ARM_ANGLE;
}