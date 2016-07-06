
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
    Servo servo;
    
    public Robot() {
    	servo = new Servo(1);
    }
    
    public void robotInit() {
    }
    
    public void autonomous() {
    	servo.setAngle(180);
    }
    
    public void operatorControl() {
        while (isOperatorControl() && isEnabled()) {
        }
    }
    
    public void test() {
    }
}
