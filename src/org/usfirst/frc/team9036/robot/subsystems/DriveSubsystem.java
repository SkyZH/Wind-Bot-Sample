package org.usfirst.frc.team9036.robot.subsystems;

import org.usfirst.frc.team9036.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    RobotDrive robotDrive = RobotMap.coreRobotDrive;

    public void initDefaultCommand() {
    }
    
    public void start() {
    	robotDrive.drive(1, 0);
    }
    
    public void stop() {
    	robotDrive.drive(0, 0);
    }
}

