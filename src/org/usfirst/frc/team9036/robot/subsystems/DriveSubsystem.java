package org.usfirst.frc.team9036.robot.subsystems;

import org.usfirst.frc.team9036.robot.RobotMap;
import org.usfirst.frc.team9036.robot.commands.DriveJoystickCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    RobotDrive robotDrive = RobotMap.coreRobotDrive;

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveJoystickCommand());
    }
    
    public void start() {
    }
    
    public void stop() {
    	robotDrive.stopMotor();
    }
    
    public void arcadeDrive(Joystick joystick) {
    	robotDrive.arcadeDrive(joystick);
    }
}

