
package org.usfirst.frc.team9036.robot;


import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends SampleRobot {
    Joystick mainJoystick;
    RobotDrive myRobot;
    
    public Robot() {
    	mainJoystick = new Joystick(1);
        myRobot = new RobotDrive(new VictorSP(1), new VictorSP(3), new VictorSP(2), new VictorSP(4));
        myRobot.setExpiration(0.1);
    }
    
    public void robotInit() {
    }
    
    public void autonomous() {
    }
    
    public void operatorControl() {
    	myRobot.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
        	myRobot.arcadeDrive(mainJoystick);
        	Timer.delay(0.02);
        }
    }
    
    public void test() {
    }
}
