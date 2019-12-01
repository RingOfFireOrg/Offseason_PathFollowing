package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Autonomous() {

    private boolean autonomousRunning;
    private int autonomousStep = 0;

    private 

    public Autonomous () {
        private SendableChooser<AutonomousModes> autonomousMode = new SendableChooser<>;
        autonomousMode.addObject("leftAutonomous", AutonomousModes.LEFT_AUTONOMOUS);
        autonomousMode.addObject("rightAutonomous", AutonomousModes.RIGHT_AUTONOMOUS);
        SmartDashboard.putData("autonomous", autonomousMode);
        autonomousRunning = false;
    }

    public boolean runAutonomous() {
        autonomousRunning = true;
        switch autonomousMode.getData() {
            case LEFT_AUTONOMOUS:
            switch autonomousStep {
                case 0:
                if ()
                case 1:

                case 2:

                case 3:
                //exit autonomous
                
            }
            case RIGHT_AUTONOMOUS:

            break;
        }
        

    }

    
}