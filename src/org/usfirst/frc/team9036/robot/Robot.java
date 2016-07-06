
package org.usfirst.frc.team9036.robot;


import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends SampleRobot {
    RobotDrive myRobot;
    
    public Robot() {
        myRobot = new RobotDrive(new VictorSP(1), new VictorSP(3), new VictorSP(2), new VictorSP(4));
        myRobot.setExpiration(0.1);
    }
    
    public void robotInit() {
    }
    
    public void autonomous() {
        myRobot.setSafetyEnabled(false);
        myRobot.drive(1.0, 0);
        Timer.delay(2);
        myRobot.drive(0, 0);
        Timer.delay(2);
        myRobot.drive(1.0, 0);
        Timer.delay(2);
        myRobot.drive(0, 0);
    }

    /**
     * Runs the motors with arcade steering.
     */
    public void operatorControl() {
        myRobot.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
        }
    }

    /**
     * Runs during test mode
     */
    public void test() {
    }
}
