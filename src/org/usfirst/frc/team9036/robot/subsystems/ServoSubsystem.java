package org.usfirst.frc.team9036.robot.subsystems;

import org.usfirst.frc.team9036.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ServoSubsystem extends Subsystem {
	
	Servo servo = RobotMap.servo;
	
    public void initDefaultCommand() {
    }
    
    public void rotate(double degrees) {
    	servo.setAngle(degrees);
    }
    
    public double get() {
    	return servo.getAngle();
    }
}

